public class GerenciadorCliente {
    
    private String nome;
    private String endereco;
    private String novoNome;
    private String novoEndereco;

    public GerenciadorCliente(String nome, String endereco){
        
        setNome(nome);
        setendereco(endereco);

        int a=0;

        System.out.println("Deseja alterar os dados? (1-sim , 0-nao) : ");
        if(a=1){
            System.out.println("Digite o novo nome:");
            this.novoNome="carlos";
            System.out.println("Digite o novo endereco:");
            this.novoEndereco="rua A";

            AlterarNome(nome, novoNome, endereco, novoEndereco);
        }
        else{
            System.out.println("Certo!");
        }

        System.out.println("Deseja remover os dados? (1-sim , 0-nao) : ");
        if(a=1){
            System.out.println("Digite o nome para ser removido:");
            this.nome="carlos";

            RemoverDados(nome);
        }
        else{
            System.out.println("Certo!");
        }
    }

    public void AlterarNome(String nome, String novoNome, String endereco, String novoEndereco){
        if(this.nome == nome){
            setNovosDados(nome, novoNome,novoEndereco);
        }
        else{
            System.out.println("O nome está diferente!");
        }
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

    public void setNovosDados(String nome, String novoNome,String novoEndereco){
        if(this.nome == nome){
            this.nome = novoNome;
            this.endereco = novoEndereco;
        }
    }

}