package com.mehmetali.controller.impl;

import com.mehmetali.controller.IHomeController;
import com.mehmetali.dto.DtoHome;
import com.mehmetali.services.IHomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/rest/api/home")
public class HomeControllerImpl implements IHomeController {

@Autowired
private IHomeService homeService;

    @GetMapping(path = "/list/{id}")
    @Override
    public DtoHome findHomeById(@PathVariable(name = "id") Long id) {
        return homeService.findHomeById(id);
    }
}
