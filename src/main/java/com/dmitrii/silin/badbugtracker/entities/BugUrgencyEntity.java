package com.dmitrii.silin.badbugtracker.entities;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@NoArgsConstructor
@Entity
@Data
@Table(name = "bug_urgency")
public class BugUrgencyEntity extends BaseEntity{

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;
}
