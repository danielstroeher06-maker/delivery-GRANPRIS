package com.vinicola.deliveryvinicola;

import com.vinicola.deliveryvinicola.model.Vinho;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        int sair = -1;

        Vinho v1 = new Vinho();

        v1.setNome("Granpris");
        v1.setTipoUva("Merlot");
        v1.setSafra(1990);
        v1.setVolumeMl(750);
        v1.setPreco(250.0);
        v1.setEstoque(5);
        Scanner intProduto = new Scanner(System.in);
        while (sair != 0) {

            System.out.println("quer continuar? 1-sim 0-não. ");
            sair = intProduto.nextInt();

            if (sair == 0) {
                System.out.println("Saindo do programa...");
                break;
            } else if (sair < 0 || sair > 1){
                System.out.println("404 - Opção invalida.");
                continue;
            }
            System.out.println("Quanntidade:  ");
            int quantidade = intProduto.nextInt();
            Integer estoque = v1.getEstoque();
            if (quantidade <= 0) {
                System.out.println("quantidade invalida.");
                return;
            }

            if (estoque - quantidade < 0) {
                System.out.println("estoque insuficiente.");
                return;
            }
            v1.setEstoque(estoque - quantidade);
            System.out.println("Compra realizada com sucesso!");

            estoque = v1.getEstoque();
        }

        System.out.println(v1.getNome());
        System.out.println(v1.getTipoUva());
        System.out.println(v1.getSafra());
        System.out.println(v1.getVolumeMl() + "ml");
        System.out.println(v1.getPreco());

    }
}
