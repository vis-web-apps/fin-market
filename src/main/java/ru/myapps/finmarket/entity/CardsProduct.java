package ru.myapps.finmarket.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "cards_products")
@Getter
@Setter
@NoArgsConstructor
public class CardsProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @ManyToOne
    @JoinColumn(name = "bank_id", referencedColumnName = "id")
    private Bank bank;

    public String name;

    @Column(name = "cashback")
    public boolean isCashback;

    @Column(name = "miles")
    public boolean  isMiles;

    @Column(name = "points")
    public boolean isPoints;

    @Column(name = "service_free")
    public boolean isServiceFree;

    @Column(name = "website_link")
    public String websiteLink;

}
