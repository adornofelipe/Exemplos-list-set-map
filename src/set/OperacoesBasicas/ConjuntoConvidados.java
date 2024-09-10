package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado>convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionaConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome,codigoConvite));

    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet){
            if (c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover= c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidado(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        conjuntoConvidados.adicionaConvidado("Felipe",1);
        conjuntoConvidados.adicionaConvidado("Philippe",14);
        conjuntoConvidados.adicionaConvidado("Danielle",2);
        conjuntoConvidados.adicionaConvidado("Daniele",3);
        System.out.println("A Quantidade de convidado é " + conjuntoConvidados.contarConvidados() );
        conjuntoConvidados.exibirConvidado();
        conjuntoConvidados.removerConvidadoPorCodigoConvite(2);
        System.out.println("A Quantidade de convidado é " + conjuntoConvidados.contarConvidados() );
        conjuntoConvidados.exibirConvidado();
    }
}
