package com.mehmetali.controller;

import com.mehmetali.dto.DtoCustomer;

public interface ICustomerController {
    public DtoCustomer findCustomerById(Long id);
}
