package compilador;

import java.util.LinkedHashMap;
import java.util.Map;

public class HashPilha<K, V> extends LinkedHashMap<K, V> {
    private final int maxSize;

    // Construtor que define o tamanho máximo e a ordem de inserção
    public HashPilha(int maxSize) {
        super(maxSize, 0.75f, false); // 'false' para ordem de inserção
        this.maxSize = maxSize;
    }

    // Override do método put para adicionar comportamento de pilha
    @Override
    public V put(K key, V value) {
        if (size() >= maxSize) {
            // Remove a chave mais antiga (ou primeira chave)
            K firstKey = keySet().iterator().next();
            remove(firstKey);
        }
        System.out.println("Adicionando no topo da pilha: " + key + " -> " + value);
        return super.put(key, value);
    }
    
    @Override
    public V get(Object key) {
        V value = super.get(key);

        if (value != null) {
            System.out.println("Recuperando valor para a chave: " + key + " -> " + value);
        } else {
            System.out.println("Chave não encontrada: " + key);
        }

        return value;
    }

    // Método para remover o elemento no topo da pilha (o último adicionado)
    public V pop() {
        K lastKey = null;
        for (K key : keySet()) {
            lastKey = key;
        }

        if (lastKey != null) {
            V value = remove(lastKey);
            System.out.println("Removendo do topo da pilha: " + lastKey + " -> " + value);
            return value;
        }
        return null;
    }

    // Método para visualizar o elemento no topo da pilha sem remover
    public V peek() {
        K lastKey = null;
        for (K key : keySet()) {
            lastKey = key;
        }

        if (lastKey != null) {
            return get(lastKey);
        }
        return null;
    }
    
    // Função printf para exibir o estado da HashPilha de forma mais visual, com busca nas listas encadeadas dos buckets
    public void printf() {
        System.out.println("Estado atual da HashPilha:");
        if (isEmpty()) {
            System.out.println("A pilha está vazia.");
            return;
        }

        // Visualização dos buckets (baldes) e suas listas encadeadas
        System.out.println("Buckets (baldes) e entradas:");
        Map<Integer, StringBuilder> bucketMap = new LinkedHashMap<>();

        // Primeiro, associar cada entrada ao índice do bucket correspondente.
        for (Map.Entry<K, V> entry : entrySet()) {
            int bucketIndex = entry.getKey().hashCode() % maxSize;
            bucketMap.putIfAbsent(bucketIndex, new StringBuilder());
            bucketMap.get(bucketIndex).append(" -> [" + entry.getKey() + " | " + entry.getValue() + "]");
        }

        // Em seguida, exibir cada bucket e sua lista encadeada.
        for (int i = 0; i < maxSize; i++) {
            System.out.print("Bucket " + i + ":");
            if (bucketMap.containsKey(i)) {
                // Remove a seta inicial para manter a estética.
                System.out.println(bucketMap.get(i).substring(4));
            } else {
                System.out.println(" vazio");
            }
        }

        // Visualização das entradas e links entre elas em ordem de inserção
        System.out.println("\nLista de Entradas:");
        K prevKey = null;
        for (Map.Entry<K, V> entry : entrySet()) {
            K currentKey = entry.getKey();
            V value = entry.getValue();
            if (prevKey == null) {
                System.out.print("[HEAD] -> ");
            } else {
                System.out.print("[" + prevKey + "] -> ");
            }
            System.out.print("[" + currentKey + " | " + value + "]");
            prevKey = currentKey;
        }
        System.out.println(" -> [TAIL]");
        System.out.println();
    }
}