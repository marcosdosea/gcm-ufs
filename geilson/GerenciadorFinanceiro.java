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

class Transacao {
    private static int proximoId = 1;
    private int id;
    private String descricao;
    private double valor;
    private LocalDate data;
    private TipoTransacao tipo;
    private Categoria categoria;

    public Transacao(String descricao, double valor, LocalDate data, TipoTransacao tipo, Categoria categoria) {
        this.id = proximoId++;
        this.descricao = descricao;
        this.valor = valor;
        this.data = data;
        this.tipo = tipo;
        this.categoria = categoria;
    }

    // Getters e Setters
    public int getId() { return id; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = valor; }
    public LocalDate getData() { return data; }
    public void setData(LocalDate data) { this.data = data; }
    public TipoTransacao getTipo() { return tipo; }
    public void setTipo(TipoTransacao tipo) { this.tipo = tipo; }
    public Categoria getCategoria() { return categoria; }
    public void setCategoria(Categoria categoria) { this.categoria = categoria; }

    @Override
    public String toString() {
        return String.format("ID: %d | %s | R$ %.2f | %s | %s | %s",
                id, descricao, valor, data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                tipo, categoria.getNome());
    }
}