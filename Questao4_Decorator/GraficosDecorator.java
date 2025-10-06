package Questao4_Decorator;

/**
 * Classe GraficosDecorator (Concrete Decorator)
 *
 * Adiciona a responsabilidade de incluir gráficos ao relatório.
 */
public class GraficosDecorator extends RelatorioDecorator {

    public GraficosDecorator(Relatorio relatorio) {
        super(relatorio);
    }

    @Override
    public String gerar() {
        String relatorioBase = super.gerar();
        return relatorioBase + adicionarGraficos();
    }

    private String adicionarGraficos() {
        return "\n[+] Adicionando gráficos de vendas por região.";
    }
}