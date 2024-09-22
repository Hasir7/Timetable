package com.example.timetable;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DataInitializer implements CommandLineRunner {

    private final TimetableRepository repository;

    public DataInitializer(TimetableRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) {
        List<Timetable> timetables = Arrays.asList(
                new Timetable("Monday", "Physics", "9:00 AM - 10:00 AM"),
                new Timetable("Monday", "Break", "10:00 AM - 10:15 AM"),
                new Timetable("Monday", "Chemistry", "10:15 AM - 11:15 AM"),
                new Timetable("Monday", "Lunch", "11:15 AM - 12:15 PM"),
                new Timetable("Monday", "Computer Science", "12:15 PM - 1:15 PM"),
                new Timetable("Monday", "Break", "1:15 PM - 1:30 PM"),
                new Timetable("Monday", "Maths", "1:30 PM - 2:30 PM"),
                new Timetable("Monday", "English", "2:30 PM - 3:30 PM"),
                new Timetable("Tuesday", "Tamil", "9:00 AM - 10:00 AM"),
                new Timetable("Tuesday", "Break", "10:00 AM - 10:15 AM"),
                new Timetable("Tuesday", "German", "10:15 AM - 11:15 AM"),
                new Timetable("Tuesday", "Lunch", "11:15 AM - 12:15 PM"),
                new Timetable("Tuesday", "Physics", "12:15 PM - 1:15 PM"),
                new Timetable("Tuesday", "Break", "1:15 PM - 1:30 PM"),
                new Timetable("Tuesday", "Chemistry", "1:30 PM - 2:30 PM"),
                new Timetable("Tuesday", "Computer Science", "2:30 PM - 3:30 PM"),
                new Timetable("Wednesday", "Maths", "9:00 AM - 10:00 AM"),
                new Timetable("Wednesday", "Break", "10:00 AM - 10:15 AM"),
                new Timetable("Wednesday", "English", "10:15 AM - 11:15 AM"),
                new Timetable("Wednesday", "Lunch", "11:15 AM - 12:15 PM"),
                new Timetable("Wednesday", "Tamil", "12:15 PM - 1:15 PM"),
                new Timetable("Wednesday", "Break", "1:15 PM - 1:30 PM"),
                new Timetable("Wednesday", "German", "1:30 PM - 2:30 PM"),
                new Timetable("Wednesday", "Physics", "2:30 PM - 3:30 PM"),
                new Timetable("Thursday", "Chemistry", "9:00 AM - 10:00 AM"),
                new Timetable("Thursday", "Break", "10:00 AM - 10:15 AM"),
                new Timetable("Thursday", "Computer Science", "10:15 AM - 11:15 AM"),
                new Timetable("Thursday", "Lunch", "11:15 AM - 12:15 PM"),
                new Timetable("Thursday", "Maths", "12:15 PM - 1:15 PM"),
                new Timetable("Thursday", "Break", "1:15 PM - 1:30 PM"),
                new Timetable("Thursday", "English", "1:30 PM - 2:30 PM"),
                new Timetable("Thursday", "Tamil", "2:30 PM - 3:30 PM"),
                new Timetable("Friday", "German", "9:00 AM - 10:00 AM"),
                new Timetable("Friday", "Break", "10:00 AM - 10:15 AM"),
                new Timetable("Friday", "Physics", "10:15 AM - 11:15 AM"),
                new Timetable("Friday", "Lunch", "11:15 AM - 12:15 PM"),
                new Timetable("Friday", "Chemistry", "12:15 PM - 1:15 PM"),
                new Timetable("Friday", "Break", "1:15 PM - 1:30 PM"),
                new Timetable("Friday", "Computer Science", "1:30 PM - 2:30 PM"),
                new Timetable("Friday", "Sports Class", "2:30 PM - 3:30 PM")
        );
        repository.saveAll(timetables);
    }
}
