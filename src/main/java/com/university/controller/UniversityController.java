package com.university.controller;

import com.university.entities.University;
import com.university.service.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/uni")
public class UniversityController {

    @Autowired
    private UniversityService universityService;

    @GetMapping
    public List<String>getUniversities(){
        return universityService.getUniversities();
    }


}
