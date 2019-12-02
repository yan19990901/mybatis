package com.zking.ssm.service;

import com.zking.ssm.model.File;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IFileService {
    @Transactional(readOnly = true)
    File Load(File file);
}
