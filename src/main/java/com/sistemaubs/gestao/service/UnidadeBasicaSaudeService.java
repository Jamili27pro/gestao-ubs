package com.sistemaubs.gestao.service;

import com.sistemaubs.gestao.model.UnidadeBasicaSaude;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UnidadeBasicaSaudeService {

    private List<UnidadeBasicaSaude> unidades = new ArrayList<>();

    public List<UnidadeBasicaSaude> listarUnidades() {
        return unidades;
    }

    public UnidadeBasicaSaude adicionarUnidade(UnidadeBasicaSaude unidade) {
        unidades.add(unidade);
        return unidade;
    }

    public void removerUnidade(Long id) {
        unidades.removeIf(u -> u.getId().equals(id));
    }
}
