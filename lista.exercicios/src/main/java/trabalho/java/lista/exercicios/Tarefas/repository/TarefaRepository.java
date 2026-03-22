package trabalho.java.lista.exercicios.Tarefas.repository;

import trabalho.java.lista.exercicios.Tarefas.entity.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}