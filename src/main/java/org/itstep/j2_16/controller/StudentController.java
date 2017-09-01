package org.itstep.j2_16.controller;

import org.itstep.j2_16.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/adresses")
public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public ResponseEntity<?> getStudents() {
        return new ResponseEntity<>(studentService.getAll(), OK);
    }

    @PostMapping
    public ResponseEntity<?> createStudent(@RequestBody org.itstep.j2_16.entity.Adress adress) {
        return new ResponseEntity<>(studentService.save(adress), OK);
    }
}