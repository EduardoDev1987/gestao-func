package dev.wakandaacademy.gestaoFunc.domain;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import org.springframework.data.annotation.Id;

import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Funcionario {
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

    public Funcionario(UUID idFuncionario, String nomeFuncionario, String designacaoFuncionario, String salarioFunc, String telefone, String endereco) {
        this.idFuncionario = idFuncionario;
        this.nomeFunc = nomeFuncionario;
        this.designacaoFunc = designacaoFuncionario;
        this.salarioFunc = salarioFunc;
        this.telefone = telefone;
        this.endereco = endereco;
    }
}
