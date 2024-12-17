package ru.aa.sov.data.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;


@Entity
@Table(name = "locations")
@Getter
@Setter
public class LocalEntity  extends BaseEntity implements Serializable {
}

