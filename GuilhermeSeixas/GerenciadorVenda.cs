using System;
using System.Collections.Generic;
using System.Linq;

namespace GuilhermeSeixas
{
    public class Venda
    {
        public int Id { get; set; }
        public int IdCliente { get; set; }
        public decimal Valor { get; set; }
        public string Situacao { get; set; }
    }

    public class GerenciadorVenda
    {
        private readonly List<Venda> vendas = new List<Venda>();

        public void FinalizarVenda(Venda venda)
        {
            if (venda == null)
                throw new ArgumentNullException(nameof(venda));

            if (venda.Id <= 0)
                throw new ArgumentException("O Id da venda deve ser maior que zero.", nameof(venda));

            if (vendas.Any(v => v.Id == venda.Id))
                throw new InvalidOperationException($"Já existe uma venda com o Id {venda.Id}.");

            venda.Situacao = "Finalizada";
            vendas.Add(venda);
        }

        public void CancelarVenda(int idVenda)
        {
            Venda venda = vendas.FirstOrDefault(v => v.Id == idVenda);

            if (venda == null)
                throw new InvalidOperationException($"Venda com Id {idVenda} não encontrada.");

            if (venda.Situacao == "Cancelada")
                throw new InvalidOperationException("Esta venda já está cancelada.");

            venda.Situacao = "Cancelada";
        }
    }
}