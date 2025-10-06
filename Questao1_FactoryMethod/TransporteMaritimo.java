package Questao1_FactoryMethod;
/**
 * Implementa a interface Transporte para a modalidade marítima.
 * O cálculo do frete aqui é baseado em uma tarifa fixa por contêiner.
 */
public class TransporteMaritimo implements Transporte {
    private final int numeroDeContainers;
    private static final double TARIFA_POR_CONTAINER = 2500.00;

    public TransporteMaritimo(int numeroDeContainers) {
        this.numeroDeContainers = numeroDeContainers;
    }

    @Override
    public double calcularFrete() {
        return this.numeroDeContainers * TARIFA_POR_CONTAINER;
    }
}