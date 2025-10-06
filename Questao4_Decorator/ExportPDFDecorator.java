package Questao4_Decorator;

/**
 * Classe ExportPDFDecorator (Concrete Decorator)
 *
 * Adiciona a formatação/lógica de exportação para PDF ao relatório.
 */
public class ExportPDFDecorator extends RelatorioDecorator {

    public ExportPDFDecorator(Relatorio relatorio) {
        super(relatorio);
    }

    @Override
    public String gerar() {
        String conteudo = super.gerar();
        // Neste caso, a decoração "envelopa" o conteúdo original.
        return formatarParaPDF(conteudo);
    }

    private String formatarParaPDF(String conteudo) {
        return "\n--- INÍCIO DO DOCUMENTO PDF ---\n" +
               conteudo +
               "\n--- FIM DO DOCUMENTO PDF ---";
    }
}
