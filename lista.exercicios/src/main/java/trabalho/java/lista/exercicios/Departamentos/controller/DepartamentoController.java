package trabalho.java.lista.exercicios.Departamentos.controller;

import trabalho.java.lista.exercicios.Departamentos.entity.Departamento;
import trabalho.java.lista.exercicios.Departamentos.service.DepartamentoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departamentos")
public class DepartamentoController {

    private final DepartamentoService service;

    public DepartamentoController(DepartamentoService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Departamento> criar(@RequestBody Departamento departamento) {
        Departamento novo = service.salvar(departamento);
        return new ResponseEntity<>(novo, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Departamento>> listar() {
        List<Departamento> lista = service.listarTodos();
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Departamento> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(dep -> new ResponseEntity<>(dep, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}