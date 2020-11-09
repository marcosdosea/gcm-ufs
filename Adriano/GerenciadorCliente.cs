public class GerenciadorCliente {   
    public int Id { get; set; }
    public string Nome { get; set; }

    public GerenciadorCliente() {}
    
    public GerenciadorCliente(int id, string nome) {
        Id = id;
        Nome = nome;
    }
}