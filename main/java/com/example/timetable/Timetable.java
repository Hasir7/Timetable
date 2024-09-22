package com.example.timetable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Timetable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String classDay;
    private String subject;
    private String time;

    public Timetable() {}

    public Timetable(String classDay, String subject, String time) {
        this.classDay = classDay;
        this.subject = subject;
        this.time = time;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getClassDay() { return classDay; }
    public void setClassDay(String classDay) { this.classDay = classDay; }
    public String getSubject() { return subject; }
    public void setSubject(String subject) { this.subject = subject; }
    public String getTime() { return time; }
    public void setTime(String time) { this.time = time; }
}
