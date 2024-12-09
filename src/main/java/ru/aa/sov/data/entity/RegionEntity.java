package ru.aa.sov.data.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "regions")
@Getter
@Setter
public class RegionEntity extends BaseEntity implements Serializable {
}
