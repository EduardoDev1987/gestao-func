package dev.wakandaacademy.gestaoFunc.application.api.service;

import dev.wakandaacademy.gestaoFunc.application.api.FuncionarioListResponse;
import dev.wakandaacademy.gestaoFunc.application.api.FuncionarioRequest;
import dev.wakandaacademy.gestaoFunc.application.api.FuncionarioResponse;

import java.util.List;

public class FuncionarioService {
    FuncionarioResponse criaFuncionario(FuncionarioRequest funcionarioRequest);
    List<FuncionarioListResponse> buscaTodosFuncionarios();
}
