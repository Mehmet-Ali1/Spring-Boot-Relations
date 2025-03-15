package com.mehmetali.services;


import com.mehmetali.dto.DtoHome;

public interface IHomeService {

  public DtoHome findHomeById(Long id);
}
