package com.zking.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.UUID;

@Controller
public class UploadController {
    private String saveDir = "E:\\temp\\";

    @RequestMapping("/toUpload")
    public String toUpload() {
        System.out.println("开始文件上传");
        return "upload";
    }

    @PostMapping("/upload")
    public String upload(MultipartFile file) throws Exception {
        System.out.println("上传单个文件中");
        String fileId = UUID.randomUUID().toString().replace("-", "");
        File targetFile = new File(saveDir + fileId);
        file.transferTo(targetFile);
        return "redirect:/toUpload";
    }

    @PostMapping("/upload2")
    public String upload2(MultipartFile[] files) throws Exception {
        for (int i = 0; null != files && i < files.length; i++) {
            System.out.println("上传多个文件中");
            MultipartFile file = files[i];
            String fileId = UUID.randomUUID().toString().replace("-", "");
            File targetFile = new File(saveDir + fileId);
            file.transferTo(targetFile);
        }
        return "redirect:/toUpload";
    }
}
