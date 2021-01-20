public class GerenciadorVenda {

	public int main(String[] args) {
		gerenciadorCliente = new GerenciadorCliente();
		gerenciadorCliente.inserir()
	}
	
	public int adicionarVenda(Venda venda) {
		vendas.add(venda);
	}
  
	public int statusVenda(Venda venda) {
		if (venda.status == "Pendente") and (pagamento == "Recebido")
			venda.status = "Concretizada";
		else if (pagamento == "Pendente" ) and (dataAtual > dataVencimento)
			venda.status = "Cancelada"
	}

}