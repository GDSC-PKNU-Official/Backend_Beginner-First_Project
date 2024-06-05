package com.example.GDSC.model;

public class Lecture {
    private Long id;
    private String title;
    private String lecturer;

    public Lecture(){
        this(null, "","");
    }

    public Lecture(Long id, String title, String lecturer){
        this.id = id;
        this.title = title;
        this.lecturer = lecturer;
    }

    public Long getId(){
        return id;
    }
    public void setId(){
        this.id = id;
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getLecturer(){
        return lecturer;
    }

    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }
}
