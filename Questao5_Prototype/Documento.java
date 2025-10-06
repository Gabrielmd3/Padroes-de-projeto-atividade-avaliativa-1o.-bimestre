package Questao5_Prototype;

/**
 * Interface Documento (Prototype)
 *
 * Define a interface para os objetos que podem ser clonados.
 * Ela estende a interface Cloneable do Java para habilitar a clonagem.
 */

public interface Documento extends Cloneable {
    /**
     * Personaliza o documento com informações específicas do cliente.
     */
    void personalizar(String cor, String fonte, String logo);

    /**
     * Exibe ou renderiza o documento.
     */
    void exibir();

    /**
     * O método de clonagem que criará uma cópia do objeto.
     * @return um clone do documento.
     */
    Documento clone();
}
