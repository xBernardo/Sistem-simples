package visualizacao;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entidade.Cliente;
import entidade.Funcionario;
import entidade.Produto;
import servico.ClienteServico;
import servico.FuncionarioServico;
import servico.ProdutoServico;

public class Progama {
	public static ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
	public static ArrayList<Funcionario> listaFuncionario = new ArrayList<Funcionario>();
	public static ArrayList<Produto> listaProduto = new ArrayList<Produto>();

	public static void main(String[] args) {
		ClienteServico clienteServico = new ClienteServico(listaCliente);
		FuncionarioServico funcionarioServico = new FuncionarioServico(listaFuncionario);
		ProdutoServico produtoServico = new ProdutoServico(listaProduto);
		Scanner sc = new Scanner(System.in);
		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente();
		Cliente c3 = new Cliente();
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		Funcionario f3 = new Funcionario();
		Produto p1 = new Produto();
		Produto p2 = new Produto();
		Produto p3 = new Produto();
		
		String acesso = "";
		String acesso2 = "";
		String acesso3 = "";
		String acesso4 = "";
		
		while(!acesso.equals("5")) {
			System.out.println("Digite 1 Para Pedido De Venda: ");
			System.out.println("Digite 2 Para Cadastro: ");
			System.out.println("Digite 3 Para Alterar Dados: ");
			System.out.println("Digite 4 Para Excluir Dados: ");
			System.out.println("Digite 5 Para Sair: ");
			
			acesso = sc.next();
			
			switch(acesso) {
			case "1":
				double saldo = sc.nextDouble();
				String produto1 = p1.getNome();
				String produto2 = p2.getNome();
				String produto3 = p3.getNome();
				double produto4;
				double produto5;
				double produto6;
				int quantidade1;
				int quantidade2;
				int quantidade3;
				System.out.println("Digite O Nome Do Primeiro Produto: ");
				produto1 = sc.next();
				System.out.println("Digite A Quantidade: ");
				System.out.println(quantidade1 = sc.nextInt());
				produto4 = p1.getPrecoVenda() * quantidade1;
				System.out.println();
				System.out.println("Digite O Nome Do Poximo Produto: ");
				produto2 = sc.next();
				System.out.println("Digite A Quantidade: ");
				System.out.println(quantidade2 = sc.nextInt());
				produto5 = p2.getPrecoVenda() * quantidade2;
				System.out.println("Digite O Nome Do Proximo Produto: ");
				produto3 = sc.next();
				System.out.println("Digite A Quantidade: ");
				System.out.println(quantidade3 = sc.nextInt());
				produto6 = p3.getPrecoVenda() * quantidade3;
				saldo = produto4 + produto5 + produto6;
				System.out.println();
				System.out.println("VENDA REALIZADA COM SUCESSO!");
				System.out.println("O SALDO DA SUA CONTA É: " + saldo);
				break;
				
			case "2":
				while(!acesso.equals("4")) {
					System.out.println("Digite 1 Cadastrar Produtos: ");
					System.out.println("Digite 2 Para Cadastrar Cliente: ");
					System.out.println("Digite 3 Para Cadastrar Funcionario: ");
					System.out.println("Digite 4 Para Voltar: ");
					
					acesso2 = sc.next();
					
					switch(acesso2) {
					case "1":
						System.out.println("Digite O Nome Do Produto: ");
						p1.setNome(sc.next());
						System.out.println("Digite O Preço De Custo: ");
						p1.setPrecoCusto(sc.nextDouble());
						System.out.println("Digite O Preço De Venda: ");
						p1.setPrecoVenda(sc.nextDouble());
						System.out.println("Digite A Quantidade Em Unidades: ");
						p1.setQuantidade(sc.nextInt());
						produtoServico.cadastrar(p1);
						System.out.println();
						System.out.println("Digite O Proximo Do Produto: ");
						p2.setNome(sc.next());
						System.out.println("Digite O Preço De Custo: ");
						p2.setPrecoCusto(sc.nextDouble());
						System.out.println("Digite O Preço De Venda: ");
						p2.setPrecoVenda(sc.nextDouble());
						System.out.println("Digite A Quantidade Em Unidades: ");
						p2.setQuantidade(sc.nextInt());
						produtoServico.cadastrar(p2);
						System.out.println();
						System.out.println("Digite O Proximo Do Produto: ");
						p3.setNome(sc.next());
						System.out.println("Digite O Preço De Custo: ");
						p3.setPrecoCusto(sc.nextDouble());
						System.out.println("Digite O Preço De Venda: ");
						p3.setPrecoVenda(sc.nextDouble());
						System.out.println("Digite A Quantidade Em Unidades: ");
						p3.setQuantidade(sc.nextInt());
						produtoServico.cadastrar(p3);
						produtoServico.imprimirProduto();
						break;
						
					case "2":
						System.out.println("Digite O Nome Do Cliente: ");
						c1.setNome(sc.next());
						System.out.println("Digite O Cpf Do Cliente: ");
						c1.setCpf(sc.next());
						System.out.println("Digite O Telefone Do Cliente: ");
						c1.setTelefone(sc.next());
						System.out.println("Digite O Endereço Do Cliente: ");
						c1.setEndereco(sc.next());
						System.out.println("Digite O Cep Do Cliente: ");
						c1.setCep(sc.next());
						clienteServico.cadastrar(c1);
						System.out.println();
						System.out.println("Digite O Nome Do Proximo Cliente: ");
						c2.setNome(sc.next());
						System.out.println("Digite O Cpf Do Cliente: ");
						c2.setCpf(sc.next());
						System.out.println("Digite O Telefone Do Cliente: ");
						c2.setTelefone(sc.next());
						System.out.println("Digite O Endereço Do Cliente: ");
						c2.setEndereco(sc.next());
						System.out.println("Digite O Cep Do Cliente: ");
						c2.setCep(sc.next());
						clienteServico.cadastrar(c2);
						System.out.println();
						System.out.println("Digite O Nome Do Proximo Cliente: ");
						c3.setNome(sc.next());
						System.out.println("Digite O Cpf Do Cliente: ");
						c3.setCpf(sc.next());
						System.out.println("Digite O Telefone Do Cliente: ");
						c3.setTelefone(sc.next());
						System.out.println("Digite O Endereço Do Cliente: ");
						c3.setEndereco(sc.next());
						System.out.println("Digite O Cep Do Cliente: ");
						c3.setCep(sc.next());
						clienteServico.cadastrar(c3);
						clienteServico.imprimirCliente();
						break;
						
					case "3":
						System.out.println("Digite O Nome Do Funcionario: ");
						f1.setNome(sc.next());
						System.out.println("Digite O Cpf Do Funcionario: ");
						f1.setCpf(sc.next());
						System.out.println("Digite O Telefone Do Funcionario: ");
						f1.setTelefone(sc.next());
						System.out.println("Digite O Endereço Do Funcionario: ");
						f1.setEndereco(sc.next());
						System.out.println("Digite O Cep Do Funcionario: ");
						f1.setCep(sc.next());
						System.out.println("Digite O Cargo Do Funcionario: ");
						f1.setCargo(sc.next());
						System.out.println("Digite O Salário Do Funcionario: ");
						f1.setSalario(sc.next());
						funcionarioServico.cadastrar(f1);
						System.out.println();
						System.out.println("Digite O Nome Do Proximo Funcionario: ");
						f2.setNome(sc.next());
						System.out.println("Digite O Cpf Do Funcionario: ");
						f2.setCpf(sc.next());
						System.out.println("Digite O Telefone Do Funcionario: ");
						f2.setTelefone(sc.next());
						System.out.println("Digite O Endereço Do Funcionario: ");
						f2.setEndereco(sc.next());
						System.out.println("Digite O Cep Do Funcionario: ");
						f2.setCep(sc.next());
						System.out.println("Digite O Cargo Do Funcionario: ");
						f2.setCargo(sc.next());
						System.out.println("Digite O Salário Do Funcionario: ");
						f2.setSalario(sc.next());
						funcionarioServico.cadastrar(f2);
						System.out.println();
						System.out.println("Digite O Nome Do Proximo Funcionario: ");
						f3.setNome(sc.next());
						System.out.println("Digite O Cpf Do Funcionario: ");
						f3.setCpf(sc.next());
						System.out.println("Digite O Telefone Do Funcionario: ");
						f3.setTelefone(sc.next());
						System.out.println("Digite O Endereço Do Funcionario: ");
						f3.setEndereco(sc.next());
						System.out.println("Digite O Cep Do Funcionario: ");
						f3.setCep(sc.next());
						System.out.println("Digite O Cargo Do Funcionario: ");
						f3.setCargo(sc.next());
						System.out.println("Digite O Salário Do Funcionario: ");
						f3.setSalario(sc.next());
						funcionarioServico.cadastrar(f3);
						System.out.println();
						funcionarioServico.imprimirFuncionario();
						break;
					case "4":
						break;
						default:
							System.out.println("DIGITE DE 1 A 3 PARA AS OPÇÕES OU 4 PARA VOLTAR!");
					}
                 }	
				break;
			case "3":
				while(!acesso.equals("4")) {
					System.out.println("Digite 1 Para Alterar Dados Dos Produtos: ");
					System.out.println("Digite 2 Para Alterar Dados Dos Cliente: ");
					System.out.println("Digite 3 Para Alterar Dados Dos Funcionario: ");
					System.out.println("Digite 4 Para Voltar: ");
					
					acesso3 = sc.next();
					
					switch(acesso3) {
					case "1":
						System.out.println("Seus Produtos: ");
						produtoServico.imprimirProduto();
						System.out.println();
						System.out.println("Digite O Nome Do Produto: ");
						p1.setNome(sc.next());
						System.out.println("Digite O Preço De Custo: ");
						p1.setPrecoCusto(sc.nextDouble());
						System.out.println("Digite O Preço De Venda: ");
						p1.setPrecoVenda(sc.nextDouble());
						System.out.println("Digite A Quantidade Em Unidades: ");
						p1.setQuantidade(sc.nextInt());
						produtoServico.cadastrar(p1);
						System.out.println();
						System.out.println("Digite O Proximo Do Produto: ");
						p2.setNome(sc.next());
						System.out.println("Digite O Preço De Custo: ");
						p2.setPrecoCusto(sc.nextDouble());
						System.out.println("Digite O Preço De Venda: ");
						p2.setPrecoVenda(sc.nextDouble());
						System.out.println("Digite A Quantidade Em Unidades: ");
						p2.setQuantidade(sc.nextInt());
						produtoServico.cadastrar(p2);
						System.out.println();
						System.out.println("Digite O Proximo Do Produto: ");
						p3.setNome(sc.next());
						System.out.println("Digite O Preço De Custo: ");
						p3.setPrecoCusto(sc.nextDouble());
						System.out.println("Digite O Preço De Venda: ");
						p3.setPrecoVenda(sc.nextDouble());
						System.out.println("Digite A Quantidade Em Unidades: ");
						p3.setQuantidade(sc.nextInt());
						produtoServico.cadastrar(p3);
						produtoServico.imprimirProduto();
						System.out.println();
						break;
					case "2":
						System.out.println("Seus Clientes: ");
						clienteServico.imprimirCliente();
						System.out.println();
						System.out.println("Digite O Nome Do Cliente: ");
						c1.setNome(sc.next());
						System.out.println("Digite O Cpf Do Cliente: ");
						c1.setCpf(sc.next());
						System.out.println("Digite O Telefone Do Cliente: ");
						c1.setTelefone(sc.next());
						System.out.println("Digite O Endereço Do Cliente: ");
						c1.setEndereco(sc.next());
						System.out.println("Digite O Cep Do Cliente: ");
						c1.setCep(sc.next());
						clienteServico.cadastrar(c1);
						System.out.println();
						System.out.println("Digite O Nome Do Proximo Cliente: ");
						c2.setNome(sc.next());
						System.out.println("Digite O Cpf Do Cliente: ");
						c2.setCpf(sc.next());
						System.out.println("Digite O Telefone Do Cliente: ");
						c2.setTelefone(sc.next());
						System.out.println("Digite O Endereço Do Cliente: ");
						c2.setEndereco(sc.next());
						System.out.println("Digite O Cep Do Cliente: ");
						c2.setCep(sc.next());
						clienteServico.cadastrar(c2);
						System.out.println();
						System.out.println("Digite O Nome Do Proximo Cliente: ");
						c3.setNome(sc.next());
						System.out.println("Digite O Cpf Do Cliente: ");
						c3.setCpf(sc.next());
						System.out.println("Digite O Telefone Do Cliente: ");
						c3.setTelefone(sc.next());
						System.out.println("Digite O Endereço Do Cliente: ");
						c3.setEndereco(sc.next());
						System.out.println("Digite O Cep Do Cliente: ");
						c3.setCep(sc.next());
						clienteServico.cadastrar(c3);
						clienteServico.imprimirCliente();
						System.out.println();
						break;
					case "3":
						System.out.println("Seus Funcionarios: ");
						funcionarioServico.imprimirFuncionario();
						System.out.println();
						System.out.println("Digite O Nome Do Funcionario: ");
						f1.setNome(sc.next());
						System.out.println("Digite O Cpf Do Funcionario: ");
						f1.setCpf(sc.next());
						System.out.println("Digite O Telefone Do Funcionario: ");
						f1.setTelefone(sc.next());
						System.out.println("Digite O Endereço Do Funcionario: ");
						f1.setEndereco(sc.next());
						System.out.println("Digite O Cep Do Funcionario: ");
						f1.setCep(sc.next());
						System.out.println("Digite O Cargo Do Funcionario: ");
						f1.setCargo(sc.next());
						System.out.println("Digite O Salário Do Funcionario: ");
						f1.setSalario(sc.next());
						funcionarioServico.cadastrar(f1);
						System.out.println();
						System.out.println("Digite O Nome Do Proximo Funcionario: ");
						f2.setNome(sc.next());
						System.out.println("Digite O Cpf Do Funcionario: ");
						f2.setCpf(sc.next());
						System.out.println("Digite O Telefone Do Funcionario: ");
						f2.setTelefone(sc.next());
						System.out.println("Digite O Endereço Do Funcionario: ");
						f2.setEndereco(sc.next());
						System.out.println("Digite O Cep Do Funcionario: ");
						f2.setCep(sc.next());
						System.out.println("Digite O Cargo Do Funcionario: ");
						f2.setCargo(sc.next());
						System.out.println("Digite O Salário Do Funcionario: ");
						f2.setSalario(sc.next());
						funcionarioServico.cadastrar(f2);
						System.out.println();
						System.out.println("Digite O Nome Do Proximo Funcionario: ");
						f3.setNome(sc.next());
						System.out.println("Digite O Cpf Do Funcionario: ");
						f3.setCpf(sc.next());
						System.out.println("Digite O Telefone Do Funcionario: ");
						f3.setTelefone(sc.next());
						System.out.println("Digite O Endereço Do Funcionario: ");
						f3.setEndereco(sc.next());
						System.out.println("Digite O Cep Do Funcionario: ");
						f3.setCep(sc.next());
						System.out.println("Digite O Cargo Do Funcionario: ");
						f3.setCargo(sc.next());
						System.out.println("Digite O Salário Do Funcionario: ");
						f3.setSalario(sc.next());
						funcionarioServico.cadastrar(f3);
						System.out.println();
						funcionarioServico.imprimirFuncionario();
						System.out.println();
						break;
					case "4":
						break;
						default:
							System.out.println("DIGITE DE 1 A 3 PARA AS OPÇÕES OU 4 PARA SAIR!");
					}
				}
				break;
			case "4":
				while(!acesso.equals("4")) {
					System.out.println("Digite 1 Para Excluir Dados Dos Produtos: ");
					System.out.println("Digite 2 Para Excluir Dados Dos Cliente: ");
					System.out.println("Digite 3 Para Excluir Dados Dos Funcionario: ");
					System.out.println("Digite 4 Para Voltar: ");
					
					acesso4 = sc.next();
					
					switch(acesso4) {
					case "1":
						System.out.println();
						produtoServico.deletar(p1);
						produtoServico.deletar(p2);
						produtoServico.deletar(p3);
						produtoServico.imprimirProduto();
						System.out.println();
						break;
					case "2":
						System.out.println();
						clienteServico.deletar(c1);
						clienteServico.deletar(c2);
						clienteServico.deletar(c3);
						clienteServico.imprimirCliente();
						System.out.println();
						break;
					case "3":
						System.out.println();
						funcionarioServico.deletar(f1);
						funcionarioServico.deletar(f2);
						funcionarioServico.deletar(f3);
						funcionarioServico.imprimirFuncionario();
						System.out.println();
						break;
					case "4":
						break;
						default:
							System.out.println("DIGITE DE 1 A 3 PARA AS OPÇÕES OU 4 PARA VOLTAR!");
					}
				}
			case "5":
				System.out.println("FIM DO PROGAMA!");
				break;
				default:
					System.out.println("DIGITE DE 1 A 4 PARA AS OPÇÕES OU 5 PARA SAIR!");			
			}
			}
		sc.close();
		}
}
