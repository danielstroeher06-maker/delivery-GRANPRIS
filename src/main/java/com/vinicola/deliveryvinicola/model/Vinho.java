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
    //    Colocamos o @Colum para que, possa haver um número de caracteres limite no nome e para que ele não possa aceitar o null
    @Column(length = 100, nullable = false)
    private String nome;
    @Column(length = 100, nullable = false)
    private String tipoUva;
    @Column(length = 100, nullable = false)
    private String tipo;
    @Column(nullable = false)
//    Na safra não foi colocado @Colum, pois não é preciso impor nenhuma condição especifica
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

    public String getNome() {
        return nome;
    }

    public String getTipoUva() {
        return tipoUva;
    }


    public Integer getSafra() {
        return safra;
    }

    public Integer getVolumeMl() {
        return volumeMl;
    }

    public Integer getEstoque() {
        return estoque;
    }

    public Double getPreco() {
        return preco;
    }

    public Vinho() {
    }

    //  constrotores com parâmentros necessitam de uma definição
    public Vinho(String nome, Double preco, String tipoUva, Integer safra, Integer volumeMl) {
        this.nome = nome;
        this.tipoUva = tipoUva;
        this.safra = safra;
        this.volumeMl = volumeMl;
        this.preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipoUva(String tipoUva) {
        this.tipoUva = tipoUva;
    }

    public void setSafra(Integer safra) {
        this.safra = safra;
    }

    public void setVolumeMl(Integer volumeMl) {
        this.volumeMl = volumeMl;
    }

    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

}
