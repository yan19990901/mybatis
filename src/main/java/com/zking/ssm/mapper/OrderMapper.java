package com.zking.ssm.mapper;

import com.zking.ssm.model.Order;

public interface OrderMapper {
    int deleteByPrimaryKey(Integer orderId);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Integer orderId);
    Order loadCasecode(Order record);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
}