package com.giraudev.riskmachine.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor
@ToString
public class CalculateRequestDTO {

    @JsonProperty(value = "nomeDoCliente")
    private String clientName;

    @JsonProperty(value = "limiteDeCredito")
    private BigDecimal creditValue;
}
