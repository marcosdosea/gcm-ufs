using System.Linq;
public class GerenciadorCliente
{
    public int Id { get; set; }
    public string Nome { get; set; }
    public double Salario { get; set; }
    public IList<Cliente> Clientes { get; set; }


    public GerenciadorCliente(int id, string nome, double salario)
    {
        this.Id = id;
        this.Nome = nome;
        this.Salario = salario;
    }
    public void inserir(Cliente cliente)
    {
        Console.WriteLine("Inserindo cliente");
        Clientes.add(cliente);
    }

    public Cliente consultar(IQueryable<Cliente> queryClientes)
    {
        Console.WriteLine("Consultando cliente");
        return queryClientes.FirstOrDefault();
    }

    public void remover(Cliente cliente)
    {
        Console.WriteLine("Removendo cliente");
        Clientes.remove(cliente);
    }

    public void alterar(Cliente cliente)
    {
        Console.WriteLine("Atualizando cliente");
        Clientes.update(cliente);
    }
}