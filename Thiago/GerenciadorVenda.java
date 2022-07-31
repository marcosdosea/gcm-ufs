/**
 *
 * @author thiago
 */
public class GerenciadorVenda {
    public double valorTotal;
    public String nomeVendedor;
    
        
    public void vendaNovoCliente(double valorTotal, String nomeVendedor){
      this.valorTotal = valorTotal;
      this.nomeVendedor = nomeVendedor;
      GerenciadorCliente cliente = new GerenciadorCliente();
      cliente.inserir("Auba", 31, -valorTotal);
      cliente.consultar();
    }
    
    
}
