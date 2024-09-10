package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long,Produto> estoqueProdutoMap;

    public EstoqueProdutos() {
        this.estoqueProdutoMap = new HashMap<>();
    }

    public void adicionaProduto(long cod, String nome,int quantidade, double preco){
        estoqueProdutoMap.put(cod,new Produto( nome, quantidade, preco));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutoMap);
    }

    public double calculaValorTotalEstoque(){
        double valorTotalEstoque = 0d;
        if (!estoqueProdutoMap.isEmpty()){
            for (Produto p : estoqueProdutoMap.values()){
                valorTotalEstoque +=p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

  public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutoMap.isEmpty()){
            for (Produto p : estoqueProdutoMap.values()){
                if (p.getPreco() > maiorPreco){
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
  }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
        estoqueProdutos.adicionaProduto(1,"arroz",1,5.10);
        estoqueProdutos.adicionaProduto(2,"arroz",1,5.50);
        estoqueProdutos.adicionaProduto(3,"feijao",1,7.40);
        estoqueProdutos.adicionaProduto(4,"laranja",1,6.10);
        estoqueProdutos.adicionaProduto(5,"aranja",1,7.12);
        estoqueProdutos.exibirProdutos();
        System.out.println("Valor total: " + estoqueProdutos.calculaValorTotalEstoque());
        System.out.println("O Produto Mais Caro: " + estoqueProdutos.obterProdutoMaisCaro());

    }
}
