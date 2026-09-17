// ---------- Finalizar ----------
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