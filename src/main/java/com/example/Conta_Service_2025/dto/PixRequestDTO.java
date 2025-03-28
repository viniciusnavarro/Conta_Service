package com.example.Conta_Service_2025.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class PixRequestDTO {

    @NotEmpty
    private String chavePixPagador;
    @NotEmpty
    private String chavePixRecebedor;
    @NotNull
    private BigDecimal valor;
    @NotEmpty
    private String idempotencia;

}
