public class Cliente {
    private String nome;
    private String CPF;
    private int codigo;

    public int inserir(String nome, String CPF) {
        this.nome = nome;
        this.CPF = CPF  
	this.codigo = new Random().nextInt();      
    }

    public Cliente alterarCliente(String nome,int cpf){
        this.nome = cliente.nome;
        this.cpf = cliente.CPF;
    }
    
    public Cliente removerCliente(){

    }
}
