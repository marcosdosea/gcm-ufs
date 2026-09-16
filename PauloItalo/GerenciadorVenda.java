public class GerenciadorVenda {
	public void finalizar(Venda venda) {
		validarVenda(venda);
		venda.finalizar();
	}

	public void cancelar(Venda venda) {
		validarVenda(venda);
		venda.cancelar();
	}

	private void validarVenda(Venda venda) {
		if (venda == null) {
			throw new IllegalArgumentException("A venda não pode ser nula.");
		}
	}
}
