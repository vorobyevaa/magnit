package ru.aa.sov.data.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "towns")
@Getter
@Setter
public class TownEntity extends BaseEntity implements Serializable {

    @Column(name = "is_not_specified")
    protected Boolean isNotSpecified;

    @Column(name = "is_lead")
    protected Boolean isLead;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="region_id", nullable=false)
    protected RegionEntity region;

}
