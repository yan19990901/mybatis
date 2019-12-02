package com.zking.ssm.service.impl;

import com.zking.ssm.mapper.NewsMapper;
import com.zking.ssm.model.News;
import com.zking.ssm.service.INewsService;
import com.zking.ssm.vo.NewsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewsServiceImpl implements INewsService {
    @Autowired
    private NewsMapper newsMapper;

    @Override
    public News loadCasecode(News news) {
        return newsMapper.loadCasecode(news);
    }

    @Override
    public int add(NewsVo newsVo) {
        return newsMapper.addCategory(newsVo);
    }

    @Override
    public int remove(NewsVo newsVo) {
        return newsMapper.removeCategory(newsVo);
    }

    @Override
    public int del(News news) {
        newsMapper.deleteNewsCategory(news);
        return newsMapper.deleteByPrimaryKey(news.getNewsId());
    }
}
