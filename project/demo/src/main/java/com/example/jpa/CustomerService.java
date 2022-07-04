package com.example.jpa;


// @Service
public class CustomerService {
    // @Autowired
    private CustomerRepository customerRepository;
    
    public void Method(){
        customerRepository.count();
    }
}
