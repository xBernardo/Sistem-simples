package servico;

import java.util.ArrayList;

import entidade.Cliente;
import repositorioCliente.ClienteRepositorio;

public class ClienteServico {
private ClienteRepositorio clienteRepositorio;
	
	public ClienteServico (ArrayList<Cliente> listaCliente) {
		this.clienteRepositorio = new ClienteRepositorio(listaCliente);
	}
	public void cadastrar(Cliente cliente) {
		if(cliente.getNome().isBlank())
			System.out.println("NOME EM BRANCO!");
		else {
		 if(cliente.getNome().isEmpty())
				System.out.println("NOME VAZIO!");
		else {
			if(cliente.getNome().length() <= 4)
					System.out.println("DIGITE SEU NOME COMPLETO!");
				else {
					if(cliente.getCpf().length() != 11)
						System.out.println("CPF INCORRETO!");
					else {
						if(verificarCpfDuplicado(cliente.getCpf()))
							System.out.println("CPF DUPLICADO!");
						else {
							if(cliente.getTelefone().length() <=10)
										System.out.println("DIGITE UM NUMERO DE TELEFONE VALIDO! APENAS NUMEROS!");
							 else {
								 if(verificarTelefoneDuplicado(cliente.getTelefone()))
											System.out.println("TELEFONE DUPLICADO!");
									else {
										if(cliente.getEndereco().isBlank())
											System.out.println("ENDEREÇO EM BRANCO!");
										else {
										 if(cliente.getEndereco().isEmpty())
												System.out.println("ENDEREÇO VAZIO!");
										else {
											if(cliente.getEndereco().length() <= 4)
													System.out.println("DIGITE SEU ENDEREÇO COMPLETO!");
												else {
													if(cliente.getCep().length() != 8)
														System.out.println("CEP INCORRETO!");
													else {
												}
										
											clienteRepositorio.cadastrar(cliente);
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
	public void atualizar(Cliente cliente) {
		clienteRepositorio.cadastrar(cliente);
	}
	public void deletar(Cliente cliente) {
		clienteRepositorio.deletar(cliente);
	}
	public boolean verificarCpfDuplicado(String cpf) {
		for(Cliente cliente : listar()) {
			if(cliente.getCpf().equals(cpf))
				return true;
		}
		return false;
	}
	public boolean verificarTelefoneDuplicado(String telefone) {
		for(Cliente cliente : listar()) {
			if(cliente.getTelefone().equals(telefone))
				return true;
		}
		return false;
	}
	 public ArrayList<Cliente> listar(){
	    	return clienteRepositorio.listar();
 }
	 public void imprimirCliente() {
	    	
	    	for(Cliente cliente : clienteRepositorio.listar()) {
	    		System.out.println();
	    		System.out.println("CLIENTE CADASTRADO COM SUCESSO!");
	    		System.out.println("NOME: " + cliente.getNome());
	    		 System.out.println("CPF: " + cliente.getCpf());
				 System.out.println("TELEFONE: " + cliente.getTelefone());
				 System.out.println("ENDEREÇO: " + cliente.getEndereco());
				 System.out.println("CEP: " + cliente.getCep());
				 System.out.println();
	    	}
	    }
	 public void imprimirClienteNovosDados() {
		 for(Cliente cliente : clienteRepositorio.listar()) {
			 System.out.println("NOME: " + cliente.getNome());
			 System.out.println("CPF: " + cliente.getCpf());
			 System.out.println("TELEFONE: " + cliente.getTelefone());
			 System.out.println("ENDEREÇO: " + cliente.getEndereco());
			 System.out.println("CEP: " + cliente.getCep());
		 }
	 }
}
