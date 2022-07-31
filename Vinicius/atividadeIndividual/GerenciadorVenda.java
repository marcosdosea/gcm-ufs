package atividadeIndividual;

public class GerenciadorVenda {
    private String produto;
    private double valor;
    private short quantidade;
    private String nomeCliente;
    private String cpf;

    /**
     * Realizar a venda de um determinado produto
     * @param produto
     * @param valor
     * @param quantidade
     * @param cpf
     */
    public void realizarVenda(String produto, double valor, Short quantidade, String cpf){
        GerenciadorCliente cliente = new GerenciadorCliente();
        if (cliente.consultarCliente(cpf, null) != null){
            setProduto(produto);
            setValor(valor);
            setQuantidade(quantidade);
        }
        else{
            System.out.println("Realize seu cadastro antes de finalizar a compra!");
        }
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getProduto() {
        return produto;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setQuantidade(short quantidade) {
        this.quantidade = quantidade;
    }

    public short getQuantidade() {
        return quantidade;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }
    
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

}
