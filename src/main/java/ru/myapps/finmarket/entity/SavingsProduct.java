package ru.myapps.finmarket.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "savings_products")
@Getter
@Setter
@NoArgsConstructor
public class SavingsProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "bank_id", referencedColumnName = "id")
    private Bank bank;

    private String name;

    private BigDecimal rate;

    private BigDecimal sum;

    @ManyToOne
    @JoinColumn(name = "cur_id", referencedColumnName = "id")
    private Currency currency;

    @Column(name = "promo_info")
    private String promoInfo;

}
