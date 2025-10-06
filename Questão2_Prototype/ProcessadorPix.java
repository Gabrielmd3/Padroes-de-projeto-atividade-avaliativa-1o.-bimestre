package Questão2_Prototype;

/**
 * Implementa a lógica de processamento para PIX.
 */
public class ProcessadorPix implements ProcessadorPagamento {

    @Override
    public void processar() {
        System.out.println("Processando pagamento com PIX...");
        // Lógica específica: gerar QR Code, consultar status da transação, etc.
    }

    @Override
    public ProcessadorPagamento clone() {
        System.out.println("Clonando protótipo de PIX...");
        try {
            return (ProcessadorPagamento) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
