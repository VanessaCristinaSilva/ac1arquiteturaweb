package ac1arquiteturaweb.ac1arquiteturaweb.services;

import ac1arquiteturaweb.ac1arquiteturaweb.modelo.Aluno;
import ac1arquiteturaweb.ac1arquiteturaweb.repository.AlunoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AlunoServiceImpl implements AlunoService{
    private final AlunoRepository alunoRepository;

    public AlunoServiceImpl(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    @Override
    public List<Aluno> obterAlunos(){
        return alunoRepository.getAlunos();
    }

    @Override
    public Aluno criarAluno(Aluno aluno){
        return alunoRepository.addAluno(aluno);
    }

    @Override
    public Aluno obterAlunoPorId(Long id){
        return alunoRepository.getAlunoById(id);
    }

    @Override
    public Aluno atualizarAluno(Long id, Aluno aluno){
        return alunoRepository.putAluno(id,aluno);
    }

    @Override
    public String deletarAluno(long id){
        return alunoRepository.deleteAluno(id);
    }

}