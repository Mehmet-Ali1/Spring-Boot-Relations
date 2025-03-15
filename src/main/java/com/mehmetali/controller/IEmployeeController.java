package com.mehmetali.controller;

import com.mehmetali.dto.DtoEmployee;

import java.util.List;

public interface IEmployeeController {

    public List<DtoEmployee> findAllEmployees();
}
