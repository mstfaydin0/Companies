package com.company.abstracts;

import com.company.entities.Customer;

public interface CustomerCheckService {
    boolean CheckIfRealPerson(Customer customer);
}
