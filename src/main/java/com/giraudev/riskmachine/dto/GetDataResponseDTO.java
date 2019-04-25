package com.giraudev.riskmachine.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@ToString
@AllArgsConstructor
public class GetDataResponseDTO {

    @JsonProperty(value = "tipoDeRisco")
    private String taxLabel;
    @JsonProperty(value = "valorTotal")
    private BigDecimal totalValue;
    @JsonProperty(value = "taxa")
    private BigDecimal taxValue;
}
