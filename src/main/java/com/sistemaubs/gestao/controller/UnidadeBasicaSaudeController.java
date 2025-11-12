package com.sistemaubs.gestao.controller;

import com.sistemaubs.gestao.model.UnidadeBasicaSaude;
import com.sistemaubs.gestao.service.UnidadeBasicaSaudeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/unidades")
public class UnidadeBasicaSaudeController {

    private final UnidadeBasicaSaudeService unidadeService;

    public UnidadeBasicaSaudeController(UnidadeBasicaSaudeService unidadeService) {
        this.unidadeService = unidadeService;
    }

    @GetMapping
    public List<UnidadeBasicaSaude> listarUnidades() {
        return unidadeService.listarUnidades();
    }

    @PostMapping
    public UnidadeBasicaSaude adicionarUnidade(@RequestBody UnidadeBasicaSaude unidade) {
        return unidadeService.adicionarUnidade(unidade);
    }

    @DeleteMapping("/{id}")
    public void removerUnidade(@PathVariable Long id) {
        unidadeService.removerUnidade(id);
    }
}

