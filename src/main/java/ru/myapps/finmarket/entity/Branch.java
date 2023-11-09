package ru.myapps.finmarket.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "branch")
@Getter
@Setter
@NoArgsConstructor
public class Branch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "bank_id")
    private String bank_id;

    @Column(name = "name")
    private String name;

    @Column(name = "bic")
    private String bic;

    @Column(name = "address")
    private String address;

    @Column(name = "schedule")
    private String schedule;

    @Column(name = "contact_phone")
    private String contact_phone;

    @Column(name = "contact_email")
    private String contact_email;

}
