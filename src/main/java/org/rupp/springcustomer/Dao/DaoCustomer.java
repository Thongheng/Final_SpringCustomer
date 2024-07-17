package org.rupp.springcustomer.Dao;


import org.rupp.springcustomer.Entity.Customer;

import java.util.List;

public interface DaoCustomer {
    List<Customer> getAllCustomer();
    Customer getCustomerByID(int id);
    void addNewCustomer(Customer customer);
    void updateCustomer(Customer customer);
}
