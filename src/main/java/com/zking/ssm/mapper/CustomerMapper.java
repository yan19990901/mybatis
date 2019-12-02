package com.zking.ssm.mapper;

import com.zking.ssm.model.Customer;

public interface CustomerMapper {
    int deleteByPrimaryKey(Integer customerId);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(Integer customerId);

    Customer loadCasecode(Customer record);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);
}