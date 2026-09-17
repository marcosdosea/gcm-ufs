namespace GuilhermeSeixas
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
            clientes.Add(cliente);
        }

        public Cliente Consultar(int id)
        {
            return clientes.FirstOrDefault(c => c.Id == id);
        }
    }
}