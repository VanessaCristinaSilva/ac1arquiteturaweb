package ac1arquiteturaweb.ac1arquiteturaweb.repository;

import ac1arquiteturaweb.ac1arquiteturaweb.modelo.Aluno;
import java.util.List;

public interface AlunoRepository {
    List<Aluno> getAlunos(); 
    Aluno addAluno(Aluno aluno);
    Aluno getAlunoById(Long id);
    Aluno putAluno(Long id, Aluno aluno);
    String deleteAluno(long id);
}
