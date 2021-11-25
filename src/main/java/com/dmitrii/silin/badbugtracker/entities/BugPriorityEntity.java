package com.dmitrii.silin.badbugtracker.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "bug_priority")
public class BugPriorityEntity extends BaseEntity{

    private String name;
    private String description;

}
