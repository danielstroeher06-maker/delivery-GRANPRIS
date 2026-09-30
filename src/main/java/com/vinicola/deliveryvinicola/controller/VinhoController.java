package com.vinicola.deliveryvinicola.controller;

import com.vinicola.deliveryvinicola.dto.CompraDTO;
import com.vinicola.deliveryvinicola.model.Vinho;
import com.vinicola.deliveryvinicola.service.VinhoService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vinhos")
public class VinhoController {
    private final VinhoService vinhoService;

    public VinhoController(VinhoService vinhoService) {
        this.vinhoService = vinhoService;
    }

    @GetMapping
    public List<Vinho> buscarPorNome(@RequestParam String nome) {
        return vinhoService.buscarPorNome(nome);
    }

    @GetMapping("/listar")
    public List<Vinho> listarVinhos() {
        return vinhoService.listarVinhos();
    }

    @PostMapping("/vinho")
    public void cadastrarVinho(@RequestBody Vinho vinho) {
        vinhoService.cadastrarVinho(vinho);
    }

    @PostMapping("/venda")
    public void frentedeVenda(@RequestBody CompraDTO compraDTO) {
        Long idVinho = compraDTO.getIdVinho();
        int quantidade = compraDTO.getQuantidade();
        vinhoService.vender(idVinho, quantidade);
    }
}
