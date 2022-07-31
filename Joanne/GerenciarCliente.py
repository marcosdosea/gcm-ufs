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
    
    def __init__(self):
        self.clientes = []
        self.clientes.append(Cliente('João', '12345678901', '
        Rua dos Bobos, 0'))
        self.clientes.append(Cliente('Maria', '12345678902', '
        Rua das Flores, 0'))
        self.clientes.append(Cliente('Pedro', '12345678903', '
        Rua das Mangas, 0'))
        
    def consultar_clientes(self):
        for cliente in self.clientes:
            print(cliente)
        
    def inserir_cliente(self):
        nome = input('Nome: ')
        cpf = input('CPF: ')
        endereco = input('Endereço: ')
        self.clientes.append(Cliente(nome, cpf, endereco))
