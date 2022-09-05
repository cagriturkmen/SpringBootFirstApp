package com.bilgeadam.SpringBootDemo2.repository.entity;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name="tblperson")
@Entity
public class Person {

    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    long id;
    String name;
    long birthdate;
    String identityNumber;


}
