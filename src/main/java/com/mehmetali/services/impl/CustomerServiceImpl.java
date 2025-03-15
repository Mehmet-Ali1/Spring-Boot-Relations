package com.mehmetali.services.impl;


import com.mehmetali.dto.DtoAddress;
import com.mehmetali.dto.DtoCustomer;
import com.mehmetali.entites.Address;
import com.mehmetali.entites.Customer;
import com.mehmetali.repository.CustomerRepository;
import com.mehmetali.services.ICustomerService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public DtoCustomer findCustomerById(Long id) {
        DtoAddress dtoAddress = new DtoAddress();
        DtoCustomer dtoCustomer = new DtoCustomer();
        Optional<Customer> optional = customerRepository.findById(id);
        if (optional.isEmpty()) {
            return null;
        }
        Customer customer = optional.get();
        Address address = optional.get().getAddress();

        BeanUtils.copyProperties(customer, dtoCustomer);
        BeanUtils.copyProperties(address, dtoAddress);

        dtoCustomer.setAddress(dtoAddress);
        return dtoCustomer;
    }
}
