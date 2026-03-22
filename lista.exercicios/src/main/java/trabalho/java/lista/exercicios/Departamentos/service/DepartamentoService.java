package trabalho.java.lista.exercicios.Departamentos.service;

import trabalho.java.lista.exercicios.Departamentos.entity.Departamento;
import trabalho.java.lista.exercicios.Departamentos.repository.DepartamentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartamentoService {

    private final DepartamentoRepository repository;

    public DepartamentoService(DepartamentoRepository repository) {
        this.repository = repository;
    }

    public Departamento salvar(Departamento departamento) {
        return repository.save(departamento);
    }

    public List<Departamento> listarTodos() {
        return repository.findAll();
    }

    public Optional<Departamento> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}