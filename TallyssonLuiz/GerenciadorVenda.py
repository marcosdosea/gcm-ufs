class GerenciadorVenda:
    def __init__(self):
        self.vendas = {}
        self._proximo_id = 1


    def finalizar_venda(self, produtos: list[dict], total: float, cliente: str):
        """
        Registra uma nova venda.
        :param produtos: Lista de dicionários com info dos produtos vendidos
        :param total: Valor total da venda
        :param cliente: Nome do cliente
        """
        venda_id = self._proximo_id
        self.vendas[venda_id] = {
            "produtos": produtos,
            "total": total,
            "cliente": cliente,
            "status": "Finalizada",
        }
        self._proximo_id += 1
        print(f" Venda ID {venda_id} finalizada para cliente '{cliente}'.")
        return venda_id


    def cancelar_venda(self, venda_id: int):
        """
        Cancela uma venda já registrada.
        """
        venda = self.vendas.get(venda_id)
        if not venda:
            print(f" Venda ID {venda_id} não encontrada.")
            return False
        if venda["status"] == "Cancelada":
            print(f" Venda ID {venda_id} já está cancelada.")
            return False

        venda["status"] = "Cancelada"
        print(f" Venda ID {venda_id} cancelada com sucesso.")
        return True


    def listar_vendas(self):
        if not self.vendas:
            print(" Nenhuma venda registrada.")
            return
        for vid, v in self.vendas.items():
            print(f"• ID: {vid} | Cliente: {v['cliente']} | Total: R${v['total']:.2f} | Status: {v['status']}")
