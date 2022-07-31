class GerenciarCliente:
    
    def __initVenda__(self,cliente:GerenciarCliente):

        cliente.inserirCliente()
        self.produtos = []
        #exemplo produto
        self.produtos.append(Produto('Fanta', '01', 'Refrigerante', '6.00'))
        self.produtos.append(Produto('Coca-cola', '02', 'Refrigerante', '8.00'))

        cliente.consultarClientes()
        produtos.consultarProdutos()
  
    #deveria criar um gerenciar produto, mas ok
  
   

    