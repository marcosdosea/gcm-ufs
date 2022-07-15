public class Cliente{
    private String nome;
    private int idade;
    private String endereco;

    public Cliente(String nome,int idade,String endereco){
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Cliente [endereco=" + endereco + ", idade=" + idade + ", nome=" + nome + "]";
    }
}