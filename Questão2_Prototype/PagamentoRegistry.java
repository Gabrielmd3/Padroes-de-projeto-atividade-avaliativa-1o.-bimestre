package Questão2_Prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * Classe PagamentoRegistry (O Gerenciador de Protótipos)
 * Esta classe é responsável por manter um registro dos protótipos de pagamento.
 * O cliente solicita um novo processador a esta classe, que clona o protótipo
 * apropriado e retorna a cópia.
 */
public class PagamentoRegistry {

    // Um Map para armazenar os protótipos, usando uma String como chave.
    private final Map<String, ProcessadorPagamento> prototipos = new HashMap<>();

    // O construtor é um bom lugar para inicializar e carregar os protótipos.
    public PagamentoRegistry() {
        carregarPrototipos();
    }

    private void carregarPrototipos() {
        // Criamos as instâncias "modelo" uma única vez.
        prototipos.put("cartao", new ProcessadorCartaoCredito());
        prototipos.put("boleto", new ProcessadorBoleto());
        prototipos.put("pix", new ProcessadorPix());
    }

    /**
     * O método principal que o cliente usará.
     * Ele busca o protótipo pelo tipo e chama o método clone() nele.
     */
    public ProcessadorPagamento criarProcessador(String tipo) {
        ProcessadorPagamento prototipo = prototipos.get(tipo.toLowerCase());
        if (prototipo != null) {
            return prototipo.clone();
        }
        throw new IllegalArgumentException("Meio de pagamento desconhecido: " + tipo);
    }
}
