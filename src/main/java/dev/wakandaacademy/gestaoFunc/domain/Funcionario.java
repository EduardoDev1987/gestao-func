package dev.wakandaacademy.gestaoFunc.domain;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Generated;
import lombok.Getter;
import lombok.NoArgsConstructor;
import jakarta.persistence.Entity;
import org.springframework.data.annotation.Id;



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
    private String nomeFuncionario;
    @NotBlank
    private String designacaoFuncionario;
    @NotBlank
    private String salarioFuncionario;
    @NotEmpty
    private String telefone;
    @NotEmpty
    private String endereco;

}
