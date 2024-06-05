package com.example.GDSC.controller;

import com.example.GDSC.model.Lecture;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/lectures")
public class LectureController {
    private List<Lecture> lectures = new ArrayList<>();

    @GetMapping
    public List<Lecture> getLectures(){
        return lectures;
    }

    @PostMapping
    public Lecture createLecture(Lecture lecture){
        lectures.add(lecture);
        return lecture;
    }

    @DeleteMapping("/{id}")
    public void deleteLecture(@PathVariable Long id){
        lectures.removeIf(lecture -> lecture.getId().equals(id));
    }

}
