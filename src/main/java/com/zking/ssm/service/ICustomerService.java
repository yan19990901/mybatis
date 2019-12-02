package com.zking.ssm.service;

import com.zking.ssm.model.Customer;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ICustomerService {
    @Transactional(readOnly = true)
    Customer loadCasecode(Customer customer);
}
