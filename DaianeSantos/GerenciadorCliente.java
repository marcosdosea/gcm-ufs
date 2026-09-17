public class GerenciadorCliente {

    private String[] clientes;
    private int quantidade;

    public GerenciadorCliente() {
        this.clientes = new String[100];
        this.quantidade = 0;
    }

    public void inserir(String cliente) {
        clientes[quantidade] = cliente;
        quantidade++;
        System.out.println("Cliente inserido: " + cliente);
    }

    public String consultar(int posicao) {
        if (posicao < 0 || posicao >= quantidade) {
            System.out.println("Cliente não encontrado");
            return null;
        }
        System.out.println("Cliente consultado: " + clientes[posicao]);
        return clientes[posicao];
    }
}