package Questao1_FactoryMethod;

/**
 * Implementa a interface Transporte para a modalidade terrestre.
 * O cálculo do frete aqui é baseado na distância em quilômetros.
 */

public class TransporteTerrestre implements Transporte {

    private final double distanciaKm;
    private static final double TARIFA_POR_KM = 1.50;

    public TransporteTerrestre(double distanciaKm) {
        this.distanciaKm = distanciaKm;
    }
    @Override
    public double calcularFrete() {
        return this.distanciaKm * TARIFA_POR_KM;
    }
    
}
