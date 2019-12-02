package com.zking.ssm.service;

import com.zking.ssm.model.Order;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class IOrderServiceTest extends BaseTestCase {
    @Autowired
    private IOrderService orderService;
    private Order order;

    @Override
    public void before() {
        super.before();
        order = new Order();
    }

    @Test
    public void loadCasecode() throws Exception {
        order.setOrderId(1);
        Order o = orderService.loadCasecode(this.order);
        System.out.println(o);
        System.out.println(o.getCustomer());
    }

}