package dev.wakandaacademy.gestaoFunc.application.api;

import dev.wakandaacademy.gestaoFunc.application.api.service.FuncionarioService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
@RequiredArgsConstructor
public class FuncionarioController implements FuncionarioApi {
    private final FuncionarioService funcionarioService;

        @Override
        public FuncionarioResponse postFuncionario(FuncionarioRequest funcionarioRequest) {
            log.info("[inicia] FuncionarioController  postFuncionario");
            FuncionarioResponse funcionarioCriado = FuncionarioService.criaFuncionario(funcionarioRequest);
            log.info("[finaliza] FuncionarioController - postFuncionario");
            return funcionarioCadastrado;
        }
}
