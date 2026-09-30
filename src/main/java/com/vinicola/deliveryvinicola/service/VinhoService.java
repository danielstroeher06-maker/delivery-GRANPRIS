package com.vinicola.deliveryvinicola.service;

import com.vinicola.deliveryvinicola.exception.QuantidadeInvalida;
import com.vinicola.deliveryvinicola.exception.VinhoNaoEncontrado;
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

        Optional<Vinho> optionalVinho = repository.findById(id);
        Vinho vinho = optionalVinho.orElseThrow(() -> new VinhoNaoEncontrado("Vinho não encontrado."));

        int estoque = vinho.getEstoque();

        if (quantidade > estoque) {
            throw new QuantidadeInvalida("Quantidade invalida! Estoque insuficiente.");
        }

        if (quantidade <= 0) {
            throw new QuantidadeInvalida("Quantidade invalida! A quantidade deve ser maior que zero.");
        }

        vinho.setEstoque(estoque - quantidade);
        repository.save(vinho);

        System.out.println("Compra realizada com sucesso!");

    }

    public List<Vinho> listarVinhos() {
        return repository.findAll();
    }

    public void cadastrarVinho(Vinho vinho) {
        repository.save(vinho);
    }
}
