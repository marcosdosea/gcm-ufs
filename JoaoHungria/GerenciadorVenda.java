
import java.util.List;
import java.util.Map;

public class GerenciadorVenda {
    private Map<Integer, Venda> vendas = new HashMap<>();
    private int proximoId = 1;

    public Venda consultar(int idVenda) {
        return vendas.get(idVenda);
    }

    /**
     * Altera o status de uma venda para FINALIZADA.
     * @param idVenda O ID da venda a ser finalizada.
     * @return true se a operação foi bem-sucedida, false caso contrário.
     */
    public boolean finalizar(int idVenda) {
        Venda venda = consultar(idVenda);
        if (venda != null && venda.getStatus() == StatusVenda.EM_ANDAMENTO) {
            venda.setStatus(StatusVenda.FINALIZADA);
            System.out.println("SUCESSO: Venda " + idVenda + " finalizada.");
            // Em um sistema real: processar pagamento, dar baixa no estoque, etc.
            return true;
        }
        if (venda != null) {
            System.out.println("ERRO: Não foi possível finalizar a venda " + idVenda + ". Status atual: " + venda.getStatus());
        } else {
            System.out.println("ERRO: Venda com ID " + idVenda + " não encontrada.");
        }
        return false;
    }

    /**
     * Altera o status de uma venda para CANCELADA.
     * @param idVenda O ID da venda a ser cancelada.
     * @return true se a operação foi bem-sucedida, false caso contrário.
     */
    public boolean cancelar(int idVenda) {
        Venda venda = consultar(idVenda);
        if (venda != null && venda.getStatus() != StatusVenda.CANCELADA) {
            venda.setStatus(StatusVenda.CANCELADA);
            System.out.println("SUCESSO: Venda " + idVenda + " cancelada.");
            // Em um sistema real: estornar pagamento, devolver produtos ao estoque, etc.
            return true;
        }
        if (venda != null) {
            System.out.println("ERRO: A venda " + idVenda + " já está cancelada.");
        } else {
            System.out.println("ERRO: Venda com ID " + idVenda + " não encontrada.");
        }
        return false;
    }
}