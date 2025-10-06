package Questao4_Decorator;

/**
 * Classe Abstrata RelatorioDecorator (Abstract Decorator)
 *
 * Mantém uma referência para o objeto Relatorio (Component) que ele decora.
 * Implementa a mesma interface do componente que decora.
 * O objetivo desta classe é delegar todas as chamadas para o objeto decorado,
 * permitindo que as subclasses (decoradores concretos) adicionem seu próprio
 * comportamento antes ou depois da delegação.
 */

public abstract class RelatorioDecorator implements Relatorio {

    protected Relatorio relatorioDecorado;

    public RelatorioDecorator(Relatorio relatorio) {
        this.relatorioDecorado = relatorio;
    }

    // A implementação padrão é apenas delegar a chamada para o objeto decorado.
    @Override
    public String gerar() {
        return relatorioDecorado.gerar();
    }
}
