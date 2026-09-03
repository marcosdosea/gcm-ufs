import java.util.ArrayList;
import java.util.List;

public class GerenciadorCliente{
  private String nome;
  private int idade;
  private String dataNascimento;
  private ArrayList <Cliente> listclient = new ArrayList<>(); 
  public void criarCliente(String nome, int id, String dataNascimento){
   listclient.add(new Cliente(nome, id, dataNascimento));

  }
  public void atualizarCliente(String nome, int id, String dataNascimento){
    //atualizar cliente 
  }
}
