public class GerenciadorVenda {
    public void call() {
        GerenciadorCliente gercliente = new GerenciadorCliente();
        gercliente.Inserir();
        gercliente.Consultar();
        gercliente.Remover();
        gercliente.Alterar();
    }
}

