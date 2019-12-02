package com.zking.ssm.service;

import com.zking.ssm.model.News;
import com.zking.ssm.vo.NewsVo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class INewsServiceTest extends BaseTestCase {
    @Autowired
    private INewsService newsService;
    private News news;
    private NewsVo newsVo;

    @Override
    public void before() {
        super.before();
        news = new News();
        newsVo = new NewsVo();
    }

    @Test
    public void loadCasecode() throws Exception {
        news.setNewsId(1);
        News n = newsService.loadCasecode(this.news);
        System.out.println(n);
        System.out.println(n.getCategoryList());
    }

    @Test
    public void add() throws Exception {
        newsVo.setNewsId(1);
        newsVo.setCategoryId(1);
        newsService.add(newsVo);
    }

    @Test
    public void remove() throws Exception {
        newsVo.setNewsId(1);
        newsVo.setCategoryId(1);
        newsService.remove(newsVo);
    }

    @Test
    public void del() throws Exception {
        newsVo.setNewsId(2);
        newsService.del(newsVo);
    }
}