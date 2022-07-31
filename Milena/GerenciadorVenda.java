class GerenciadorVenda {
    int codigo;
    String dataCompra;
    GerenciadorCliente gCliente;

    public void inserirVenda(int codigo, String dataCompra, GerenciadorCliente gm){
        this.codigo = codigo;
        this.dataCompra = dataCompra;
        this.gCliente = new GerenciadorCliente(gm.codigo, gm.nome, gm.endereco);
    }

    public void vincularClienteVenda(int codigo, String dataCompra, GerenciadorCliente gm) {
        inserirVenda(codigo, dataCompra, gm);
    }
}