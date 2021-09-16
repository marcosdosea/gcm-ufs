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
     
    public Cliente buscar(int clientId){
        return this._clienteList.Find(cliente => cliente.codigo == clientId);
    }
}