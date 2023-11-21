package ru.myapps.finmarket.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "banks")
@Getter
@Setter
@NoArgsConstructor
public class Bank {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String bic;

    @Column(name = "web_site")
    private String webSite;

    @OneToMany(mappedBy = "bank", orphanRemoval = true)
    @JsonManagedReference
    private List<Branch> branches;

}
