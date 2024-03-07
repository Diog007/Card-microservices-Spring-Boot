package com.diogo.msavaliadorcredito.domain.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@Data
@NoArgsConstructor
public class Cartao {

    private Long id;
    private String nome;
    private String bandeira;
    private BigDecimal limiteBasico;
}
