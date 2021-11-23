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
public class Developer extends BaseEntity {

    private String name;
    private String email;
}
