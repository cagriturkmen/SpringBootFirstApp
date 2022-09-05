package com.bilgeadam.SpringBootDemo2.controller;

import com.bilgeadam.SpringBootDemo2.repository.entity.Person;
import com.bilgeadam.SpringBootDemo2.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping("/hello")
    public ResponseEntity<String> hello(){
        return ResponseEntity.ok("First REST API");
    }

    @PostMapping("/save")
    public ResponseEntity<Void> save(@RequestBody Person person){
        personService.save(Person.builder()
                .name(person.getName())
                .birthdate(person.getBirthdate())
                .identityNumber(person.getIdentityNumber())
                .build());
        return ResponseEntity.ok().build();
    }

    @GetMapping("/findall")
    public ResponseEntity<List<Person>> findAll(){
        return ResponseEntity.ok(personService.findAll());
    }

}
