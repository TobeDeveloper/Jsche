package org.jsche.service.impl;

import org.jsche.entity.Customer;
import org.jsche.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by myan on 2017/3/29.
 */
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
    @Override
    public List<Customer> findByFirstName(String firstName) {
        return null;
    }

    @Override
    public void save(Customer c) {

    }
}
