class GerenciadorCliente:
    def __init__(self):
        # Armazenamos os clientes em um dicionário: id → dados do cliente
        self.clientes = {}
        self._proximo_id = 1  # gera IDs únicos


    def inserir_cliente(self, nome: str, telefone: str, email: str) -> int:
        """Adiciona um cliente e devolve o ID gerado."""
        cliente_id = self._proximo_id
        self.clientes[cliente_id] = {
            "nome": nome,
            "telefone": telefone,
            "email": email,
        }
        self._proximo_id += 1
        print(f" Cliente '{nome}' inserido com ID {cliente_id}")
        return cliente_id


    def consultar_clientes(self):
        """Exibe a lista de clientes cadastrados."""
        if not self.clientes:
            print(" Nenhum cliente cadastrado.")
            return
        print(" Clientes cadastrados:")
        for cid, dados in self.clientes.items():
            print(
                f"• ID: {cid} | Nome: {dados['nome']} | "
                f"Telefone: {dados['telefone']} | Email: {dados['email']}"
            )


    def remover_cliente(self, cliente_id: int) -> bool:
        """Remove um cliente pelo ID. Retorna True se remover, False se não existir."""
        if cliente_id in self.clientes:
            removido = self.clientes.pop(cliente_id)
            print(f" Cliente '{removido['nome']}' (ID {cliente_id}) removido.")
            return True
        else:
            print(f" Cliente com ID {cliente_id} não encontrado.")
            return False


    def alterar_cliente(
        self,
        cliente_id: int,
        nome: str | None = None,
        telefone: str | None = None,
        email: str | None = None,
    ) -> bool:
        """
        Altera dados do cliente. Só muda os campos não nulos.
        Retorna True se alterou, False se ID inexistente.
        """
        cliente = self.clientes.get(cliente_id)
        if not cliente:
            print(f" Cliente com ID {cliente_id} não encontrado.")
            return False

        if nome is not None:
            cliente["nome"] = nome
        if telefone is not None:
            cliente["telefone"] = telefone
        if email is not None:
            cliente["email"] = email

        print(f" Cliente ID {cliente_id} atualizado com sucesso.")
        return True
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

