package com.sistemaubs.gestao.service;

import com.sistemaubs.gestao.repository.ConsultaRepository;
import com.sistemaubs.gestao.model.Consulta;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ConsultaService {

    private final ConsultaRepository consultaRepository;
    private final PacienteService pacienteService;
    private final MedicoService medicoService;

    public ConsultaService(ConsultaRepository consultaRepository,
                           PacienteService pacienteService,
                           MedicoService medicoService) {

        this.consultaRepository = consultaRepository;
        this.pacienteService = pacienteService;
        this.medicoService = medicoService;
    }

    public List<Consulta> listarConsultas() {
        List<Consulta> consultas = consultaRepository.listarConsultas();

        // Preenche dados completos em cada consulta
        consultas.forEach(c -> {
            c.setPaciente(pacienteService.pegarPacienteId(c.getPacienteId()));
            c.setMedico(medicoService.pegarMedicoId(c.getMedicoId()));
        });

        return consultas;
    }

    public Consulta adicionarConsulta(Consulta consulta) {
        Consulta novaConsulta = consultaRepository.adicionarConsulta(consulta);

        novaConsulta.setPaciente(
                pacienteService.pegarPacienteId(novaConsulta.getPacienteId())
        );
        novaConsulta.setMedico(
                medicoService.pegarMedicoId(novaConsulta.getMedicoId())
        );

        return novaConsulta;
    }

    public void removerConsulta(Long id) {
        consultaRepository.removerConsulta(id);
    }

    public Consulta pegarConsultaId(Long id){
        Consulta consulta = consultaRepository.pegarConsultaId(id);

        consulta.setPaciente(
                pacienteService.pegarPacienteId(consulta.getPacienteId())
        );
        consulta.setMedico(
                medicoService.pegarMedicoId(consulta.getMedicoId())
        );

        return consulta;
    }

    public Consulta editarConsulta(Long id, Consulta consultaEditada) {
        Consulta editada = consultaRepository.editarConsulta(id, consultaEditada);

        editada.setPaciente(
                pacienteService.pegarPacienteId(editada.getPacienteId())
        );
        editada.setMedico(
                medicoService.pegarMedicoId(editada.getMedicoId())
        );

        return editada;
    }
}
