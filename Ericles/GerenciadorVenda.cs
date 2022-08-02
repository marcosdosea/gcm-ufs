using System;
using System.Linq;
public class GerenciadorVenda
{
    public int Id { get; set; }
    public DateTime DateTime { get; set; }
    public double total { get; set; }
    public IList<Venda> Venda { get; set; }
    public Cliente cliente { get; set; }
    private GerenciadorCliente _gerenciadorCliente { get; set; }


    public GerenciadorVenda(int id, DateTime dateTime, double total, Cliente cliente)
    {
        this.Id = id;
        this.DateTime = dateTime;
        this.total = total;
        this.cliente = cliente;
    }
    

    public void inserir(Venda venda, ClienteContext context)
    {
        Console.WriteLine("Inserindo venda");
        Venda.add(venda);
        context.Vendas.add(venda);
        context.SaveChanges();
        _gerenciadorCliente.inserir(this.cliente);
    }

}