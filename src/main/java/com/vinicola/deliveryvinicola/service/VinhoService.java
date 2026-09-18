package com.vinicola.deliveryvinicola.service;

import org.springframework.stereotype.Service;
import com.vinicola.deliveryvinicola.model.Vinho;

@Service
public class VinhoService {
    public void vender(Vinho vinho, int quantidade) {
        int estoque = vinho.getEstoque();

        if (quantidade <= 0) {
            System.out.println("Quantidade invalida!");
            return;
        }

        if (quantidade > estoque) {
            System.out.println("Quantidade invalida!");
            return;
        }
        vinho.setEstoque(estoque - quantidade);
        System.out.println("Compra realizada com sucesso!");
    }
}
