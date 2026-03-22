package trabalho.java.lista.exercicios.Projetos.repository;

import trabalho.java.lista.exercicios.Projetos.entity.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetoRepository extends JpaRepository<Projeto, Long> {
}