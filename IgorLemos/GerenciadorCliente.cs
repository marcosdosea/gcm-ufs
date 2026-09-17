using System;
using System.Collections.Generic;
using System.Linq;
 
public class GerenciadorVenda
{
    private List<Venda> _vendas = new List<Venda>();
 
    public void Inserir(Venda venda)
    {
        if (venda == null)
            throw new ArgumentNullException(nameof(venda));
 
        _vendas.Add(venda);
    }
 
    public Venda Consultar(int id)
    {
        return _vendas.FirstOrDefault(v => v.Id == id);
    }
 
    // ---------- Finalizar ----------
    // Só faz sentido finalizar uma venda que ainda está em aberto.
    public bool Finalizar(int id)
    {
        var venda = Consultar(id);
        if (venda == null)
            return false;
 
        if (venda.Status != StatusVenda.EmAberto)
            throw new InvalidOperationException(
                $"Não é possível finalizar uma venda com status {venda.Status}.");
 
        venda.Status = StatusVenda.Finalizada;
        return true;
    }

    // ---------- Remover ----------
public bool Remover(int id)
{
    var cliente = Consultar(id);
    if (cliente == null)
        return false;

    _clientes.Remove(cliente);
    return true;
}
// ---------- Alterar ----------
public bool Alterar(int id, string novoNome, string novoEmail, string novoTelefone)
{
    var cliente = Consultar(id);
    if (cliente == null)
        return false;

    cliente.Nome = novoNome;
    cliente.Email = novoEmail;
    cliente.Telefone = novoTelefone;
    return true;
}
// ---------- Cancelar ----------

public bool Cancelar(int id)
{
    var venda = Consultar(id);
    if (venda == null)
        return false;

    if (venda.Status == StatusVenda.Cancelada)
        throw new InvalidOperationException("Essa venda já está cancelada.");

    venda.Status = StatusVenda.Cancelada;
    return true;