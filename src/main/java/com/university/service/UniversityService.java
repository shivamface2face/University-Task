package com.university.service;

import com.university.entities.University;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class UniversityService {


    private static final String url = "http://universities.hipolabs.com/search?country=United+States";

    @Autowired
    public RestTemplate restTemplate;

    List<String>stringList=new ArrayList<>();

    public List<String> getUniversities() {
        University[] universities = restTemplate.getForObject(url, University[].class);
        return stringList = Arrays.stream(universities)
                .filter(university -> university.getCountry().equalsIgnoreCase("United States"))
                .map(University::getName)
                .collect(Collectors.toList());
    }

}
