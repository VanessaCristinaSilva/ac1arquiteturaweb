package ac1arquiteturaweb.ac1arquiteturaweb.services;

import ac1arquiteturaweb.ac1arquiteturaweb.modelo.Aluno;
import java.util.List;

public interface AlunoService {
    List<Aluno> obterAlunos(); 
    Aluno criarAluno(Aluno aluno);
    Aluno obterAlunoPorId(Long id);
    Aluno atualizarAluno(Long id, Aluno aluno);
    String deletarAluno(long id);
}