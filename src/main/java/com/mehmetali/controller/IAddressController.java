package com.mehmetali.controller;

import com.mehmetali.dto.DtoAddress;
import org.springframework.web.bind.annotation.PathVariable;

public interface IAddressController {


    public DtoAddress findAddressById( Long id);
}
