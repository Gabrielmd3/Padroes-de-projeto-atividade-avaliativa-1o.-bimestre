package Questao3_Observer;

/**
 * Implementa a interface Observer. Representa um leitor que se inscreve
 * nos tópicos. O método 'atualizar' define o que acontece quando o leitor
 * recebe uma notificação.
 */

public class Leitor implements Observer {

    private final String nome;

    public Leitor(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String nomeTopico, String tituloNoticia) {
        // Ação a ser tomada quando a notificação é recebida.
        System.out.printf(">> Notificação para %s: A notícia '%s' foi publicada no tópico '%s'.\n",
                this.nome, tituloNoticia, nomeTopico);
    }
}
