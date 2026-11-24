package com.vinicola.deliveryvinicola.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter

public class AlterarDTO {
    private String nomeVinho;
    private String tipoVinho;
    private String tipoUvaVinho;
    private Integer safraVinho;
    private String descriVinho;
    private BigDecimal precoVinho;
}
