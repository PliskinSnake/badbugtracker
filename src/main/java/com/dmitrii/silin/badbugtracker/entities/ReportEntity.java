package com.dmitrii.silin.badbugtracker.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "report")
public class ReportEntity extends BaseEntity {

    @Column(name = "developer_id")
    private Long developerId;

    @Column(name = "bug_id")
    private Long bugId;

}
