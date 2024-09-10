package map.Ordenacao;

import com.sun.java.accessibility.util.EventQueueMonitor;

import java.time.LocalDate;
import java.util.*;

public class AgendaEventos {

    private Map<LocalDate,Evento> eventoMap;

    public AgendaEventos() {
        this.eventoMap = new HashMap<>();
    }

    public void adicionaEvento(LocalDate data,String nome,String atracao){
        Evento evento = new Evento(nome,atracao);
        eventoMap.put(data,evento);
    }


    public void exibirAgenda(){
        Map<LocalDate,Evento> eventoTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventoTreeMap);
    }

    public void obterProximoEvento(){
    LocalDate dataAtual = LocalDate.now();
    LocalDate proximaData = null;
    Evento proximoEvento = null;
    Map<LocalDate,Evento> eventoTreeMap = new TreeMap<>(eventoMap);
    for (Map.Entry<LocalDate,Evento> entry : eventoTreeMap.entrySet()) {
        if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
            proximaData= entry.getKey();
            proximoEvento= entry.getValue();
            System.out.println("O Proximo evento: " + proximoEvento + " Acontecera na data " + proximaData );
            break;
        }
        }

    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionaEvento(LocalDate.of(2024,9,9), "Evento1","Atracao1");
        agendaEventos.adicionaEvento(LocalDate.of(2024,9,10), "Evento2","Atracao2");
        agendaEventos.adicionaEvento(LocalDate.of(2024,9,8), "Evento3","Atracao3");
        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();




    }
}
