public class GerenciadorVenda {

    public int Id { get; set; }

    public Cliente Cliente { get; set; }

    public GerenciadorVenda(int id, Cliente cliente) {
        Id = id;
        Cliente = cliente;
    }

}