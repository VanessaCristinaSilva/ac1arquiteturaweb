package ac1arquiteturaweb.ac1arquiteturaweb.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import ac1arquiteturaweb.ac1arquiteturaweb.modelo.Aluno;



@SpringBootApplication
@RestController

@RequestMapping("/alunos")
public class AlunoController {
private List<Aluno> alunos = new ArrayList<>();
    private Long nextId = 1L;

    @GetMapping
    public List<Aluno> obterAlunos() {
        return alunos;
    }

    @PostMapping("/add")
    public Aluno criarAluno(@RequestBody Aluno aluno) {
        aluno.setId((long) (alunos.size() + 1));
        alunos.add(aluno);
        return aluno;
    }

    @GetMapping("/{id}")
    public Aluno obterAlunoPorId(@PathVariable Long id) {
        for (Aluno aluno : alunos) {
            if (aluno.getId().equals(id)) {
                return aluno;
            }
        }
        return null;
    }

    @PutMapping("/{id}")
    public Aluno atualizarAluno(@PathVariable Long id, @RequestBody 
    Aluno alunoAtualizado) {
        Aluno alunoExistente = obterAlunoPorId(id);
        if (alunoExistente != null) {
            alunoExistente.setNome(alunoAtualizado.getNome());
            alunoExistente.setRa(alunoAtualizado.getRa());
            alunoExistente.setCurso(alunoAtualizado.getCurso());
            alunoExistente.setIdade(alunoAtualizado.getIdade());
            alunoExistente.setCelular(alunoAtualizado.getCelular());
        }
        return alunoExistente;
    }

    @DeleteMapping("/{id}")
    public String deletarAluno(@PathVariable Long id) {
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getId().equals(id)) {
                alunos.remove(i);
                return "Aluno removido com sucesso.";
            }
        }
        return "Aluno não encontrado";
    }
}
