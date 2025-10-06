package Questao1_FactoryMethod;

/**
 * Classe Main (Cliente)
 *
 * Demonstra o uso do padrão Factory Method para criar e utilizar
 * diferentes tipos de transporte de forma genérica.
 * O padrão foi escolhido para centralizar a lógica de criação dos objetos
 * de transporte e desacoplar o cliente das classes concretas.
 * A fábrica (`TransporteFactory`) decide qual tipo de transporte instanciar,
 * permitindo que o sistema seja facilmente estendido com novos tipos
 * sem impactar o código que os consome.
 */
public class Main {
    public static void main(String[] args) {
        // O cliente cria a fábrica que será usada para obter os objetos.
        TransporteFactory factory = new TransporteFactory();

        System.out.println("Iniciando cálculos de frete...");

        // O cliente não faz "new TransporteTerrestre()". Ele pede para a fábrica.
        // Ele trata o objeto retornado apenas pela sua interface comum "Transporte".
        Transporte transporte1 = factory.criarTransporte("terrestre", 150.0); // 150 km
        System.out.printf("Custo do Frete Terrestre para 150km: R$ %.2f\n", transporte1.calcularFrete());

        Transporte transporte2 = factory.criarTransporte("aereo", 50.0); // 50 kg
        System.out.printf("Custo do Frete Aéreo para 50kg: R$ %.2f\n", transporte2.calcularFrete());

        Transporte transporte3 = factory.criarTransporte("maritimo", 2.0); // 2 contêineres
        System.out.printf("Custo do Frete Marítimo para 2 contêineres: R$ %.2f\n", transporte3.calcularFrete());
        
        // Exemplo de tratamento de erro para um tipo inválido
        try {
            factory.criarTransporte("fluvial", 100.0);
        } catch (IllegalArgumentException e) {
            System.out.println("\nTentativa de criar transporte inválido: " + e.getMessage());
        }
    }
}