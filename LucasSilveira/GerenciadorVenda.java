public class GerenciadorVenda {

    private boolean vendaAtiva;

    public void finalizarVenda() {
        if (vendaAtiva) {
            System.out.println("Venda finalizada com sucesso!");
            vendaAtiva = false;
        } else {
            System.out.println("Nenhuma venda ativa para finalizar.");
        }
    }

    public void cancelarVenda() {
        if (vendaAtiva) {
            System.out.println("Venda cancelada com sucesso!");
            vendaAtiva = false;
        } else {
            System.out.println("Nenhuma venda ativa para cancelar.");
        }
    }
}