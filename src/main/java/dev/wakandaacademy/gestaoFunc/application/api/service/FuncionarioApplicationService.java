package dev.wakandaacademy.gestaoFunc.application.api.service;

import dev.wakandaacademy.gestaoFunc.application.api.FuncionarioListResponse;
import dev.wakandaacademy.gestaoFunc.application.api.FuncionarioRequest;
import dev.wakandaacademy.gestaoFunc.application.api.FuncionarioResponse;
import dev.wakandaacademy.gestaoFunc.application.api.repository.FuncionarioRepository;
import dev.wakandaacademy.gestaoFunc.domain.Funcionario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
@RequiredArgsConstructor
public class FuncionarioApplicationService extends FuncionarioService {
    private final FuncionarioRepository funcionarioRepository;

    @Override
    public FuncionarioResponse criaFuncionario(FuncionarioRequest funcionarioRequest) {
        log.info("[inicia] FuncionarioApplicationService - criaFuncionario");
        Funcionario funcionario = funcionarioRepository.salva(new Funcionario(funcionarioRequest));
        log.info("[finaliza] FuncionarioApplicationService - criaFuncionario");
        return FuncionarioResponse.builder()
                .idFuncionario(funcionario.getIdFuncionario())
                .build();
    }

    @Override
    public List<FuncionarioListResponse> buscaTodosFuncionarios() {
        log.info("[inicia] FuncionarioApplicationService - buscaTodosClientes");
        List<Funcionario> funcionarios = FuncionarioRepository.buscaTodosFuncionarios();
        log.info("[finaliza] FuncionarioApplicationService - buscaTodosClientes");
        return FuncionarioListResponse.converte(funcionarios);
    }
}