package com.giraudev.riskmachine.domain;

import lombok.Getter;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Entity
@ToString
@Table(name = "RISK")
public class Risk {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "CLIENT_NAME")
    private String clientName;

    @Column(name = "LIMIT_VALUE")
    private BigDecimal limitValue;

    @Column(name = "TOTAL_VALUE")
    private BigDecimal totalValue;

    @OneToOne
    @JoinColumn(name = "TAX_ID")
    private Tax tax;

    @Column(name = "CREATED_TIME")
    private LocalDateTime createdTime;

    @Deprecated
    Risk(){}

    public Risk(String clientName, BigDecimal limitValue, BigDecimal totalValue, Tax tax) {
        this.clientName = clientName;
        this.limitValue = limitValue;
        this.totalValue = totalValue;
        this.tax = tax;
        this.createdTime = LocalDateTime.now();
    }
}
