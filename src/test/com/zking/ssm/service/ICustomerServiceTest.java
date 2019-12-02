package com.zking.ssm.service;

import com.zking.ssm.model.Customer;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class ICustomerServiceTest extends BaseTestCase {
    @Autowired
    private ICustomerService customerService;
    private Customer customer;

    @Override
    public void before() {
        super.before();
        customer = new Customer();
    }

    @Test
    public void loadCasecode() throws Exception {
        customer.setCustomerId(1);
        Customer c = customerService.loadCasecode(this.customer);
        System.out.println(c);
        System.out.println(c.getOrderList());
    }

}