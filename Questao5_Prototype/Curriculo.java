package Questao5_Prototype;

/**
 * Classe Curriculo (Concrete Prototype)
 *
 * Um tipo específico de documento que pode ser clonado.
 */

public class Curriculo implements Documento {

    private String conteudoBase = "Estrutura de Currículo Padrão (Nome, Experiência, Educação)";
    private String cor = "Padrão (Preto)";
    private String fonte = "Padrão (Arial)";
    private String logo = "Nenhum";

    @Override
    public void personalizar(String cor, String fonte, String logo) {
        this.cor = cor;
        this.fonte = fonte;
        this.logo = logo;
    }

    @Override
    public void exibir() {
        System.out.println("--- Currículo ---");
        System.out.println(conteudoBase);
        System.out.printf("Personalização: Cor=%s, Fonte=%s, Logo=%s\n", cor, fonte, logo);
    }

    @Override
    public Documento clone() {
        System.out.println("Clonando modelo de Currículo...");
        try {
            return (Documento) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
