public class GerenciadorCliente{

    public String name;
    public String address;

    public void inserir(String name, String address){
        setName(name);
        setAddress(address);
        System.out.println("Inserido com sucesso.");
    }
    public void consultar(){
        System.out.println("Nome do Cliente.");
    }
    public void remover(){
        System.out.println("Cliente removido com sucesso.");
    }
    public void alterar(){
        System.out.println("Alterado com sucesso.");
    }
}