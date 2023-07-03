class GerenciadorVenda {
    private GerenciadorCliente gerenciadorCliente;
    
    public GerenciadorVenda() {
        gerenciadorCliente = new GerenciadorCliente();
    }
    
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
