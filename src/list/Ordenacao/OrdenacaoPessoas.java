package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionaPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordernarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordernarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();


        ordenacaoPessoas.adicionaPessoa("Danielle",22,1.59);
        ordenacaoPessoas.adicionaPessoa("Danielle",24,1.58);
        ordenacaoPessoas.adicionaPessoa("Danielle",21,1.60);
        ordenacaoPessoas.adicionaPessoa("Daniele",23,1.63);
        System.out.println("Lista de Pessoa " + ordenacaoPessoas.pessoaList);
        System.out.println("Lista de Pessoa por Idade " + ordenacaoPessoas.ordernarPorIdade());
        System.out.println("Lista de Pessoa por altura " + ordenacaoPessoas.ordernarPorAltura());
    }


}

