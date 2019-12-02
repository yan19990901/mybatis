package com.zking.ssm.service;

import com.zking.ssm.model.News;
import com.zking.ssm.vo.NewsVo;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface INewsService {
    @Transactional(readOnly = true)
    News loadCasecode(News news);

    int add(NewsVo newsVo);

    int remove(NewsVo newsVo);

    int del(News news);
}
