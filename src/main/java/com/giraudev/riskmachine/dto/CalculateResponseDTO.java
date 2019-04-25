package com.giraudev.riskmachine.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.List;

@Getter
@AllArgsConstructor
@ToString
public class CalculateResponseDTO {

    @JsonProperty(value = "nomeDoCliente")
    private String clientName;

    @JsonProperty(value = "limiteDeCredito")
    private BigDecimal creditValue;

    @JsonProperty(value = "riscos")
    private List<PostDataDTO> risks;
}
