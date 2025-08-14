package dev.wakandaacademy.gestaoFunc.application.api;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import org.springframework.data.annotation.Id;

import java.util.UUID;

public class FuncionarioRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid", name ="id", updatable = false, unique = true, nullable = false)
    private UUID idFuncionario;
    @NotEmpty
    @Column(unique = true)
    private String nomeFunc;
    @NotBlank
    private String designacaoFunc;
    @NotBlank
    private String salarioFunc;
    @NotEmpty
    private String telefone;
    @NotEmpty
    private String endereco;
}
