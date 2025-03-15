package com.mehmetali.controller;

import com.mehmetali.dto.DtoStudent;
import com.mehmetali.dto.DtoStudentIU;
import com.mehmetali.entites.Student;

import java.util.List;

public interface IStudentController {

    public DtoStudent saveStudent(DtoStudentIU student);

    public List<DtoStudent> getAllStudents();

    public DtoStudent getStudentsById(Long id);

    public void deleteStudent(Long id);

    public DtoStudent updateStudent(Long id,DtoStudentIU dtoStudentIU);
}
