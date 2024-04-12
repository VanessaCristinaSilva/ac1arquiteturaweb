package ac1arquiteturaweb.ac1arquiteturaweb.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import ac1arquiteturaweb.ac1arquiteturaweb.modelo.Aluno;
import ac1arquiteturaweb.ac1arquiteturaweb.services.AlunoService;


@SpringBootApplication
@RestController

@RequestMapping("/alunos")
public class AlunoController {
private final AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @GetMapping
    public List<Aluno> obterAlunos() {
        return alunoService.obterAlunos();
    }

    @PostMapping("/add")
    public Aluno criarAluno(@RequestBody Aluno aluno) {
        return alunoService.criarAluno(aluno);
    }

    @GetMapping("/{id}")
    public Aluno obterAlunoPorId(@PathVariable Long id) {
        return alunoService.obterAlunoPorId(id);
    }

    @PutMapping("/{id}")
    public Aluno atualizarAluno(@PathVariable Long id, @RequestBody 
    Aluno alunoAtualizado) {
        return alunoService.atualizarAluno(id, alunoAtualizado);
    }

    @DeleteMapping("/{id}")
    public String deletarAluno(@PathVariable Long id) {
        return alunoService.deletarAluno(id);
    }

}
