package com.giraudev.riskmachine.domain;

import lombok.Getter;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Getter
@ToString
@Table(name = "TAX")
public class Tax {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "LABEL")
    private String label;

    @Column(name = "VALUE")
    private BigDecimal value;

    @Deprecated
    Tax(){}

    public Tax(String label, BigDecimal value) {
        this.label = label;
        this.value = value;
    }
}
