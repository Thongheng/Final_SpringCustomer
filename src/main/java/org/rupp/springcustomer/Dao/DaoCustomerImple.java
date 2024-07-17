package org.rupp.springcustomer.Dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.rupp.springcustomer.Entity.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DaoCustomerImple implements DaoCustomer{

    private final EntityManager entityManager;

    public DaoCustomerImple(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Customer> getAllCustomer() {
        TypedQuery<Customer> query = entityManager.createQuery("FROM Customer c", Customer.class);
        return query.getResultList();
    }

    @Override
    public Customer getCustomerByID(int id) {
        return entityManager.find(Customer.class, id);
    }

    @Override
    public void addNewCustomer(Customer customer) {
        entityManager.persist(customer);
    }

    @Override
    public void updateCustomer(Customer customer) {
        entityManager.merge(customer);
    }
}
