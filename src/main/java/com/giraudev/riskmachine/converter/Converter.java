package com.giraudev.riskmachine.converter;

import com.giraudev.riskmachine.domain.Risk;
import com.giraudev.riskmachine.domain.Tax;
import com.giraudev.riskmachine.dto.GetDataResponseDTO;
import com.giraudev.riskmachine.dto.GetResponseDTO;
import com.giraudev.riskmachine.dto.PostRequestDTO;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class Converter {

    public Tax toTax(PostRequestDTO requestDTO) {
        return new Tax(requestDTO.getRisk().getTaxLabel(), requestDTO.getRisk().getTaxValue());
    }

    public Risk toRisk(PostRequestDTO requestDTO, Tax tax){
        return new Risk(requestDTO.getClientName(), requestDTO.getCreditValue(), requestDTO.getRisk().getTotalValue(), tax);
    }

    public List<GetResponseDTO> fromRisk(List<Risk> risk){
        return risk.stream().map(x -> new GetResponseDTO(x.getClientName(), x.getLimitValue(), new GetDataResponseDTO(x.getTax().getLabel(),
                x.getTotalValue(), x.getTax().getValue()))).collect(Collectors.toList());
    }

}
