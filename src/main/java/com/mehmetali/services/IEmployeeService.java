package com.mehmetali.services;

import com.mehmetali.dto.DtoEmployee;

import java.util.List;

public interface IEmployeeService {

    public List<DtoEmployee>findAllEmployees();
}
