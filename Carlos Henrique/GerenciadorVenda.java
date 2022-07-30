public class GerenciadorVenda {
    double valor;
    int quantidade;
    int codigo;
    String nome;
    
    GerenciadorCliente cliente;

    public GerenciadorVendas(double valor, int quantidade, int codigo, String nome) {
        this.valor = valor;
        this.quantidade = quantidade;
        this.codigo = codigo;
        this.nome = nome;
        cliente = nome;
    }

    public double getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }
}
