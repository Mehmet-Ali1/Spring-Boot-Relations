package com.mehmetali.services;

import com.mehmetali.dto.DtoAddress;

public interface IAddressService {

    public DtoAddress findAddressById(Long id);
}
