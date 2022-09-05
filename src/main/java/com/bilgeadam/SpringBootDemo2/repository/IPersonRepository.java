package com.bilgeadam.SpringBootDemo2.repository;

import com.bilgeadam.SpringBootDemo2.repository.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPersonRepository extends JpaRepository<Person,Long> {

    List<Person> findByName(String name);

    List<Person> findByNameAndBirthdate(String name, long birthdate);


}
