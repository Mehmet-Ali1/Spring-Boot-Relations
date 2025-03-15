package com.mehmetali.services;

import com.mehmetali.dto.DtoStudent;
import com.mehmetali.dto.DtoStudentIU;
import com.mehmetali.entites.Student;

import java.util.List;

public interface IStudentService {

    public DtoStudent saveStudent(DtoStudentIU student);

    public List<DtoStudent> getAllStudents();

    public DtoStudent getStudentById(Long id);

    public void deleteStudent(Long id);

    public DtoStudent updateStudent(Long  id,DtoStudentIU dtoStudentIU);



}


