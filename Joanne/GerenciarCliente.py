class GerenciarCliente:

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

    