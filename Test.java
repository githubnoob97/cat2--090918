package com.cat.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class Test implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        RestTemplate restTemplate  = new RestTemplate();

        ResponseEntity<List<StudentName>> response = restTemplate.exchange(
                "http://10.51.10.111:1000/registrations",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<StudentName>>(){});
        List<StudentName> Registration = response.getBody();

        for(StudentName studentName : Registration){
            System.out.println(studentName.toString());
        }

        System.err.println("Find One(GET)--------------------------------");

        StudentName studentName = restTemplate.getForObject(
                "http://10.51.10.111:1000/units",
                StudentName.class);
        System.out.println(studentName.toString());

        System.err.println("Creating(POST)______________________________");

        StudentName newStudentName = new StudentName("2", "Edwin Gaitho");
        StudentName createdStudentName = restTemplate.postForObject(
                "http://10.51.10.111:1000/registrations",
                newStudentName, StudentName.class);
        System.out.println(createdStudentName.toString());

        System.err.println("____________________________________");
        String createIdUrl = "http://10.51.10.111:1000/units"
                + createdStudentName.getId()+"/id";

        id newId = new id("Edwin Gaitho");
        id createdId = restTemplate.postForObject(
                createIdUrl,
                newId, id.class);
        System.out.println(createdId.toString());

    }
}
