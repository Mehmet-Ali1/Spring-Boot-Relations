package com.mehmetali.controller.impl;

import com.mehmetali.controller.IStudentController;
import com.mehmetali.dto.DtoStudent;
import com.mehmetali.dto.DtoStudentIU;
import com.mehmetali.entites.Student;
import com.mehmetali.services.IStudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/api/student")
public class StudentControllerImpl implements IStudentController {

    @Autowired
    private IStudentService studentService;


   @PostMapping (path = "/save")
    @Override
    public DtoStudent saveStudent(@RequestBody @Valid DtoStudentIU dtoStudentIU) {
        return studentService.saveStudent(dtoStudentIU);
    }
@GetMapping(path = "/list")
    @Override
    public List<DtoStudent> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping(path = "/list/{id}")
    @Override
    public DtoStudent getStudentsById(@PathVariable(name = "id") Long id) {
        return studentService.getStudentById(id);
    }
@DeleteMapping(path = "/delete/{id}")
    @Override
    public void deleteStudent(@PathVariable(name = "id") Long id) {
        studentService.deleteStudent(id);
    }

    @PutMapping(path = "/update/{id}")
    @Override
    public DtoStudent updateStudent(@PathVariable(name = "id") Long id,
                                 @RequestBody DtoStudentIU dtoStudentIU) {
        return studentService.updateStudent(id,dtoStudentIU);
    }
}
