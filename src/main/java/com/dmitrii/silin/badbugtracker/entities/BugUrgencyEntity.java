package com.dmitrii.silin.badbugtracker.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@NoArgsConstructor
@Entity
@Data
@Table(name = "bug_urgency")
public class BugUrgencyEntity {

    @Id
    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;
}
