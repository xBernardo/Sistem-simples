package servico;

import java.util.ArrayList;

import entidade.Funcionario;
import repositorioFuncionario.FuncionarioRepositorio;

public class FuncionarioServico {
private FuncionarioRepositorio funcionarioRepositorio;
	
	public FuncionarioServico (ArrayList<Funcionario> listaFuncionario) {
		this.funcionarioRepositorio = new FuncionarioRepositorio(listaFuncionario);
	}
	public void cadastrar(Funcionario funcionario) {
		if(funcionario.getNome().isBlank())
			System.out.println("NOME EM BRANCO!");
		else {
		 if(funcionario.getNome().isEmpty())
				System.out.println("NOME VAZIO!");
		else {
			if(funcionario.getNome().length() <= 4)
					System.out.println("DIGITE SEU NOME COMPLETO!");
				else {
					if(funcionario.getCpf().length() != 11)
						System.out.println("CPF INCORRETO!");
					else {
						if(verificarCpfDuplicado(funcionario.getCpf()))
							System.out.println("CPF DUPLICADO!");
						else {
							if(funcionario.getTelefone().length() <=10)
										System.out.println("DIGITE UM NUMERO DE TELEFONE VALIDO! APENAS NUMEROS!");
							 else {
								 if(verificarTelefoneDuplicado(funcionario.getTelefone()))
											System.out.println("TELEFONE DUPLICADO!");
									else {
										if(funcionario.getEndereco().isBlank())
											System.out.println("ENDEREÇO EM BRANCO!");
										else {
										 if(funcionario.getEndereco().isEmpty())
												System.out.println("ENDEREÇO VAZIO!");
										else {
											if(funcionario.getEndereco().length() <= 4)
													System.out.println("DIGITE SEU ENDEREÇO COMPLETO!");
												else {
													if(funcionario.getCep().length() != 8)
														System.out.println("CEP INCORRETO!");
													else {
												}
										
													funcionarioRepositorio.cadastrar(funcionario);
										}
									}
								}
							}
				        }
					}
				}
	         }
		}
	}
}	
	public void atualizar(Funcionario funcionario) {
		funcionarioRepositorio.cadastrar(funcionario);
	}
	public void deletar(Funcionario funcionario) {
		funcionarioRepositorio.deletar(funcionario);
	}
	public boolean verificarCpfDuplicado(String cpf) {
		for(Funcionario funcionario : listar()) {
			if(funcionario.getCpf().equals(cpf))
				return true;
		}
		return false;
	}
	public boolean verificarTelefoneDuplicado(String telefone) {
		for(Funcionario funcionario : listar()) {
			if(funcionario.getTelefone().equals(telefone))
				return true;
		}
		return false;
	}
	 public ArrayList<Funcionario> listar(){
	    	return funcionarioRepositorio.listar();
 }
	 public void imprimirFuncionario() {
	    	
	    	for(Funcionario funcionario : funcionarioRepositorio.listar()) {
	    		System.out.println();
	    		System.out.println("FUNCIONARIO CADASTRADO COM SUCESSO!");
	    		System.out.println("NOME: " + funcionario.getNome());
	    		 System.out.println("CPF: " + funcionario.getCpf());
				 System.out.println("TELEFONE: " + funcionario.getTelefone());
				 System.out.println("ENDEREÇO: " + funcionario.getEndereco());
				 System.out.println("CEP: " + funcionario.getCep());
				 System.out.println("CARGO: " + funcionario.getCargo());
				 System.out.println("SALÁRIO: " + funcionario.getSalario());
				 System.out.println();
	    	}
	    }
	 public void imprimirFuncionarioNovosDados() {
		 for(Funcionario funcionario : funcionarioRepositorio.listar()) {
			 System.out.println("NOME: " + funcionario.getNome());
			 System.out.println("CPF: " + funcionario.getCpf());
			 System.out.println("TELEFONE: " + funcionario.getTelefone());
			 System.out.println("ENDEREÇO: " + funcionario.getEndereco());
			 System.out.println("CEP: " + funcionario.getCep());
		 }
	 }

}
