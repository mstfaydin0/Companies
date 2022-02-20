package com.company;

import com.company.abstracts.BaseCustomerManager;
import com.company.adapters.MernisServiceAdapter;
import com.company.concrete.DominosCustomerManager;
import com.company.concrete.SubwayCustomerManager;
import com.company.entities.Customer;

public class Main {

    public static void main(String[] args) {
        Customer customerStarbucks = new Customer();
        customerStarbucks.setId(655);
        customerStarbucks.setNationalityId(String.valueOf(15161651));
        customerStarbucks.setFirstName("Mustafa Muharrem");
        customerStarbucks.setLastName("Aydın");
        customerStarbucks.setDateOfBirth(String.valueOf(2001));

        BaseCustomerManager baseCustomerManager1 = new DominosCustomerManager(new MernisServiceAdapter());
        baseCustomerManager1.saveCustomer(customerStarbucks);

        Customer customerNero = new Customer();
        customerNero.setId(16);
        customerNero.setNationalityId(String.valueOf(456615498));
        customerNero.setFirstName("Mustafa Muharrem");
        customerNero.setLastName("Aydın");
        customerNero.setDateOfBirth(String.valueOf(2001));

        BaseCustomerManager baseCustomerManager2 = new SubwayCustomerManager(new MernisServiceAdapter());
        baseCustomerManager2.saveCustomer(customerNero);
    }
}


