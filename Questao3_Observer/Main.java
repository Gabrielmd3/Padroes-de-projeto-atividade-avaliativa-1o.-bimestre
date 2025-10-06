package Questao3_Observer;

/**
 * Demonstra o funcionamento do padrão Observer.
 * Cria tópicos (Subjects) e leitores (Observers), estabelece as assinaturas
 * e simula a publicação de notícias para ver as notificações em ação.
 */

public class Main {
    public static void main(String[] args) {
        // 1. Criar os Subjects (Tópicos)
        Topico esportes = new Topico("Esportes");
        Topico tecnologia = new Topico("Tecnologia");

        // 2. Criar os Observers (Leitores)
        Leitor leitorJoao = new Leitor("João");
        Leitor leitorMaria = new Leitor("Maria");
        Leitor leitorCarlos = new Leitor("Carlos");

        // 3. Registrar os Observers nos Subjects (Leitores se inscrevem nos tópicos)
        esportes.registrarObserver(leitorJoao);
        esportes.registrarObserver(leitorCarlos);

        tecnologia.registrarObserver(leitorMaria);
        tecnologia.registrarObserver(leitorCarlos);

        // 4. Simular a publicação de notícias
        // Apenas João e Carlos devem ser notificados
        esportes.publicarNovaNoticia("Brasil vence a final da Copa do Mundo!");

        // Apenas Maria e Carlos devem ser notificados
        tecnologia.publicarNovaNoticia("Lançado novo processador quântico.");

        // 5. Demonstrar o cancelamento de inscrição
        System.out.println("\n======================================================");
        System.out.println("Carlos cancelou a inscrição no tópico de Esportes.");
        System.out.println("======================================================");
        esportes.removerObserver(leitorCarlos);

        // Agora, apenas João deve ser notificado sobre esportes
        esportes.publicarNovaNoticia("Novo recorde mundial nos 100m rasos.");
    }
}
