import java.util.ArrayList;

public class GerenciadorVenda {

    private ArrayList<String> vendas;

    public GerenciadorVenda() {
        vendas = new ArrayList<>();
    }

    public void finalizarVenda(String idVenda) {
        vendas.add(idVenda);
        System.out.println("Venda finalizada: " + idVenda);
    }

    public void cancelarVenda(String idVenda) {
        if (vendas.remove(idVenda)) {
            System.out.println("Venda cancelada: " + idVenda);
        } else {
            System.out.println("Venda não encontrada: " + idVenda);
        }
    }
}
