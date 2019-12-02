package com.zking.ssm.service;

import com.zking.ssm.model.Order;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IOrderService {
    @Transactional(readOnly = true)
    Order loadCasecode(Order order);
}
