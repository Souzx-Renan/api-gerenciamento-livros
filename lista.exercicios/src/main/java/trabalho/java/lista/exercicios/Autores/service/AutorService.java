package trabalho.java.lista.exercicios.Autores.service;

import trabalho.java.lista.exercicios.Autores.entity.Autores;
import trabalho.java.lista.exercicios.Autores.repository.AutorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutorService {

    private final AutorRepository repository;

    public AutorService(AutorRepository repository) {
        this.repository = repository;
    }

    public Autores salvar(Autores autor) {
        return repository.save(autor);
    }

    public List<Autores> listarTodos() {
        return repository.findAll();
    }

    public Optional<Autores> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}