package trabalho.java.lista.exercicios.Categorias.repository;

import trabalho.java.lista.exercicios.Categorias.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriasRepository extends JpaRepository<Categoria, Long> {
}