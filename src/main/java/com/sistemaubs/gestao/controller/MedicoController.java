package com.sistemaubs.gestao.controller;

import com.sistemaubs.gestao.model.Medico;
import com.sistemaubs.gestao.service.MedicoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    private final MedicoService medicoService;

    public MedicoController(MedicoService medicoService) {
        this.medicoService = medicoService;
    }

    @GetMapping
    public List<Medico> listarMedicos() {
        return medicoService.listarMedicos();
    }

    @PostMapping
    public Medico adicionarMedico(@RequestBody Medico medico) {
        return medicoService.adicionarMedico(medico);
    }

    @DeleteMapping("/{id}")
    public void removerMedico(@PathVariable Long id) {
        medicoService.removerMedico(id);
    }
}

