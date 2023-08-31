package ru.myapps.finmarket.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "currencies")
@Getter
@Setter
@NoArgsConstructor
public class Currency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "iso_dig")
    private int isoDig;

    @Column(name = "iso_lat3")
    private String isoLat3;

    @Column(name = "name_rus")
    private String nameRus;

}
