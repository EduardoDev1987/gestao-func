package dev.wakandaacademy.gestaoFunc.application.api.repository;

import dev.wakandaacademy.gestaoFunc.domain.Funcionario;

import java.awt.*;

public interface FuncionarioRepository {
    Funcionario salva(Funcionario funcionario);
    List<Funcionario> buscaTodosFuncionarios();
}
