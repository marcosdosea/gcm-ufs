
public class GerenciadorCliente {
    
    public Integer id;
    public String nome; 
    public String endereco;
    
    public void inserir(String nome, String endereco){
	this.nome = nome;
	this.endereco = endereco;
    }
    
    public void consultar(int id){
        if(id == this.id)
            System.out.println("Usuario cadastrado");
        else
            System.out.println("Usuario nao esta cadastrado");
    }
    
}
