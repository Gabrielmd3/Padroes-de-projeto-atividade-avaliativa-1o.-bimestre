package Questao4_Decorator;

/**
 * Classe Main (Cliente)
 *
 * Demonstra o uso do padrão Decorator.
 *
 * O padrão Decorator foi escolhido para estender as funcionalidades de um relatório
 * de forma flexível e sem modificar seu código-fonte. A abordagem consiste em
 * "envelopar" o objeto base com decoradores que adicionam novas responsabilidades,
 * como estatísticas e gráficos, de maneira combinável e dinâmica. Isso respeita o
 * Princípio Aberto/Fechado e evita a criação de múltiplas subclasses.
 */

public class Main {
    public static void main(String[] args) {
        // 1. Começamos com o objeto básico
        Relatorio relatorio = new RelatorioSimples();
        System.out.println("--- Relatório Simples ---");
        System.out.println(relatorio.gerar());
        System.out.println("========================================================\n");

        // 2. Decoramos o relatório simples com estatísticas
        relatorio = new EstatisticasDecorator(relatorio);
        System.out.println("--- Relatório com Estatísticas ---");
        System.out.println(relatorio.gerar());
        System.out.println("========================================================\n");

        // 3. Podemos decorar o relatório que já tem estatísticas com gráficos
        relatorio = new GraficosDecorator(relatorio);
        System.out.println("--- Relatório com Estatísticas e Gráficos ---");
        System.out.println(relatorio.gerar());
        System.out.println("========================================================\n");
        
        // 4. Agora, vamos pegar o relatório completo e "envelopá-lo" com o formato PDF
        relatorio = new ExportPDFDecorator(relatorio);
        System.out.println("--- Relatório Final com Formato PDF ---");
        System.out.println(relatorio.gerar());
        System.out.println("========================================================\n");

        // Também podemos criar uma combinação diferente do zero
        System.out.println("--- Nova Combinação: Relatório com Gráficos e PDF (sem estatísticas) ---");
        Relatorio outroRelatorio = new ExportPDFDecorator(new GraficosDecorator(new RelatorioSimples()));
        System.out.println(outroRelatorio.gerar());
    }
}
