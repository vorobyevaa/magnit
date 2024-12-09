package ru.aa.sov.data.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "countries")
@Getter
@Setter
public class CountryEntity extends BaseEntity implements Serializable {

}
