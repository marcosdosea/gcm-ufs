/* GerenciadorVenda.java */
javapackage [SeuNome][SeuSobrenome];

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Classe responsável por gerenciar operações de vendas
 * @author [Seu Nome]
 * @version 1.0
 */
public class GerenciadorVenda {
    private List<Venda> vendas;
    
    public GerenciadorVenda() {
        this.vendas = new ArrayList<>();
    }
    
    /**
     * Finaliza uma venda
     * @param venda Venda a ser finalizada
     * @return true se finalizada com sucesso
     */
    public boolean finalizarVenda(Venda venda) {
        if (venda != null && venda.getStatus() == StatusVenda.PENDENTE) {
            venda.setStatus(StatusVenda.FINALIZADA);
            venda.setDataFinalizacao(new Date());
            return vendas.add(venda);
        }
        return false;
    }
    
    /**
     * Cancela uma venda por ID
     * @param idVenda ID da venda a ser cancelada
     * @return true se cancelada com sucesso
     */
    public boolean cancelarVenda(int idVenda) {
        for (Venda venda : vendas) {
            if (venda.getId() == idVenda && 
                venda.getStatus() != StatusVenda.CANCELADA) {
                venda.setStatus(StatusVenda.CANCELADA);
                venda.setDataCancelamento(new Date());
                return true;
            }
        }
        return false;
    }
}