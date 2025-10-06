package Questao1_FactoryMethod;

/**
 * Classe TransporteFactory (A Fábrica)
 *
 * Responsável por criar objetos do tipo Transporte.
 * Encapsula a lógica de qual classe concreta instanciar.
 * Este é o coração do padrão Factory Method.
 */
public class TransporteFactory {

    public Transporte criarTransporte(String tipo, double... valores) {
        // A escolha de qual objeto criar é centralizada aqui.
        return switch (tipo.toLowerCase()) {
            case "terrestre" -> {
                if (valores.length == 0) throw new IllegalArgumentException("Distância é necessária para transporte terrestre.");
                yield new TransporteTerrestre(valores[0]);
            }
            case "aereo" -> {
                if (valores.length == 0) throw new IllegalArgumentException("Peso é necessário para transporte aéreo.");
                yield new TransporteAereo(valores[0]);
            }
            case "maritimo" -> {
                if (valores.length == 0) throw new IllegalArgumentException("Número de contêineres é necessário para transporte marítimo.");
                yield new TransporteMaritimo((int) valores[0]);
            }
            default -> throw new IllegalArgumentException("Tipo de transporte desconhecido: " + tipo);
        };
    }
}