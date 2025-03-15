package com.mehmetali.services.impl;

import com.mehmetali.dto.DtoCourse;
import com.mehmetali.dto.DtoStudent;
import com.mehmetali.dto.DtoStudentIU;
import com.mehmetali.entites.Course;
import com.mehmetali.entites.Employee;
import com.mehmetali.entites.Student;
import com.mehmetali.repository.StudentRepository;
import com.mehmetali.services.IStudentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentRepository studentRepository;


    @Override
    public DtoStudent saveStudent(DtoStudentIU dtoStudentIU) {
        DtoStudent response = new DtoStudent();
        Student student = new Student();
        BeanUtils.copyProperties(dtoStudentIU, student);
        Student dbStudent = studentRepository.save(student);

        BeanUtils.copyProperties(dbStudent, response);
        return response;
    }

    @Override
    public List<DtoStudent> getAllStudents() {
        List<DtoStudent> dtoList = new ArrayList<>();
        List<Student> studentList = studentRepository.findAll();
        for (Student student : studentList) {
            DtoStudent dtoStudent = new DtoStudent();
            BeanUtils.copyProperties(student, dtoStudent);
            dtoList.add(dtoStudent);
        }
        return dtoList;
    }

    @Override
	    public DtoStudent getStudentById(Long id) {
       DtoStudent dtoStudent=new DtoStudent();
        Optional<Student> optional = studentRepository.findById(id);
        if (optional.isEmpty()){
            return null;
        }
        Student dbStudent=optional.get();
        BeanUtils.copyProperties(dbStudent,dtoStudent);
        if (dbStudent.getCourse()!=null&&!dbStudent.getCourse().isEmpty()){
            for (Course course : dbStudent.getCourse()){
                DtoCourse dtoCourse=new DtoCourse();

                BeanUtils.copyProperties(course,dtoCourse);
dtoStudent.getCourse().add(dtoCourse);	
               
            }
        }
return dtoStudent;
    }


    @Override
    public void deleteStudent(Long id) {

        Optional<Student> optional = studentRepository.findById(id);
        if (optional.isPresent()) {
            studentRepository.delete(optional.get());
        }
    }

    @Override
    public DtoStudent updateStudent(Long id, DtoStudentIU dtoStudentIU) {
        DtoStudent dtoStudent=new DtoStudent();
        Optional<Student> optinal = studentRepository.findById(id);
        if (optinal.isPresent()) {
            Student dbStudent = optinal.get();

            dbStudent.setFirstName(dtoStudentIU.getFirstName());
            dbStudent.setLastName(dtoStudentIU.getLastName());
            dbStudent.setBirthOfDate(dtoStudentIU.getBirthOfDate());
            Student updatedStudent = studentRepository.save(dbStudent);
BeanUtils.copyProperties(updatedStudent,dtoStudent);

return dtoStudent;
        }
        return null;
    }
}
 