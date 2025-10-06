package Questao5_Prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * Classe GerenciadorDeModelos (Prototype Registry/Manager)
 *
 * Responsável por armazenar os modelos de documentos (protótipos)
 * e fornecer cópias clonadas deles quando solicitado.
 */
public class GerenciadorDeModelos {

    private Map<String, Documento> modelos = new HashMap<>();

    // No construtor, carregamos os modelos iniciais que servirão de protótipo.
    public GerenciadorDeModelos() {
        modelos.put("curriculo", new Curriculo());
        modelos.put("proposta", new PropostaComercial());
    }

    /**
     * Obtém um clone do modelo especificado.
     * @param chave A chave que identifica o modelo (ex: "curriculo").
     * @return Uma nova instância do documento, clonada a partir do modelo.
     */
    public Documento getDocumentoClone(String chave) {
        Documento modelo = modelos.get(chave.toLowerCase());
        if (modelo != null) {
            return modelo.clone();
        }
        throw new IllegalArgumentException("Modelo de documento não encontrado: " + chave);
    }
}
