package com.company.concrete;

import com.company.abstracts.BaseCustomerManager;
import com.company.abstracts.CustomerCheckService;
import com.company.entities.Customer;

public class SubwayCustomerManager extends BaseCustomerManager {

    private CustomerCheckService customerService;

    public SubwayCustomerManager(CustomerCheckService customerService) {
        this.customerService = customerService;
    }
    @Override
    public void saveCustomer(Customer customer){
        if(customerService.CheckIfRealPerson(customer)) {
            System.out.println("Saved to db Subway: " +customer.getFirstName());
        } else {
            System.out.println("Nero Validation Error - Not a valid person.");
        }
    }



}
