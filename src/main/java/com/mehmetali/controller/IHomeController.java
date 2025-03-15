package com.mehmetali.controller;

import com.mehmetali.dto.DtoHome;

public interface IHomeController {

    public DtoHome findHomeById(Long id);
}
