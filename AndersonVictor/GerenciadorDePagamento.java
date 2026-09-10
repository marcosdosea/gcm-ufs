import java.math.BigDecimal;

public class GerenciadorDePagamento {
	public enum Status {
		PENDENTE,
		PAGO,
		CANCELADO
	}

	private final BigDecimal valor;
	private Status status = Status.PENDENTE;

	public GerenciadorDePagamento(BigDecimal valor) {
		if (valor == null || valor.compareTo(BigDecimal.ZERO) <= 0) {
			throw new IllegalArgumentException("O valor do pagamento deve ser maior que zero.");
		}
		this.valor = valor;
	}

	public void pagar() {
		if (status != Status.PENDENTE) {
			throw new IllegalStateException("Somente pagamentos pendentes podem ser pagos.");
		}
		status = Status.PAGO;
	}

	public void cancelar() {
		if (status == Status.PAGO) {
			throw new IllegalStateException("Um pagamento pago não pode ser cancelado.");
		}
		status = Status.CANCELADO;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public Status getStatus() {
		return status;
	}
}