package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    //atributo

    private List<Item> itemList;

    public CarrinhoDeCompras(){
        this.itemList = new ArrayList<>();
    }
   // errei private List<CarrinhoDeCompras> carrinhoList;


    // errei aqui public CarrinhoDeCompras() {
   //     this.carrinhoList = new ArrayList<>();
  //  }

    // errei public List<CarrinhoDeCompras> getCarrinhoList() {
      //  return carrinhoList;
   // }

    // correta abaixo
    public void adicionarItem(String nome, double preco, int quantidade){
        // errei carrinhoList.add(new CarrinhoDeCompras());
        Item item = new Item(nome,preco,quantidade);
        this.itemList.add(item);
    }

    // errei x2 public void removerCarrinho(String nome){
     //   List<CarrinhoDeCompras> itemParaRemover = new ArrayList<>();
      //  for(CarrinhoDeCompras c : carrinhoList){
        //    if(c.getCarrinhoList().equals(carrinhoList)){
          //      itemParaRemover.add(c);
          //  }
      //  }
    //    carrinhoList.removeAll(itemParaRemover);
   // }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        if(!itemList.isEmpty()){
            for(Item i : itemList){
                if (i.getNome().equalsIgnoreCase(nome)){
                    itensParaRemover.add(i);
                }
            }
            itemList.removeAll(itensParaRemover);
        }else {
            System.out.println("A Lista ta vazia");
        }
    }
    public double calcularValorTotal(){
        double valorTotal =0d;
        if (!itemList.isEmpty()){
            for (Item item : itemList) {
                double valorItem = item.getPreco() * item.getQuant();
                valorTotal+=valorItem;
            }
            return valorTotal;
        }else {
            throw new RuntimeException("A Lista está vazia");
        }
    }

    public void exibirItens(){
        if(!itemList.isEmpty()) {
            System.out.println(this.itemList);
        }else{
            System.out.println("A Lista está vazia");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" + "Itens=" + itemList+ '}';
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carro = new CarrinhoDeCompras();
        carro.adicionarItem("Leite",20,2);
        carro.adicionarItem("Sal",2,19);
        carro.removerItem("Sal");
        carro.exibirItens();
        System.out.println("O Valor total da compra é " + carro.calcularValorTotal());
    }
}
