package ac1arquiteturaweb.ac1arquiteturaweb.modelo;

public class Aluno{
    private Long id;
    private String nome;
    private String ra;
    private String curso;
    private int idade;
    private String celular;

    public Aluno(Long id, String nome, String ra, String curso, int idade, String celular) {
        this.id = id;
        this.nome = nome;
        this.ra = ra;
        this.curso = curso;
        this.idade = idade;
        this.celular = celular;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
}
