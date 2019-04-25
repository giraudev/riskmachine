package com.giraudev.riskmachine.resource;

import com.giraudev.riskmachine.domain.Risk;
import com.giraudev.riskmachine.dto.*;
import com.giraudev.riskmachine.service.RiskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RiskResource {

    @Autowired
    private RiskService service;

    @Transactional
    @PostMapping(path = "/data")
    public ResponseEntity<CalculateResponseDTO> createRisks(@RequestBody CalculateRequestDTO requestDTO){
        return new ResponseEntity<>(service.createRisks(requestDTO), HttpStatus.CREATED);
    }

    @Transactional
    @PostMapping(path = "/save")
    public ResponseEntity<PostResponseDTO> save(@RequestBody PostRequestDTO dto){
        Risk risk = service.save(dto);
        return new ResponseEntity<>(new PostResponseDTO(risk.getId()),HttpStatus.CREATED);
    }

    @GetMapping(path = "/data")
    public ResponseEntity<List<GetResponseDTO>> getAll(){
        return new ResponseEntity<>(service.getAll(),HttpStatus.OK);
    }
}


