package com.demo.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.customer.model.Customer;
import com.demo.customer.model.CustomerRepository;

@RestController
public class CustomerController {

	@Autowired
	private CustomerRepository customerRepository;
	
	@RequestMapping(value="/customer", method = RequestMethod.POST )
	public String createCustomer(@RequestBody Customer customer) {
		Customer newCustomer = customerRepository.save(customer);
		return newCustomer.toString();
	}
	
	@RequestMapping(value="/customer", method = RequestMethod.GET )
	public List<Customer> getCustomer(){
		return customerRepository.findAll();
	}
	
	
}
