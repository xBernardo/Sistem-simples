package entidade;

import heranca.Pessoa;

public class Funcionario extends Pessoa{
	private String cargo;
	private String salario;
	
	public Funcionario() {
	}
	
	public Funcionario(String nome, String cpf, String telefone, String endereco, String cep, String cargo,
			String salario) {
		super(nome, cpf, telefone, endereco, cep);
		this.cargo = cargo;
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getSalario() {
		return salario;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}
}
