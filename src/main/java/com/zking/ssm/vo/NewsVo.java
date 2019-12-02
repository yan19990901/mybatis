package com.zking.ssm.vo;

import com.zking.ssm.model.News;
import lombok.Data;

@Data
public class NewsVo extends News {
    private Integer categoryId;
}
