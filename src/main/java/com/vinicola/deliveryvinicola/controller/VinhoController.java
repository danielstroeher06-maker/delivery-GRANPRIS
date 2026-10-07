package com.vinicola.deliveryvinicola.controller;

import com.vinicola.deliveryvinicola.dto.CompraDTO;
import com.vinicola.deliveryvinicola.dto.ReporDTO;
import com.vinicola.deliveryvinicola.model.Vinho;
import com.vinicola.deliveryvinicola.service.VinhoService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping("/vinhos")
public class VinhoController {
    private final VinhoService vinhoService;

    public VinhoController(VinhoService vinhoService) {
        this.vinhoService = vinhoService;
    }


    @PostMapping("/vinho")
    public void cadastrarVinho(@RequestBody Vinho vinho) {
        vinhoService.cadastrarVinho(vinho);
    }

    @DeleteMapping("/{id}")
    public void deleteVinho(@PathVariable Long id) {
        vinhoService.deleteVinho(id);
    }

    @PostMapping("/venda")
    public String frentedeVenda(@RequestBody CompraDTO compraDTO) {
        String nomeVinho = compraDTO.getNomeVinho();
        int quantidade = compraDTO.getQuantidade();
        return vinhoService.vender(nomeVinho, quantidade);
    }

    @PostMapping("/repor")
    public String reporEstoque(@RequestBody ReporDTO reporDTO) {
        String nomeVinho = reporDTO.getNomeVinho();
        int quantidade = reporDTO.getQuantidade();
        return vinhoService.reporestoque(nomeVinho, quantidade);
    }
}
