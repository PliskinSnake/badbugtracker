package com.dmitrii.silin.badbugtracker.entities;

import lombok.*;
import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "developer")
public class DeveloperEntity extends BaseEntity {

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "secondname")
    private String secondName;

    @Column(name = "email")
    private String email;
}
