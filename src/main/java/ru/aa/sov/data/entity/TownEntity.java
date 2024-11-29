package ru.aa.sov.data.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "towns")
@Getter
@Setter
public class TownEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    protected Long id;

    @Column(name = "name")
    protected String name;

    @Column(name = "is_not_specified")
    protected Boolean isNotSpecified;

    @Column(name = "is_lead")
    protected Boolean isLead;

    @Column(name = "region_id")
    protected Integer regionId;

}
