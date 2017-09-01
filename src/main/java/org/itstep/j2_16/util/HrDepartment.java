package org.itstep.j2_16.util;

import java.util.List;

import org.itstep.j2_16.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HrDepartment {
    StudentService studentService;

    @Autowired
    public HrDepartment(StudentService studentService) {
        this.studentService = studentService;
    }

    public List<org.itstep.j2_16.entity.Adress> getAllStudents() {
        return studentService.getAll();
    }

    public org.itstep.j2_16.entity.Adress saveStudent(org.itstep.j2_16.entity.Adress adress) {
        return studentService.save(adress);
    }
}
