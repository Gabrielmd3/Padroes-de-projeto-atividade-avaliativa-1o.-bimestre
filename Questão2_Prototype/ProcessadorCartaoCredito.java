package Questão2_Prototype;

/**
 * Implementa a lógica de processamento para cartões de crédito.
 */
public class ProcessadorCartaoCredito implements ProcessadorPagamento {

    @Override
    public void processar() {
        System.out.println("Processando pagamento com Cartão de Crédito...");
        // Lógica específica: conectar ao gateway, validar dados do cartão, etc.
    }

    /**
     * Implementação do método de clonagem.
     * Cria e retorna uma nova instância desta classe.
     */
    @Override
    public ProcessadorPagamento clone() {
        System.out.println("Clonando protótipo de Cartão de Crédito...");
        try {
            // A chamada a super.clone() faz uma cópia rasa (shallow copy) do objeto.
            // Para este caso, onde não temos objetos complexos como atributos, é suficiente.
            return (ProcessadorPagamento) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
