package Questao3_Observer;

/**
 * Define o contrato para os objetos que desejam ser notificados
 * sobre as mudanças em um Subject. Eles devem ter um método
 * (aqui chamado 'atualizar') que o Subject chamará quando seu estado mudar.
 */
public interface Observer {
    void atualizar(String nomeTopico, String tituloNoticia);
}
