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

    public Vinho buscarPorNome(String nome) {
        Optional<Vinho> optionalVinho = repository.findByNome(nome);
        return optionalVinho.orElseThrow(() -> new VinhoNaoEncontrado("Vinho não encontrado: " + nome));

    }

    public String vender(String nome, int quantidade) {

        Optional<Vinho> optionalVinho = repository.findByNome(nome);
        Vinho vinho = optionalVinho.orElseThrow(() -> new VinhoNaoEncontrado("Vinho não encontrado: " + nome));

        int estoque = vinho.getEstoque();

        if (quantidade > estoque) {
           throw new QuantidadeInvalida("Quantidade invalida! Estoque insuficiente.");
        }

        if (quantidade <= 0) {
            throw new QuantidadeInvalida("Quantidade invalida! A quantidade deve ser maior que zero.");
        }

        vinho.setEstoque(estoque - quantidade);
        repository.save(vinho);

        return "Compra realizada com sucesso!";
    }

    public String reporestoque(String nome, int quantidade){
        Optional<Vinho> optionalVinho = repository.findByNome(nome);
        Vinho vinho = optionalVinho.orElseThrow(()-> new VinhoNaoEncontrado("Vinho não encontrado!"));
        if (quantidade <= 0){
            throw new QuantidadeInvalida("Quantidade invalida! A quantidade deve ser maior que zero.");
        }
        vinho.setEstoque(vinho.getEstoque()+quantidade);
        repository.save(vinho);
        return "Estoque atualizado com sucesso!";
    }

    public List<Vinho> listarVinhos() {
        return repository.findAll();
    }


    public void cadastrarVinho(Vinho vinho) {
        repository.save(vinho);
    }

    public void deleteVinho(Long id) {
        repository.deleteById(id);
    }
}
