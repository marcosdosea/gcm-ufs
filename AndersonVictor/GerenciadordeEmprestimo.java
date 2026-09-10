import java.math.BigDecimal;

public class GerenciadordeEmprestimo {
	private final BigDecimal valor;
	private final int parcelas;
	private int parcelasPagas;

	public GerenciadordeEmprestimo(BigDecimal valor, int parcelas) {
		if (valor == null || valor.compareTo(BigDecimal.ZERO) <= 0 || parcelas <= 0) {
			throw new IllegalArgumentException("Valor e quantidade de parcelas devem ser válidos.");
		}
		this.valor = valor;
		this.parcelas = parcelas;
	}

	public void pagarParcela() {
		if (parcelasPagas == parcelas) {
			throw new IllegalStateException("Todas as parcelas já foram pagas.");
		}
		parcelasPagas++;
	}

	public BigDecimal valorDaParcela() {
		return valor.divide(BigDecimal.valueOf(parcelas), 2, java.math.RoundingMode.HALF_UP);
	}

	public BigDecimal getValor() {
		return valor;
	}

	public int getParcelas() {
		return parcelas;
	}

	public int getParcelasPagas() {
		return parcelasPagas;
	}
}