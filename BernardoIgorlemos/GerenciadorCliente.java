import java.util.ArrayList;
import java.util.List;

public class GerenciadorCliente{
  private String nome;
  private int idade;
  private String dataNascimento;
<<<<<<< HEAD
  private ArrayList <Cliente> listclient = new ArrayList<>(); 
  public void criarCliente(String nome, int id, String dataNascimento){
   listclient.add(new Cliente(nome, id, dataNascimento));

=======

  public void criarCliente(String nome, int id, String dataNascimento){
    //criador cliente
>>>>>>> 8bee4f9ac8a98a6a755d6509fd3035de395209bc
  }
  public void atualizarCliente(String nome, int id, String dataNascimento){
    //atualizar cliente
  }
}
