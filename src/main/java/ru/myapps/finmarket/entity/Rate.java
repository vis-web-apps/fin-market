package ru.myapps.finmarket.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "rates")
@Getter
@Setter
@NoArgsConstructor
public class Rate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "bank_id", referencedColumnName = "id")
    private Bank bank;

    @ManyToOne
    @JoinColumn(name = "b_cur_id", referencedColumnName = "id")
    private Currency basedCurrency;

    @ManyToOne
    @JoinColumn(name = "q_cur_id", referencedColumnName = "id")
    private Currency quoteCurrency;

    @Column(name = "start_date_time")
    private Date startDateTime;

    @Column(name = "is_buy_rate")
    private boolean isBuyRate;

    @Column(name = "limit_from")
    private BigDecimal limitFrom;

    @Column(name = "limit_to")
    private BigDecimal limitTo;

    private BigDecimal rate;

}
