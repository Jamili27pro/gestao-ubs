package com.sistemaubs.gestao.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalTime;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Consulta {
    private Long id;
    private Long pacienteId;
    private Long medicoId;
    private LocalTime dataHora;
    private String observacoes;

    private Paciente paciente;
    private Medico medico;
}
