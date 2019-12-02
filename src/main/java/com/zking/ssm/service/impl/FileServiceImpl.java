package com.zking.ssm.service.impl;

import com.zking.ssm.mapper.FileMapper;
import com.zking.ssm.model.File;
import com.zking.ssm.service.IFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FileServiceImpl implements IFileService {
    @Autowired
    private FileMapper fileMapper;

    public FileServiceImpl() {
    }

    public FileMapper getFileMapper() {
        return fileMapper;
    }

    public void setFileMapper(FileMapper fileMapper) {
        this.fileMapper = fileMapper;
    }

    @Override
    public File Load(File file) {
        return null;
    }
}
