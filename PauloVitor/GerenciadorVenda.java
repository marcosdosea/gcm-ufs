public class GerenciadorVenda{

    public Venda novaVenda(float valor, String pagamento, Cliente cliente){
        v.valor = valor;
        v.pagamento = pagamento;
        v.cliente = cliente
        return v;
    }

    public void consultarVenda(Venda v){
        System.out.println(v.valor);
        System.out.println(v.pagamento);
        System.out.println("Cliente associado: ");
        c.consultar(v.cliente);
    }

}