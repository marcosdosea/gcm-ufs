public class GerenciadorCliente{
  protected int id;
  protected String nome;

  private DAOCliente daoCliente = new DAOCliente();

  public int inserir(Cliente cliente) {
    this.id = cliente.id;
    this.nome = cliente.nome;
    return 1;
  }

  public int remover(Cliente cliente){
    daoCliente.delete(cliente)
  }
  
  public int atualizar(Cliente cliente){
    this.id = cliente.id;
    this.nome = cliente.nome;
    daoCliente.update(cliente);
  }
}
