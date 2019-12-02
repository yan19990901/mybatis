package com.zking.ssm.util;

import java.io.Serializable;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public class PageBean implements Serializable {

    private static final long serialVersionUID = -2009310785602936718L;

    private int page = 1;//页码数
    private int rows = 2;//行数
    private int total = -1;//总记录数

    private boolean pagination = true;

    private String url;
    private Map<String, String[]> parameterMap;

    public void setRequest(HttpServletRequest req) {
        String page = req.getParameter("page");
        String rows = req.getParameter("rows");
        String pagination = req.getParameter("pagination");
        this.setPage(page);
        this.setRows(rows);
        this.setPagination(pagination);

        this.url = req.getContextPath() + req.getServletPath();
        this.parameterMap = req.getParameterMap();//把请求发来的值保存，用于二次请求
//		System.err.println(this.url);
//		System.err.println(req.getParameterMap());
    }

    public String getUrl() {
        return url;
    }

    public Map<String, String[]> getParameterMap() {
        return parameterMap;
    }

    public boolean isPagination() {
        return pagination;
    }

    public void setPagination(boolean pagination) {
        this.pagination = pagination;
    }

    public void setPagination(String pagination) {
        if ("false".equals(pagination)) {
            this.pagination = false;
        }
        ;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setPage(String page) {
        if (null != page) {
            this.page = Integer.parseInt(page);
        }
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public void setRows(String rows) {
        if (null != rows) {
            this.rows = Integer.parseInt(rows);
        }
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setTotal(String total) {
        this.total = Integer.valueOf(total) == 0 ? 1 : Integer.valueOf(total);
    }

    /**
     * 获取起始页数
     *
     * @return
     */

    public int getStartIndex() {
        return (page - 1) * rows;
    }

    //上一页
    public int getPreviousPage() {
        return this.page - 1 < 1 ? 1 : this.page - 1;
    }

    //下一页
    public int getNext() {
        return this.page + 1 > getMaxPage() ? getMaxPage() : this.page + 1;
    }

    //最大页
    public int getMaxPage() {
        return this.total % this.rows > 0 ? this.total / this.rows + 1 : this.total / this.rows;
    }

    @Override
    public String toString() {
        return "PageBean [page=" + page + ", rows=" + rows + ", total=" + total + ", pagination=" + pagination + "]";
    }

}
