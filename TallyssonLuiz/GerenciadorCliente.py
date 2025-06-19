class GerenciadorCliente:
    def __init__(self):
        self.clientes = []

    def inserir_cliente(self, nome, telefone, email):
        cliente = {
            'nome': nome,
            'telefone': telefone,
            'email': email
        }
        self.clientes.append(cliente)
        print(f"Cliente '{nome}' inserido com sucesso!")

    def consultar_clientes(self):
        if not self.clientes:
            print("Nenhum cliente cadastrado.")
            return

        print("Lista de clientes cadastrados:")
        for i, cliente in enumerate(self.clientes, start=1):
            print(f"{i}. Nome: {cliente['nome']}, Telefone: {cliente['telefone']}, Email: {cliente['email']}")


            
