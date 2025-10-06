package Questao1_FactoryMethod;
/**
 * Implementa a interface Transporte para a modalidade aérea.
 * O cálculo do frete aqui é baseado no peso da carga.
 */

public class TransporteAereo implements Transporte {
    private final double pesoKg;
    private static final double TARIFA_BASE = 100.00;
    private static final double TARIFA_POR_KG = 10.00;

    public TransporteAereo(double pesoKg) {
        this.pesoKg = pesoKg;
    }

    @Override
    public double calcularFrete() {
        return TARIFA_BASE + (this.pesoKg * TARIFA_POR_KG);
    }

}
