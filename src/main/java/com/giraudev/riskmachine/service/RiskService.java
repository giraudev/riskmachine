package com.giraudev.riskmachine.service;

import com.giraudev.riskmachine.converter.Converter;
import com.giraudev.riskmachine.domain.Risk;
import com.giraudev.riskmachine.domain.Tax;
import com.giraudev.riskmachine.dto.*;
import com.giraudev.riskmachine.repository.RiskRepository;
import com.giraudev.riskmachine.repository.TaxRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class RiskService {

    @Autowired
    private RiskRepository riskRepository;

    @Autowired
    private TaxRepository taxRepository;

    @Autowired
    private Converter converter;

    public CalculateResponseDTO createRisks(CalculateRequestDTO requestDTO) {
        return new CalculateResponseDTO(requestDTO.getClientName(), requestDTO.getCreditValue(), buildRisks(requestDTO));
    }

    public Risk save(PostRequestDTO requestDTO){
        Tax tax = taxRepository.save(converter.toTax(requestDTO));
        Risk risk = converter.toRisk(requestDTO, tax);
        return riskRepository.save(risk);
    }

    public List<GetResponseDTO> getAll(){
        List<Risk> risks = riskRepository.findAll();
        return converter.fromRisk(risks);
    }

    private List<PostDataDTO> buildRisks(CalculateRequestDTO requestDTO) {
        return taxRepository.findAll().stream().map(label -> new PostDataDTO(label.getLabel(), calculate(requestDTO.getCreditValue(),
                label.getValue()), label.getValue())).collect(Collectors.toList());
       }

    private BigDecimal calculate(BigDecimal creditValue, BigDecimal taxValue) {
        BigDecimal tax = taxValue.divide(BigDecimal.valueOf(100)).setScale(2, RoundingMode.HALF_UP);
        return tax.add(BigDecimal.ONE).multiply(creditValue);
    }
}
