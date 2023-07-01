public class GerenciadorVenda {
    private GerenciadorCliente gerenciadorCliente;

    public GerenciadorVenda() {
        gerenciadorCliente = new GerenciadorCliente();
    }

    public void realizarVenda(String nomeCliente, double valor) {
        Cliente cliente = gerenciadorCliente.consultarCliente(nomeCliente);

        if (cliente != null) {
            
            System.out.println("Venda realizada para " + cliente.getNome() + " no valor de R$" + valor);
        } else {
            System.out.println("Cliente não encontrado. Venda Cancelada.");
        }
    }
    
}