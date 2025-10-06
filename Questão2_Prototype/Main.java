package Questão2_Prototype;
/** 
* Classe Main (Cliente)
 *
 * Demonstra o uso do padrão Prototype para criar processadores de pagamento.
 *
 * O padrão Prototype foi escolhido para criar novas instâncias de objetos
 * através da clonagem de "modelos" pré-configurados. Essa abordagem
 * desacopla o cliente do processo de criação e é altamente eficiente, pois
 * evita o custo de recriar objetos complexos do zero a cada vez.
 * A adição de novos processadores é feita dinamicamente, registrando
 * um novo protótipo.
*/
public class Main {
    public static void main(String[] args) {
        // O cliente cria o registro que contém os protótipos.
        PagamentoRegistry registry = new PagamentoRegistry();

        System.out.println("--- Iniciando um pagamento com PIX ---");
        // O cliente não faz "new ProcessadorPix()". Ele pede um clone ao registro.
        ProcessadorPagamento processadorPix1 = registry.criarProcessador("pix");
        processadorPix1.processar();

        System.out.println("\n--- Iniciando outro pagamento com PIX ---");
        ProcessadorPagamento processadorPix2 = registry.criarProcessador("pix");
        processadorPix2.processar();

        // Prova de que os objetos são instâncias diferentes (clones)
        System.out.println("\nVerificando se os objetos são instâncias diferentes:");
        System.out.println("Hash do processadorPix1: " + processadorPix1.hashCode());
        System.out.println("Hash do processadorPix2: " + processadorPix2.hashCode());
        System.out.println("São o mesmo objeto? " + (processadorPix1 == processadorPix2));

        System.out.println("\n--- Iniciando um pagamento com Cartão de Crédito ---");
        ProcessadorPagamento processadorCartao = registry.criarProcessador("cartao");
        processadorCartao.processar();
    }
}
