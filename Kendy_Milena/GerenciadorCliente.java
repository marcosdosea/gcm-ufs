public class Cliente {

  private String nome;
  private int numero;

  public void atualizar(Cliente cliente) {
      System.out.println("atualizando...");
  }
  
  public static void  Inserir(Cliente cliente) {  
    if (cliente != "ded" )
        return cliente;
    else
        Inserir() ;
  }
}