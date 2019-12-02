package com.zking.ssm.mapper;

import com.zking.ssm.model.File;

public interface FileMapper {
    int deleteByPrimaryKey(String fileId);

    int insert(File record);

    int insertSelective(File record);

    File selectByPrimaryKey(String fileId);
    File load(String fileId);

    int updateByPrimaryKeySelective(File record);

    int updateByPrimaryKey(File record);
}