package com.zking.ssm.mapper;

import com.zking.ssm.model.News;
import com.zking.ssm.vo.NewsVo;

public interface NewsMapper {
    int deleteByPrimaryKey(Integer newsId);

    int deleteNewsCategory(News newsId);

    int insert(News record);

    int insertSelective(News record);

    News selectByPrimaryKey(Integer newsId);

    News loadCasecode(News record);

    int updateByPrimaryKeySelective(News record);

    int updateByPrimaryKey(News record);

    int addCategory(NewsVo newsVo);

    int removeCategory(NewsVo newsVo);
}