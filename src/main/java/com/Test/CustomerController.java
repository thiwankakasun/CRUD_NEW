package com.Test;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    CustomerController( CustomerService customerService){
        this.customerService = customerService;
    }
    @RequestMapping("/customer")
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/customer")
    public void addCustomer(@RequestBody Customer customer){
        customerService.addCustomer(customer);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/customer/{Id}")
    public void updateCustomer(@RequestBody Customer customer, @PathVariable String Id){
        customerService.updateCustomer(Id, customer);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/customer/{Id}")
    public void deleteCustomer(@RequestBody Customer customer){
        customerService.deleteCustomer(customer);
    }


}
