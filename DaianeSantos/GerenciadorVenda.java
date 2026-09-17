public class GerenciadorVenda {

    private String[] vendas;
    private String[] status;
    private int quantidade;

    public GerenciadorVenda() {
        this.vendas = new String[100];
        this.status = new String[100];
        this.quantidade = 0;
    }

    public void finalizar(int posicao) {
        if (posicao < 0 || posicao >= quantidade) {
            System.out.println("Venda não encontrada");
            return;
        }
        status[posicao] = "Finalizada";
        System.out.println("Venda finalizada: " + vendas[posicao]);
    }

    public void cancelar(int posicao) {
        if (posicao < 0 || posicao >= quantidade) {
            System.out.println("Venda não encontrada");
            return;
        }
        status[posicao] = "Cancelada";
        System.out.println("Venda cancelada: " + vendas[posicao]);
    }
}