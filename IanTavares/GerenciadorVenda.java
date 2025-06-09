import java.util.HashMap;
import java.util.Map;

class Venda {
    private int id;
    private String status; // Pode ser "PENDENTE", "FINALIZADA", "CANCELADA"

    public Venda(int id) {
        this.id = id;
        this.status = "pendente";
    }

    public int getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Venda{id=" + id + ", status='" + status + "'}";
    }
}

class GerenciadorVenda {
    private Map<Integer, Venda> vendas = new HashMap<>();

    public void adicionarVenda(Venda venda) {
        vendas.put(venda.getId(), venda);
    }

    public void finalizarVenda(int vendaId) {
        Venda venda = vendas.get(vendaId);
        if (venda != null) {
            venda.setStatus("FINALIZADA");
        }
    }

    public void cancelarVenda(int vendaId) {
        Venda venda = vendas.get(vendaId);
        if (venda != null) {
            venda.setStatus("CANCELADA");
        }
    }

    public Venda consultarVenda(int vendaId) {
        return vendas.get(vendaId);
    }
}

public class Main {
    public static void main(String[] args) {
        GerenciadorVenda gerenciador = new GerenciadorVenda();

        Venda venda1 = new Venda(1);
        gerenciador.adicionarVenda(venda1);

        System.out.println("Estado inicial: " + gerenciador.consultarVenda(1));

        gerenciador.finalizarVenda(1);
        System.out.println("Após finalizar: " + gerenciador.consultarVenda(1));

        gerenciador.cancelarVenda(1);
        System.out.println("Após cancelar: " + gerenciador.consultarVenda(1));
    }
}
