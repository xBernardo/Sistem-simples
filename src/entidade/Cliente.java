package entidade;

import heranca.Pessoa;

public class Cliente extends Pessoa {
	private String codigo;
	
	public Cliente() {
	}

	public Cliente(String nome, String cpf, String telefone, String endereco, String cep, String codigo) {
		super(nome, cpf, telefone, endereco, cep);
		this.codigo = codigo;
	}
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
}
