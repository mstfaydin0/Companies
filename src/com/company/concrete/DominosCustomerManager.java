package com.company.concrete;

import com.company.abstracts.BaseCustomerManager;
import com.company.abstracts.CustomerCheckService;
import com.company.entities.Customer;

public class DominosCustomerManager extends BaseCustomerManager {

    CustomerCheckService customerCheckService;

    public DominosCustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void saveCustomer(Customer customer) {
        if(customerCheckService.CheckIfRealPerson(customer)) {

            System.out.println("Validation successfull.");
            super.saveCustomer(customer);

        }else {

            System.out.println("Not a valid person.");
        }
    }



}
