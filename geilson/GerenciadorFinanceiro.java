import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

// Enum para tipos de transação
enum TipoTransacao {
    RECEITA, DESPESA
}

// Classe para representar uma categoria
class Categoria {
    private String nome;
    private String descricao;

    public Categoria(String nome, String descricao){
        this.nome = nome;
        this.descricao = descricao;
    }

    // Getters e Setters
    public String getNome() { return nome;}
    public void setNome(String nome) { this.nome = nome;}
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    @Override
    public String toString(){
        return nome + " - " + descricao;
    }
}