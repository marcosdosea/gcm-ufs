import java.util.ArrayList;
import java.util.List;

public class GerenciadorVenda {
    private List<Venda> vendas;

    public GerenciadorVenda() {
        this.vendas = new ArrayList<>();
    }

    // Mudei o nome de 'adicionarVenda' para 'iniciarVenda'
    // Uma venda é adicionada à lista quando é INICIADA (e fica pendente)
    public void iniciarVenda(Venda novaVenda) {
        // Aqui poderíamos verificar se o ID já existe
        if (novaVenda.getStatus() == StatusVenda.PENDENTE) {
            this.vendas.add(novaVenda);
            System.out.println("Nova venda iniciada, ID: " + novaVenda.getId());
        } else {
            System.err.println("Erro: Só é possível adicionar vendas com status PENDENTE.");
        }
    }

    // Agora "finalizar" faz sentido!
    // Ele não recebe mais um objeto Venda, mas o ID da venda a finalizar
    public void finalizarVenda(int idVenda) {
        Venda venda = buscarVendaPorId(idVenda);
        
        if (venda != null) {
            // O Gerenciador ORQUESTRA: ele encontra a venda e
            // DELEGA a responsabilidade de se finalizar para a própria venda.
            venda.finalizar();
        } else {
            System.err.println("Erro: Venda com ID " + idVenda + " não encontrada.");
        }
    }

    // "Cancelar" também faz sentido agora
    public void cancelarVenda(int idVenda) {
        Venda venda = buscarVendaPorId(idVenda);
        
        if (venda != null) {
            // Mesma coisa: delega a responsabilidade
            venda.cancelar();
        } else {
            System.err.println("Erro: Venda com ID " + idVenda + " não encontrada.");
        }
    }

    // Este método estava perfeito, é o "motor" dos outros
    public Venda buscarVendaPorId(int id) {
        for (Venda venda : vendas) {
            if (venda.getId() == id) {
                return venda;
            }
        }
        return null; // Nenhuma venda encontrada
    }

    // Removi os métodos redundantes (finalizarVenda/cancelarVenda
    // que usavam add/remove, e o adicionarVenda/removerVenda genéricos)
    // para manter a classe focada em sua responsabilidade.
    
    // Método útil para ver todas as vendas
    public List<Venda> getVendas() {
        return new ArrayList<>(vendas); // Retorna uma cópia para proteger a lista original
    }
}