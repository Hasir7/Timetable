package com.example.timetable;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class TimetableController {

    private final TimetableRepository repository;

    public TimetableController(TimetableRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/timetable")
    public Map<String, List<Map<String, String>>> getTimetable() {
        List<Timetable> timetables = repository.findAll();
        Map<String, List<Map<String, String>>> timetableMap = new LinkedHashMap<>();

        for (Timetable timetable : timetables) {
            timetableMap.putIfAbsent(timetable.getClassDay(), new ArrayList<>());
            Map<String, String> entry = new HashMap<>();
            entry.put("subject", timetable.getSubject());
            entry.put("time", timetable.getTime());
            timetableMap.get(timetable.getClassDay()).add(entry);
        }

        return timetableMap;
    }
}
