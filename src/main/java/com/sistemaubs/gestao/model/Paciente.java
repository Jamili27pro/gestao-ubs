package com.sistemaubs.gestao.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor

public class Paciente {
    private Long id;
    private String nome;
    private String cpf;
    private String telefone;
}
