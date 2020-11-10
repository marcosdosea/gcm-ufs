public class GerenciadorCliente {   
    public int Id { get; set; }
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
}