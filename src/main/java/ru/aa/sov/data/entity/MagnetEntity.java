package ru.aa.sov.data.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "items")
@Getter
@Setter
public class MagnetEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    protected Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="town_id", nullable=false)
    private TownEntity townEntity;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="form_id", nullable=false)
    private FormEntity formEntity;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="type_id", nullable=false)
    private TypeEntity typeEntity;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="location_id", nullable=false)
    private LocalEntity localEntity;
}
