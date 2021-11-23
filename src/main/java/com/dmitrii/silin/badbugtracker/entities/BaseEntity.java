package com.dmitrii.silin.badbugtracker.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@MappedSuperclass
public class BaseEntity {

    @Id
    @SequenceGenerator(name = "base_sequence", sequenceName = "base_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "base_sequence")
    private Long id;

}
