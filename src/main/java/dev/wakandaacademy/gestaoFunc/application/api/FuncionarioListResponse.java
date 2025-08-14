package dev.wakandaacademy.gestaoFunc.application.api;

import dev.wakandaacademy.gestaoFunc.domain.Funcionario;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Value;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Value
public class FuncionarioListResponse {
    private UUID idFuncionario;
    private String nomeFunc;
    private String designacaoFunc;
    private String salarioFunc;
    private String telefone;
    private String endereco;

    public static List<FuncionarioListResponse> converte(List<Funcionario> funcionarios) {
        return funcionarios.stream()
                    .map(FuncionarioListResponse :: new)
                    .collect(Collectors.toList());

       }

        private FuncionarioListResponse(Funcionario  funcionario) {
            this.idFuncionario = funcionario.getIdFuncionario();
            this.nomeFunc = funcionario.getNomeFunc();
            this.designacaoFunc = funcionario.getDesignacaoFunc();
            this.salarioFunc = funcionario.getSalarioFunc();
            this.telefone = funcionario.getTelefone();
            this.endereco = funcionario.getEndereco();

        }
}
