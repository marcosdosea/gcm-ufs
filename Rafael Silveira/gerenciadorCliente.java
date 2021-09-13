public class Cliente {
    private String nome;
    private String CPF;
    private int codigo;
    private int id;

    public int inserir(String nome, String CPF) {
        this.nome = nome;
        this.CPF = CPF  
	this.codigo = new Random().nextInt();      
    }

    public Cliente alterarCliente(String nome,int cpf, int id){
        this.nome = cliente.nome;
        this.cpf = cliente.CPF;
	this.id = cliente.id;
    }
    
    public Cliente removerCliente(){

    }
}
