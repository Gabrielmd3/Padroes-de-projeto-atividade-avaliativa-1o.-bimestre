package Questao4_Decorator;

/**
 * Classe EstatisticasDecorator (Concrete Decorator)
 *
 * Adiciona a responsabilidade de incluir estatísticas ao relatório.
 */
public class EstatisticasDecorator extends RelatorioDecorator {

    public EstatisticasDecorator(Relatorio relatorio) {
        super(relatorio);
    }

    @Override
    public String gerar() {
        // Primeiro, chama o método gerar() do objeto que está sendo decorado
        // (que pode ser o RelatorioSimples ou outro decorador).
        String relatorioBase = super.gerar();
        // Em seguida, adiciona a sua própria funcionalidade.
        return relatorioBase + adicionarEstatisticas();
    }

    private String adicionarEstatisticas() {
        return "\n[+] Adicionando estatísticas de faturamento: R$ 1.234,56";
    }
}
