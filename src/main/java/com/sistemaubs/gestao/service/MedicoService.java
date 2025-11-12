package com.sistemaubs.gestao.service;

import com.sistemaubs.gestao.model.Medico;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MedicoService {

    private List<Medico> medicos = new ArrayList<>();

    public List<Medico> listarMedicos() {
        return medicos;
    }

    public Medico adicionarMedico(Medico medico) {
        medicos.add(medico);
        return medico;
    }

    public void removerMedico(Long id) {
        medicos.removeIf(m -> m.getId().equals(id));
    }
}


