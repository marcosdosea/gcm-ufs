import java.util.HashMap;
import java.util.Map;

public class GerenciadorVenda {
    private Map<Integer, String> vendas;

    public GerenciadorVenda() {
        vendas = new HashMap<>();
    }

    public void finalizar(int idVenda, String descricao) {
        vendas.put(idVenda, descricao);
        System.out.println("Venda finalizada: " + descricao);
    }

    public void cancelar(int idVenda) {
        if (vendas.containsKey(idVenda)) {
            vendas.remove(idVenda);
            System.out.println("Venda cancelada com sucesso.");
        } else {
            System.out.println("Venda não encontrada para cancelamento.");
        }
    }
}
