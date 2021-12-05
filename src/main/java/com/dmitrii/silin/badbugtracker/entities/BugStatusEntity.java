package com.dmitrii.silin.badbugtracker.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Entity
@Data
@Table(name = "status")
public class BugStatusEntity {

    @Id
    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

}
