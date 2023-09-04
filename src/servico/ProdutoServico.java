package servico;

import java.util.ArrayList;
import entidade.Produto;
import repositorioProduto.ProdutoRepositorio;




public class ProdutoServico {
private ProdutoRepositorio produtoRepositorio;
	
	public ProdutoServico (ArrayList<Produto> listaProduto) {
		this.produtoRepositorio = new ProdutoRepositorio(listaProduto);
	}
	public void atualizar(Produto produto) {
		produtoRepositorio.cadastrar(produto);
	}
	public void deletar(Produto produto) {
		produtoRepositorio.deletar(produto);
	}
	public void cadastrar(Produto produto) {
		produtoRepositorio.cadastrar(produto);;
	}
	public ArrayList<Produto> listar(){
    	return produtoRepositorio.listar();
	}
	
	public void imprimirProduto() {
    	for(Produto produto : produtoRepositorio.listar()) {
    		System.out.println();
    		System.out.println("NOME: " + produto.getNome());
    		System.out.println("PREÇO DE CUSTO: " + produto.getPrecoCusto());
    		System.out.println("PREÇO DE VENDA: " + produto.getPrecoVenda());
    		System.out.println("QUANTIDADE EM ESTOQUE: " + produto.getQuantidade());
    		System.out.println();
    	}
    }
	
}
