import package::GerenciadorVenda;
class GerenciadorVenda{
	String nomeDaVenda;
	float Valor;
	GerenciadorVenda venda = new GerenciadorVenda();
	
	private void chamarMetodo(){
		if(venda.inserirCliente()){
			print("Cliente foi inserido!");
		}
	}
}