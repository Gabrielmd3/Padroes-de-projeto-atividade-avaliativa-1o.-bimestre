package Questao4_Decorator;

/**
 * Interface Relatorio (Component)
 *
 * Define a interface comum para o objeto que será decorado (o RelatorioSimples)
 * e para os decoradores. Isso permite que o cliente trate todos os objetos
 * da mesma maneira.
 */

public interface Relatorio {
    String gerar();
}
