package com.mehmetali.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;



@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoStudent {

private Long id;
	
private String firstName;

private String lastName;

private List<DtoCourse> course=new ArrayList<>();
}
