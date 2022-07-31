class GerenciarCliente:

    def remover_cliente(self):
        cpf = input('CPF: ')
        for cliente in self.clientes:
            if cliente.cpf == cpf:
                self.clientes.remove(cliente)
                print('Cliente removido com sucesso!')
                return
        print('Cliente não encontrado!')
    
    def alterar_cliente(self):
        cpf = input('CPF: ')
        for cliente in self.clientes:
            if cliente.cpf == cpf:
                nome = input('Nome: ')
                endereco = input('Endereço: ')
                cliente.nome = nome
                cliente.endereco = endereco
                print('Cliente alterado com sucesso!')
                return
        print('Cliente não encontrado!')
    
