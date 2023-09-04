package repositorioFuncionario;

import java.util.ArrayList;

import entidade.Funcionario;

public class FuncionarioRepositorio {
public ArrayList<Funcionario> listaFuncionario;
	
	public FuncionarioRepositorio(ArrayList<Funcionario> listaFuncionario) {
		this.listaFuncionario = listaFuncionario;
	}
	public void cadastrar(Funcionario funcionario) {
		listaFuncionario.add(funcionario);
	}
	public ArrayList<Funcionario> listar(){
		return listaFuncionario;
	}
	public ArrayList<Funcionario> listarPorNome(String nome){
		ArrayList<Funcionario> listaPorNome = new ArrayList<>();
		
		for(Funcionario funcionario : listaFuncionario) {
			if(funcionario.getNome().equals(nome)) 
			listaPorNome.add(funcionario);
		}
		
		return listaPorNome;
	}
	public void atualizar(Funcionario funcionario, int index) {
		listaFuncionario.add(index, funcionario);
	}
	
	public void deletar(Funcionario funcionario) {
		listaFuncionario.remove(funcionario);
	}
	
	public void deletar(int indice) {
		listaFuncionario.remove(indice);
 }	
}