package org.rupp.springcustomer.Controller;

import org.aspectj.lang.annotation.Pointcut;
import org.rupp.springcustomer.Entity.Customer;
import org.rupp.springcustomer.Service.ServiceCustomer;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "api/v1/customer/")
public class CustomerController {
    private final ServiceCustomer serviceCustomer;

    public CustomerController(ServiceCustomer serviceCustomer) {
        this.serviceCustomer = serviceCustomer;
    }

    @GetMapping
    public List<Customer> getAllCustomer(){
        return serviceCustomer.getAllCustomer();
    }

    @GetMapping("{id}")
    public Customer getCustomerByID(@PathVariable("id") int id){
        return serviceCustomer.getCustomerByID(id);
    }
    @PostMapping()
    public void addNewProduct(@RequestBody Customer customer) {
        serviceCustomer.addNewCustomer(customer);
    }
    @PutMapping()
    public void updateCustomer(@RequestBody Customer customer){
        serviceCustomer.updateCustomer(customer);
    }
}
