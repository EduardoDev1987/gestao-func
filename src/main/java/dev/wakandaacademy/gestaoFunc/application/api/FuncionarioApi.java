package dev.wakandaacademy.gestaoFunc.application.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/funcionario")
public interface FuncionarioApi {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    FuncionarioResponse postFuncionario(@Valid @RequestBody FuncionarioRequest funcionarioRequest);

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    List<FuncionarioListResponse> getTodosFuncionario();

}