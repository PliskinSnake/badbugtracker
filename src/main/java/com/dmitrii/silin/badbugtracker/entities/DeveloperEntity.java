package com.dmitrii.silin.badbugtracker.entities;

import lombok.*;
import javax.persistence.*;
import java.util.Collection;


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

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "report",
            joinColumns = @JoinColumn(name = "developer_id"),
            inverseJoinColumns = @JoinColumn(name = "bug_id"))
    private Collection<BugEntity> report;

    public String getEmail() {
        return email;
    }
}
