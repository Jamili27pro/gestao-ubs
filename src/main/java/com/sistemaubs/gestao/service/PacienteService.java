package com.sistemaubs.gestao.service;

import com.sistemaubs.gestao.model.Paciente;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class PacienteService {

    private List<Paciente> pacientes = new ArrayList<>();

    public List<Paciente> listarPacientes() {
        return pacientes;
    }

    public Paciente adicionarPaciente(Paciente paciente) {
        pacientes.add(paciente);
        return paciente;
    }

    public void removerPaciente(Long id) {
        pacientes.removeIf(p -> p.getId().equals(id));
    }
}


