package ru.aa.sov.data.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "forms")
@Getter
@Setter
public class FormEntity extends BaseEntity implements Serializable {
}