package com.vinicola.deliveryvinicola.service;

import com.vinicola.deliveryvinicola.repository.VinhoRepository;
import org.springframework.stereotype.Service;
import com.vinicola.deliveryvinicola.model.Vinho;

import java.util.List;
import java.util.Optional;

@Service
public class VinhoService {

    private final VinhoRepository repository;

    public VinhoService(VinhoRepository repository) {
        this.repository = repository;
    }

    public List<Vinho> buscarPorNome(String nome) {
        return repository.findByNome(nome);
    }

    public void vender(Long id, int quantidade) {

        Optional<Vinho> Optionalvinho = repository.findById(id);

        if (Optionalvinho.isPresent()) {
            Vinho vinho = Optionalvinho.get();

            int estoque = vinho.getEstoque();

            if (quantidade > estoque) {
                System.out.println("Quantidade invalida!");
                return;
            }

            if (quantidade <= 0) {
                System.out.println("Quantidade invalida!");
                return;
            }

            vinho.setEstoque(estoque - quantidade);
            repository.save(vinho);

            System.out.println("Compra realizada com sucesso!");

        } else {
            System.out.println("Vinho n encontrado no estoque");
        }
    }

    public List<Vinho> listarVinhos() {
        return repository.findAll();
    }
}
