package com.vinicola.deliveryvinicola.model;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "Vinho")
@Data
public class Vinho {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //    Colocamos o @Colum para que possa haver um numero de caracteres limite no nome e para que ele não possa aceitar o null
    @Column(length = 100, nullable = false)
    private String nome;
    @Column(length = 100, nullable = false)
    private String tipoUva;
    @Column(length = 100, nullable = false)
    private String tipo;
    @Column(nullable = false)
//    Na safra não foi colocado @Colum pois não é preciso impor nenhuma condição especifica
    private Integer safra;
    @Column(nullable = false)
    private Integer volumeMl;
    @Column(nullable = false)
    private Double preco;
    @Column(nullable = false)
    private Integer estoque;


    @Column(length = 1000)
    private String descricao;
//  construtores vazios permitem que seja adicionado depois
    public Vinho() {
    }
//  constrotores com parâmentros necessitam de um definição
    public Vinho(Long id, String nome, Double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }
}
