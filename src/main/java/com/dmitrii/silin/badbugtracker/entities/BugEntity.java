package com.dmitrii.silin.badbugtracker.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
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

    @ManyToOne
    @JoinColumn(name = "developer_id")
    private DeveloperEntity developer_id;

    @ManyToOne
    @JoinColumn(name = "status")
    private BugStatusEntity status;

    @ManyToOne
    @JoinColumn(name = "urgency")
    private BugUrgencyEntity urgency;
}

