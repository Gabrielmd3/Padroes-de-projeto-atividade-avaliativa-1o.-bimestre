package Questao4_Decorator;

/**
 * Classe RelatorioSimples (Concrete Component)
 *
 * Esta é a classe base que queremos decorar. Ela implementa a funcionalidade
 * fundamental e inicial do relatório.
 */

public class RelatorioSimples implements Relatorio {
    @Override
    public String gerar() {
        return "Conteúdo do relatório básico com lista de pedidos.";
    }
}