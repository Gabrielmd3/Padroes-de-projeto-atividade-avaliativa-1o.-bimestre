package Questao5_Prototype;

public class Main {
    public static void main(String[] args) {
       // O cliente cria o gerenciador que já contém os modelos.
        GerenciadorDeModelos gerenciador = new GerenciadorDeModelos();

        System.out.println("--- Gerando documento para o Cliente A ---");
        // Pega um clone do modelo de currículo.
        Documento curriculoClienteA = gerenciador.getDocumentoClone("curriculo");
        // Personaliza a CÓPIA, não o modelo original.
        curriculoClienteA.personalizar("Verde", "Calibri", "LogoA.png");
        curriculoClienteA.exibir();

        System.out.println("\n--- Gerando documento para o Cliente B ---");
        // Pega um OUTRO clone do MESMO modelo de currículo.
        Documento curriculoClienteB = gerenciador.getDocumentoClone("curriculo");
        // Personaliza esta segunda cópia de forma diferente.
        curriculoClienteB.personalizar("Roxo", "Georgia", "LogoB.png");
        curriculoClienteB.exibir();

        System.out.println("\n--- Gerando proposta para o Cliente A ---");
        Documento propostaClienteA = gerenciador.getDocumentoClone("proposta");
        propostaClienteA.personalizar("Verde", "Calibri", "LogoA.png");
        propostaClienteA.exibir();

        System.out.println("\n--- Verificando o modelo original de currículo ---");
        // Para provar que o modelo original não foi alterado, vamos cloná-lo novamente.
        Documento modeloOriginal = gerenciador.getDocumentoClone("curriculo");
        System.out.println("O modelo original permanece com a personalização padrão:");
        modeloOriginal.exibir(); 
    }
}
