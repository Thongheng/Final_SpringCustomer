package org.rupp.springcustomer.Service;

import org.rupp.springcustomer.Entity.Customer;

import java.util.List;

public interface ServiceCustomer {
    List<Customer> getAllCustomer();
    Customer getCustomerByID(int id);
    void addNewCustomer(Customer customer);
    void updateCustomer(Customer customer);
}
