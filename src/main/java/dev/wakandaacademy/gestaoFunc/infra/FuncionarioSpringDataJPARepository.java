package dev.wakandaacademy.gestaoFunc.infra;

import dev.wakandaacademy.gestaoFunc.domain.Funcionario;

import java.util.Optional;
import java.util.UUID;

public interface FuncionarioSpringDataJPARepository extends JpaRepository{

    Optional<Funcionario> findByIdFuncionario(UUID idFuncionario);}
