package com.dmitrii.silin.badbugtracker.entities;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@NoArgsConstructor
@Entity
@Setter
@Getter
@Table(name = "bug_urgency")
public class BugUrgencyEntity extends BaseEntity{

    private String name;
    private String description;
}
