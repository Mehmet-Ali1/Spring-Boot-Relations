package com.mehmetali.services;

import com.mehmetali.dto.DtoAddress;
import com.mehmetali.dto.DtoCustomer;

public interface ICustomerService {


    public DtoCustomer findCustomerById(Long id);
}
