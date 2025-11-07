public class GerenciadorVenda {

    private boolean vendaFinalizada;
    private boolean vendaCancelada;

    public void finalizarVenda() {
        if (vendaCancelada) {
            System.out.println("Não é possível finalizar uma venda cancelada!");
        } else if (vendaFinalizada) {
            System.out.println("A venda já foi finalizada anteriormente.");
        } else {
            vendaFinalizada = true;
            System.out.println("Venda finalizada com sucesso!");
        }
    }

    public void cancelarVenda() {
        if (vendaFinalizada) {
            System.out.println("Não é possível cancelar uma venda já finalizada!");
        } else if (vendaCancelada) {
            System.out.println("A venda já está cancelada.");
        } else {
            vendaCancelada = true;
            System.out.println("Venda cancelada com sucesso!");
        }
    }
