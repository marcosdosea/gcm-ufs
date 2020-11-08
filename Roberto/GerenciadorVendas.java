public class GerenciadorVendas{

    int id;
    float valor;

    public int venda( Venda) {
    	this.id = venda.id;
	this.valor = venda.valor;
 	
	return(1);   
    }
}
