package com.dmitrii.silin.badbugtracker.entities;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "developers")
public class DeveloperEntity extends BaseEntity {

    private String firstName;
    private String secondName;
    private String email;

//    public DeveloperEntity(String firstName, String secondName, String email) {
//        this.firstName = firstName;
//        this.secondName = secondName;
//        this.email = email;
//    }
}
