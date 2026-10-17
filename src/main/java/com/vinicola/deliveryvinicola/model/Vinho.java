package com.vinicola.deliveryvinicola.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Table(name = "Vinho")
@Data

public class Vinho {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //    Colocamos o @Colum para que, possa haver um número de caracteres limite no nome e para que ele não possa aceitar o null
    @NotBlank
    @Column(length = 100, nullable = false)
    private String nome;
    @NotBlank
    @Column(length = 100, nullable = false)
    private String tipoUva;
    @NotBlank
    @Column(length = 100, nullable = false)
    private String tipo;
    //    Na safra não foi colocado @Column, pois não é preciso impor nenhuma condição especifica
    private Integer safra;
    @NotNull
    @Positive
    @Column(nullable = false)
    private Integer volumeMl;
    @NotNull
    @Positive
    @Column(nullable = false)
    private BigDecimal preco;
    @NotNull
    @PositiveOrZero
    @Column(nullable = false)
    private Integer estoque;

    @Column(length = 100000)
    private String descricao;
    //  construtores vazios permitem que seja adicionado depois

    public Vinho() {
    }

    //  constrotores com parâmentros necessitam de uma definição
    public Vinho(String nome, BigDecimal preco, String tipoUva, Integer safra, Integer volumeMl, String tipo, Integer estoque) {
        this.nome = nome;
        this.tipo = tipo;
        this.tipoUva = tipoUva;
        this.safra = safra;
        this.volumeMl = volumeMl;
        this.preco = preco;
        this.estoque = estoque;
    }
}
