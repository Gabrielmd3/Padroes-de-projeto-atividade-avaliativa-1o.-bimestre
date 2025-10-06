package Questao5_Prototype;

/**
 * Classe PropostaComercial (Concrete Prototype)
 *
 * Outro tipo específico de documento que pode ser clonado.
 */
public class PropostaComercial implements Documento {

    private String conteudoBase = "Estrutura de Proposta Comercial (Introdução, Escopo, Preços)";
    private String cor = "Padrão (Azul Corporativo)";
    private String fonte = "Padrão (Times New Roman)";
    private String logo = "Nenhum";

    @Override
    public void personalizar(String cor, String fonte, String logo) {
        this.cor = cor;
        this.fonte = fonte;
        this.logo = logo;
    }

    @Override
    public void exibir() {
        System.out.println("--- Proposta Comercial ---");
        System.out.println(conteudoBase);
        System.out.printf("Personalização: Cor=%s, Fonte=%s, Logo=%s\n", cor, fonte, logo);
    }

    @Override
    public Documento clone() {
        System.out.println("Clonando modelo de Proposta Comercial...");
        try {
            return (Documento) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
