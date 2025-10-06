package Questão2_Prototype;

/**
 * Estende a interface Cloneable, indicando que os objetos que a implementam
 * Define o contrato para todos os processadores de pagamento.
 */
public interface ProcessadorPagamento extends Cloneable {
    /**
     * Executa o processamento do pagamento.
     */
    void processar();

    /**
     * Declara o método de clonagem que irá criar uma cópia do objeto.
     */
    ProcessadorPagamento clone();
}
