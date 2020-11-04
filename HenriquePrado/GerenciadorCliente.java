public class GerenciadorCliente {
	public int alterarDados(Cliente cliente) {
		StringBuilder sql = new StringBuilder("UPDATE  cliente SET ");
		sql.append("nome = '").append(Jnome.getText()).append("',");
		sql.append("cpf = '").append(Jcpf.getText()).append("',");
		sql.append("endereco = '").append(Jendereco.getText()).append("',");
		sql.append("numero = '").append(Jnumero.getText()).append("',");
		sql.append("cidade = '").append(Jcidade.getText()).append("',");
		sql.append("cep = '").append(Jcep.getText()).append("',");
		sql.append("telefone = '").append(Jtelefone.getText()).append("' ");
		sql.append("WHERE criterio = '").append("campo criterio aqui").append("'")
	}
}

