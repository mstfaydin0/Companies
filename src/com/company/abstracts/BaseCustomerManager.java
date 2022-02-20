package com.company.abstracts;

import com.company.entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {
    @Override
    public void saveCustomer(Customer customer) {
        System.out.println("Saved to db: " + customer.getFirstName());

    }


