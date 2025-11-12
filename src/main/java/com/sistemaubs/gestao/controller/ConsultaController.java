package com.sistemaubs.gestao.controller;

import com.sistemaubs.gestao.model.Consulta;
import com.sistemaubs.gestao.service.ConsultaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consultas")
public class ConsultaController {

    private final ConsultaService consultaService;

    public ConsultaController(ConsultaService consultaService) {
        this.consultaService = consultaService;
    }

    @GetMapping
    public List<Consulta> listarConsultas() {
        return consultaService.listarConsultas();
    }

    @PostMapping
    public Consulta adicionarConsulta(@RequestBody Consulta consulta) {
        return consultaService.adicionarConsulta(consulta);
    }

    @DeleteMapping("/{id}")
    public void removerConsulta(@PathVariable Long id) {
        consultaService.removerConsulta(id);
    }
}

