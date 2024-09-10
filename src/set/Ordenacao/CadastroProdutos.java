package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionaProduto(int cod, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(nome, cod, preco, quantidade));

    }
    public  Set<Produto> exibirProdutoPorNome(){
        Set<Produto> produtosPorNome =  new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto>exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.adicionaProduto(11,"arroz",15.50,40);
        cadastroProdutos.adicionaProduto(11,"Feijao",15.40,3);
        cadastroProdutos.adicionaProduto(11,"Tomate",15.60,10);
        cadastroProdutos.adicionaProduto(11,"LóLó",15.20,5);
        System.out.println(cadastroProdutos.exibirProdutoPorNome());
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
        System.out.println(cadastroProdutos.produtoSet);
    }
}
