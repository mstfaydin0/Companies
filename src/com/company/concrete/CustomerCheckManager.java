package com.company.concrete;

import com.company.abstracts.CustomerCheckService;
import com.company.entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {
    @Override
    public boolean CheckIfRealPerson(Customer customer) {

        return false;
    }
}
