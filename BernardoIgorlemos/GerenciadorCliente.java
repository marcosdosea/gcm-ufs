public class GerenciadorCliente{
  private String nome;
  private int idade;
  private String dataNascimento;

  public Cliente criarCliente(String nome, int id, String dataNascimento){
   return new Cliente(nome, id, dataNascimento); 

  }
  public void atualizarCliente(String nome, int id, String dataNascimento){
    //atualizar cliente 
  }
}
