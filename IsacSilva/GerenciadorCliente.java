public class GerenciadorCliente {
    
   private String nome;
   
   private String cpf;
    
   
   public GerenciadorCliente(){
   
   
   }
   
   public String getNome(){
   
   return nome;
   }
   
   public void setNome(String name){
   
   this.nome = name;
   }
   
   public String getCpf(){
   
   return cpf;
   }
   
   public void setCpf(String cpf ){
   
   this.cpf = cpf;
   }
   // Metodo para exibir as infromações armazenadas nos atributos da classe.
	public void exibirCliente(){
		System.out.println("Nome: "+getNome()+"\nCPF: "+getCpf()+"\nCodigo do Produto: "+getCod());
	}
   
}