package com.example.GDSC.controller;

import com.example.GDSC.model.Lecture;
import com.example.GDSC.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("api/students")
public class StudentController {
    private final List<Student> students = new ArrayList<>();

    @GetMapping
    public List<Student> getStudents(){
        return students;
    }

    @PostMapping
    public Student createStudent(Student student){
        students.add(student);
        return student;
    }

    @PutMapping("/{id}")
    public Lecture addLecture(@PathVariable Long id, @RequestBody Lecture lecture){
        Student student = students.stream().filter(s -> s.getId().equals(id)).findFirst().orElseThrow(()->new NoSuchElementException());
        student.getLectureList().add(lecture);
        return lecture;
    }


    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id){
        students.removeIf(student -> student.getId().equals(id));
    }

}
