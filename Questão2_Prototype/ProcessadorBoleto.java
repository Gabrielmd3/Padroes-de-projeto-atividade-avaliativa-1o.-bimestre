package Questão2_Prototype;

/**
 * Implementa a lógica de processamento para boletos bancários.
 */
public class ProcessadorBoleto implements ProcessadorPagamento {

    @Override
    public void processar() {
        System.out.println("Processando pagamento com Boleto Bancário...");
        // Lógica específica: gerar código de barras, registrar no banco, etc.
    }

    @Override
    public ProcessadorPagamento clone() {
        System.out.println("Clonando protótipo de Boleto Bancário...");
        try {
            return (ProcessadorPagamento) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
