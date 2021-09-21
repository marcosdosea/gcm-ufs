public class GerenciadorVenda
{
    public void newSale(Object cliente, int idVendedor, string data){
        new GerenciadorCliente().insertClient(cliente);
    } 

     public void  removeCliente(Object cliente, int idVendedor, string data){
        new GerenciadorCliente().removeCliente(cliente);
    } 
}