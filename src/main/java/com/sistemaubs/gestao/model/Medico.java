package com.sistemaubs.gestao.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor

public class Medico {
    private Long id;
    private String nome;
    private String especialidade;
}

