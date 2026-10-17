package com.vinicola.deliveryvinicola.controller;

import com.vinicola.deliveryvinicola.dto.CompraDTO;
import com.vinicola.deliveryvinicola.dto.DescriDTO;
import com.vinicola.deliveryvinicola.dto.ReporDTO;
import com.vinicola.deliveryvinicola.model.Vinho;
import com.vinicola.deliveryvinicola.service.VinhoService;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/vinhos")
public class VinhoController {
    private final VinhoService vinhoService;

    public VinhoController(VinhoService vinhoService) {
        this.vinhoService = vinhoService;
    }


    @PostMapping("/vinho")
    public String cadastrarVinho(@RequestBody @Valid Vinho vinho) {
        vinhoService.cadastrarVinho(vinho);
        return "Vinho cadastrado com sucesso!";
    }

    @GetMapping("/listar")
    public List<Vinho> listarVinhos() {
        return vinhoService.listarVinhos();
    }

    @DeleteMapping("/{id}")
    public String deleteVinho(@PathVariable Long id) {
        vinhoService.deleteVinho(id);
        return "Vinho deletado com sucesso!";
    }

    @PostMapping("/venda")
    public String frentedeVenda(@RequestBody CompraDTO compraDTO) {
        String nomeVinho = compraDTO.getNomeVinho();
        int quantidade = compraDTO.getQuantidade();
        return vinhoService.vender(nomeVinho, quantidade);
    }

    @PostMapping("/repor")
    public String reporEstoque(@RequestBody @Valid ReporDTO reporDTO) {
        String nomeVinho = reporDTO.getNomeVinho();
        int quantidade = reporDTO.getQuantidade();
        return vinhoService.reporestoque(nomeVinho, quantidade);
    }

    @PostMapping("/descricao")
    public String addDescricao(@RequestBody DescriDTO descriDTO) {
        String nomeVinho = descriDTO.getNomeVinho();
        String descricaoVinho= descriDTO.getDescricaoVinho();
        return vinhoService.descri(nomeVinho, descricaoVinho);
    }
}
