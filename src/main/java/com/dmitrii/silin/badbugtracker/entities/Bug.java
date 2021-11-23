package com.dmitrii.silin.badbugtracker.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;
import java.util.Date;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "bugs")
public class Bug extends BaseEntity {

    private String title;

    @Column(columnDefinition = "TEXT")
    private String description;

    private Date dateOfCreation;

    private Long developerId;


}
