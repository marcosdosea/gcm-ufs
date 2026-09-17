using System;
using System.Collections.Generic;
using System.Linq;

namespace JoaoSilva
{
    public class Cliente
    {
        public int Id { get; set; }
        public string Nome { get; set; }
        public string Cpf { get; set; }
    }

    public class GerenciadorCliente
    {
        private readonly List<Cliente> clientes = new List<Cliente>();

        public void Inserir(Cliente cliente)
        {
            if (cliente == null)
                throw new ArgumentNullException(nameof(cliente));

            if (cliente.Id <= 0)
                throw new ArgumentException("O Id do cliente deve ser maior que zero.", nameof(cliente));

            if (clientes.Any(c => c.Id == cliente.Id))
                throw new InvalidOperationException($"Já existe um cliente com o Id {cliente.Id}.");

            clientes.Add(cliente);
        }

        public Cliente Consultar(int id)
        {
            return clientes.FirstOrDefault(c => c.Id == id);
        }

        public void Remover(int id)
        {
            Cliente cliente = clientes.FirstOrDefault(c => c.Id == id);

            if (cliente == null)
                throw new InvalidOperationException($"Cliente com Id {id} não encontrado.");

            clientes.Remove(cliente);
        }

        public void Alterar(Cliente clienteAlterado)
        {
            if (clienteAlterado == null)
                throw new ArgumentNullException(nameof(clienteAlterado));

            Cliente cliente = clientes.FirstOrDefault(c => c.Id == clienteAlterado.Id);

            if (cliente == null)
                throw new InvalidOperationException($"Cliente com Id {clienteAlterado.Id} não encontrado.");

            cliente.Nome = clienteAlterado.Nome;
            cliente.Cpf = clienteAlterado.Cpf;
        }
    }
}