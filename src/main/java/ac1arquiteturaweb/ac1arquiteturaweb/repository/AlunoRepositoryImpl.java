package ac1arquiteturaweb.ac1arquiteturaweb.repository;

import ac1arquiteturaweb.ac1arquiteturaweb.modelo.Aluno;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class AlunoRepositoryImpl implements AlunoRepository {
    private final List<Aluno> alunos = new ArrayList<>();
    private Long nextId = 1L;

    @Override
    public List<Aluno> getAlunos(){
        return alunos;
    }

        @Override
    public Aluno addAluno(Aluno aluno){
        aluno.setId((long) (alunos.size() + 1));
        alunos.add(aluno);
        return aluno;
    }

    @Override
    public Aluno getAlunoById(Long id){
        for (Aluno aluno : alunos) {
            if (aluno.getId().equals(id)) {
                return aluno;
            }
        }
        return null;
    }

    @Override
    public Aluno putAluno(Long id, Aluno alunoAtualizado){
                Aluno alunoExistente = getAlunoById(id);
        if (alunoExistente != null) {
            alunoExistente.setNome(alunoAtualizado.getNome());
            alunoExistente.setRa(alunoAtualizado.getRa());
            alunoExistente.setCurso(alunoAtualizado.getCurso());
            alunoExistente.setIdade(alunoAtualizado.getIdade());
            alunoExistente.setCelular(alunoAtualizado.getCelular());
        }
        return alunoExistente;
    }

    @Override
    public String deleteAluno(long id){
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getId().equals(id)) {
                alunos.remove(i);
                return "Aluno removido com sucesso.";
            }
        }
        return "Aluno não encontrado";
    }
    
}

