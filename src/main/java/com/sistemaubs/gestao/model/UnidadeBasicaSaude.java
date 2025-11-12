package com.sistemaubs.gestao.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor


public class UnidadeBasicaSaude {
    private Long id;
    private String nome;
    private String endereco;
    private String telefone;
}
