import java.util.ArrayList;
import java.util.List;

public class GerenciadorVenda {
    private List<Venda> vendas;

    public GerenciadorVenda() {
        this.vendas = new ArrayList<>();
    }

    public void iniciarVenda(Venda novaVenda) {
        if (novaVenda.getStatus() == StatusVenda.PENDENTE) {
            this.vendas.add(novaVenda);
            System.out.println("Nova venda iniciada, ID: " + novaVenda.getId());
        } else {
            System.err.println("Erro: Só é possível adicionar vendas com status PENDENTE.");
        }
    }

    public void finalizarVenda(int idVenda) {
        Venda venda = buscarVendaPorId(idVenda);
        
        if (venda != null) {
            venda.finalizar();
        } else {
            System.err.println("Erro: Venda com ID " + idVenda + " não encontrada.");
        }
    }

    public void cancelarVenda(int idVenda) {
        Venda venda = buscarVendaPorId(idVenda);
        
        if (venda != null) {
            venda.cancelar();
        } else {
            System.err.println("Erro: Venda com ID " + idVenda + " não encontrada.");
        }
    }
    public Venda buscarVendaPorId(int id) {
        for (Venda venda : vendas) {
            if (venda.getId() == id) {
                return venda;
            }
        }
        return null;
    }
    public List<Venda> getVendas() {
        return new ArrayList<>(vendas);
    }
}