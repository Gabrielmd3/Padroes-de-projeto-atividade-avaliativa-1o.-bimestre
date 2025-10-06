package Questao3_Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementa a interface Subject. Este é o objeto cujo estado interessa aos Observers. 
 * Ele mantém uma lista de Observers e os notifica
 * quando uma nova notícia é publicada.
 */

public class Topico implements Subject {

    private final String nome;
    private final List<Observer> observers = new ArrayList<>();
    private String ultimaNoticia;

    public Topico(String nome) {
        this.nome = nome;
    }

    @Override
    public void registrarObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removerObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notificarObservers() {
        // Itera sobre a lista de observers e chama o método de atualização de cada um.
        for (Observer observer : observers) {
            observer.atualizar(this.nome, this.ultimaNoticia);
        }
    }

    /**
     * Este é o método que dispara a mudança de estado.
     * Quando uma nova notícia é publicada, o estado muda e os observers são notificados.
     * @param tituloNoticia O título da nova notícia.
     */
    public void publicarNovaNoticia(String tituloNoticia) {
        this.ultimaNoticia = tituloNoticia;
        System.out.println("\n------------------------------------------------------");
        System.out.printf("NOVA NOTÍCIA no tópico '%s': %s\n", this.nome, this.ultimaNoticia);
        System.out.println("------------------------------------------------------");
        notificarObservers();
    }
}