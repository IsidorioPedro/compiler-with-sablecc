package compilador;

import java.util.HashMap;
import java.util.Stack;

public class TabelaDeSimbolos extends Stack {
    
    // Pilha de tabelas de símbolos (HashMaps)
    private Stack<HashMap<String, Simbolo>> pilha;

    // Construtor
    public TabelaDeSimbolos() {
        pilha = new Stack<>();
    }
}