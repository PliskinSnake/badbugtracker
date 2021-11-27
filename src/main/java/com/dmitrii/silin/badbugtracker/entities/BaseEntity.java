package com.dmitrii.silin.badbugtracker.entities;

import lombok.Data;


import javax.persistence.*;

@Data
@MappedSuperclass
public class BaseEntity {

    @Id
    @SequenceGenerator(name = "base_sequence", sequenceName = "base_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "base_sequence")
    private Long id;

}
