public class GerenciadorCliente {   
    public int Id { get; set; }
    public string Nome { get; set; }
    
    public GerenciadorCliente(int id, string nome) {
        Id = id;
        Nome = nome;
      
    public boolean Status { get; set; }
    
    public ICollection <Cliente> Clientes { get; set; } 
            = new List<Cliente>();

    public GerenciadorCliente() {}
    
    public GerenciadorCliente(int id, string status) {
        Id = id;
        Status = status;
    }

    public void AddCliente(Cliente cliente) {
        Clientes.Add(cliente);
    }

    public void RemoverCliente(Cliente cliente) {
        Clientes.Remove(cliente);
    }
}