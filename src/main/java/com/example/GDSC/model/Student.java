package com.example.GDSC.model;


import java.util.ArrayList;
import java.util.List;

public class Student {
    private Long id;
    private String name;
    private String year;
    private List<Lecture> lectureList = new ArrayList<>();

    public Student(){
        this(null, "", "");
    }
    public Student(Long id, String name, String year){
        this.id = id;
        this.name = name;
        this.year = year;
    }

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getYear(){
        return year;
    }
    public void setYear(String year){
        this.year = year;
    }

    public List<Lecture> getLectureList(){
        return lectureList;
    }
    public void setLectureList(List<Lecture> lectureList){
        this.lectureList = lectureList;
    }

}
