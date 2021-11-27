package com.dmitrii.silin.badbugtracker.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@Entity
@Table(name = "bug")
public class BugEntity extends BaseEntity {

    @Column(name = "title")
    private String title;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "dateofcreation")
    private Date dateOfCreation;

    @Column(name = "developerid")
    private Long developerId;
}

