package Questao3_Observer;

/**
 * Define o contrato para os objetos que serão observados.
 * Eles devem fornecer métodos para que os Observers possam se registrar,
 * cancelar o registro e um método para notificar todos os Observers registrados.
 */

 public interface Subject {
    void registrarObserver(Observer observer);
    void removerObserver(Observer observer);
    void notificarObservers();
}
