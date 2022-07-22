package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerRepository repository;
	@GetMapping("/customer")
	public List<Customer>getAllCustomers(){
		return repository.findAll();
	}
	@GetMapping("/customer/{id}")
	public Optional<Customer> getCustomerById(@PathVariable int id){
		return repository.findById(id);
	}
   @PostMapping("/customer")
   public Customer saveCustomer(@RequestBody Customer customer) {
	   return repository.save(customer);
   }
	
	}


