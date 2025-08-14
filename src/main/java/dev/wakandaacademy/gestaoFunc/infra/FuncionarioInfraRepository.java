package dev.wakandaacademy.gestaoFunc.infra;


import dev.wakandaacademy.gestaoFunc.application.api.repository.FuncionarioRepository;
import dev.wakandaacademy.gestaoFunc.domain.Funcionario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Repository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
    @Log4j2
    @RequiredArgsConstructor
    public class FuncionarioInfraRepository implements FuncionarioRepository {
        private final FuncionarioSpringDataJPARepository FuncionarioSpringDataJPARepository;

        @Override
        public Funcionario salva(Funcionario funcionario) {
            log.info("[inicia] FuncionarioInfraRepository - salva");
            try {
                FuncionarioSpringDataJPARepository.save(funcionario);
            } catch (DataIntegrityViolationException e) {
                throw APIException.build(HttpStatus.BAD_REQUEST, "Existem dados duplicados", e);
            }
            log.info("[finaliza] ClienteInfraRepository - salva");
            return funcionario;
        }
        public List<Funcionario> buscaTodosFuncionarios(List<Funcionario> todosFuncionarios) {
            log.info("[inicia] FuncionarioInfraRepository - buscaTodosFuncionarios");
            List<Funcionario> todosFuncionarios = FuncionarioSpringDataJPARepository.findAll();
            log.info("[finaliza] FuncionarioInfraRepository - buscaTodosFuncionarios");
            return todosFuncionarios;
}
