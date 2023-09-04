package repositorioProduto;

import java.util.ArrayList;

import entidade.Produto;

public class ProdutoRepositorio {
public ArrayList<Produto> listaProduto;
	
	public ProdutoRepositorio(ArrayList<Produto> listaProduto) {
		this.listaProduto = listaProduto;
	}
	public void cadastrar(Produto produto) {
		listaProduto.add(produto);
	}
	public ArrayList<Produto> listar(){
		return listaProduto;
	}
	public ArrayList<Produto> listarPorNome(String nome){
		ArrayList<Produto> listaPorNome = new ArrayList<>();
		
		for(Produto produto : listaProduto) {
			if(produto.getNome().equals(nome)) 
			listaPorNome.add(produto);
		}
		
		return listaPorNome;
	}
	public void atualizar(Produto produto, int index) {
		listaProduto.add(index, produto);
	}
	
	public void deletar(Produto produto) {
		listaProduto.remove(produto);
	}
	
	public void deletar(int indice) {
		listaProduto.remove(indice);
 }	
}