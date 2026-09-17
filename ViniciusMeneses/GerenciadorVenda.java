package ViniciusOliveira;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorVenda {
    private List<Venda> vendas = new ArrayList<>();

    public void cadastrarVenda(Venda venda) {
        vendas.add(venda);
    }

    public boolean finalizar(String idVenda) {
        for (Venda v : vendas) {
            if (v.getId().equals(idVenda)) {
                v.setStatus("FINALIZADA");
                return true;
            }
        }
        return false;
    }

    public boolean cancelar(String idVenda) {
        for (Venda v : vendas) {
            if (v.getId().equals(idVenda)) {
                v.setStatus("CANCELADA");
                return true;
            }
        }
        return false;
    }
}