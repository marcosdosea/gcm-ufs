public class GerenciadorCliente {
    
    private String nome;
    private String endereco;

    public GerenciadorCliente(String nome, String endereco){
        setNome(nome);
        setendereco(endereco);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setendereco(String endereco) {
        this.endereco = endereco;
    }

    public String getendereco() {
        return endereco;
    }
}