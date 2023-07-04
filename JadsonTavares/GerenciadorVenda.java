class GerenciadorVenda {
    private GerenciadorCliente gerenciadorCliente;
     // metodo gerenciar venda
    public GerenciadorVenda() {
        gerenciadorCliente = new GerenciadorCliente();
    }
    // metodo realizar venda
    public void realizarVenda(int idCliente, String nomeProduto) {
        Cliente cliente = gerenciadorCliente.consultar(idCliente);
        
        if (cliente != null) {
            System.out.println("Venda realizada para o cliente: " + cliente.getNome());
            System.out.println("Produto vendido: " + nomeProduto);
        } else {
            System.out.println("Cliente não encontrado. Venda não realizada.");
        }
    }
}
