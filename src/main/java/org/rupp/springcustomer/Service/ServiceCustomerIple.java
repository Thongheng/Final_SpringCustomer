package org.rupp.springcustomer.Service;

import org.rupp.springcustomer.Dao.DaoCustomer;
import org.rupp.springcustomer.Entity.Customer;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ServiceCustomerIple implements ServiceCustomer{

    private final DaoCustomer daoCustomer;

    public ServiceCustomerIple(DaoCustomer daoCustomer) {
        this.daoCustomer = daoCustomer;
    }

    @Override
    public List<Customer> getAllCustomer() {
        return daoCustomer.getAllCustomer();
    }

    @Override
    public Customer getCustomerByID(int id) {
        return daoCustomer.getCustomerByID(id);
    }

    @Override
    @Transactional
    public void addNewCustomer(Customer customer) {
        daoCustomer.addNewCustomer(customer);
    }

    @Override
    @Transactional
    public void updateCustomer(Customer customer) {
        daoCustomer.updateCustomer(customer);
    }
}
