public class GerenciadorVenda {
    public void finalizar(Venda venda) {
        System.out.println("Venda " + venda.getId() + " finalizada com sucesso.");
    }

    public void cancelar(Venda venda) {
        System.out.println("Venda " + venda.getId() + " cancelada com sucesso.");
    }
    
}
