public class GerenciadorCliente {   
    public int Id { get; set; }
    public boolean Status { get; set; }

    public GerenciadorCliente() {}
    
    public GerenciadorCliente(int id, string status) {
        Id = id;
        Status = status;
    }
}