public class GerenciadorCliente{
  protected int id;
  protected String nome;

  public int inserir(Cliente cliente) {
    this.id = cliente.id;
    this.nome = cliente.nome;
    return 1;
  }
}
