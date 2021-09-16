class Cliente
{
    public int Codigo { get; set; }
    public string Name { get; set; }

    public Cliente(int id, string name){
        this.Codigo = id;
        this.Name = name;
    }
}

class GerenciadorCliente
{
    private List<Cliente> _clienteList = new List<Cliente>();

    public void inserir(Cliente cliente){
        this._clienteList.add(cliente);
    }
    public void remover(int clienteId){
        var clienteToRemove = this._clienteList.SingleOrDefault(c => c.Codigo == clienteId);
        if (clienteToRemove != null)
        this._clienteList.Remove(clienteToRemove);
    } 
}