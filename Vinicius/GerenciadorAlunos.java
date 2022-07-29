import java.util.ArrayList;
import java.util.List;

public class GerenciadorAlunos {
    
    private String nome;
    private String turma;
    private List<String> disciplinas = new ArrayList<>();

    public GerenciadorAlunos(String nome, String turma, List<String> disciplinas){
        setNome(nome);
        setTurma(turma);
        setDisciplinas(disciplinas);
    }


    public static void main(String[] args) {
        List<String> disciplinas = new ArrayList<>();
        disciplinas.add("IA");
        disciplinas.add("Redes");
        disciplinas.add("BD2");
        disciplinas.add("ES2");

        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos("Vinícius", "2022.1", disciplinas);
        System.out.println(gerenciadorAlunos.nome);
        System.out.println(gerenciadorAlunos.turma);
        System.out.println(gerenciadorAlunos.disciplinas);

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getTurma() {
        return turma;
    }

    public void setDisciplinas(List<String> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public List<String> getDisciplinas() {
        return disciplinas;
    }
}