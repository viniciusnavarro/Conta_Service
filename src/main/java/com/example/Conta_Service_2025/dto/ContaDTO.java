package com.example.Conta_Service_2025.dto;

import jakarta.persistence.criteria.CriteriaBuilder.In;
import java.math.BigDecimal;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class ContaDTO {

    private UUID id;
    private String nomeTitular;
    private Integer numeroAgencia;
    private Integer numeroConta;
    private String chavePix;
    private BigDecimal saldo;

}
