package Tarefa1;

import java.util.ArrayList;

public class Ordenacao {
        /**
     * Ordena uma lista de inteiros usando o algoritmo Bubble Sort (Ordenação por Bolha).
     * 
     * @param lista A lista de inteiros a ser ordenada.
     */
    public static void bolha(ArrayList<Integer> lista) {
        int aux;
        boolean houveTroca;
        int i;
        do {
            houveTroca = false; // Inicializa a flag de troca
            for (i = 0; i < lista.size() - 1; i++) {
                // Compara o elemento atual com o próximo
                if (lista.get(i) > lista.get(i + 1)) {
                    houveTroca = true; // Marca que houve uma troca
                    // Troca os elementos se necessário
                    aux = lista.get(i);
                    lista.set(i, lista.get(i + 1));
                    lista.set(i + 1, aux);
                }
            }
        } while (houveTroca); // Continua até que não haja mais trocas
    }

    /**
     * Ordena uma lista de strings usando o algoritmo Bubble Sort (Ordenação por Bolha).
     * 
     * @param lista A lista de strings a ser ordenada.
     */
    public static void bolhaPalavra(ArrayList<String> lista) {
        String aux;
        boolean houveTroca;
        int i;
        do {
            houveTroca = false; // Inicializa a flag de troca
            for (i = 0; i < lista.size() - 1; i++) {
                // Compara a string atual com a próxima
                if (lista.get(i).compareTo(lista.get(i + 1)) > 0) {
                    houveTroca = true; // Marca que houve uma troca
                    // Troca as strings se necessário
                    aux = lista.get(i);
                    lista.set(i, lista.get(i + 1));
                    lista.set(i + 1, aux);
                }
            }
        } while (houveTroca); // Continua até que não haja mais trocas
    }

    /**
     * Ordena uma lista de inteiros usando o algoritmo Selection Sort (Ordenação por Seleção).
     * 
     * @param lista A lista de inteiros a ser ordenada.
     */
    public static void selecao(ArrayList<Integer> lista) {
        int i, j, menorIndex, aux;
        for (i = 0; i < lista.size() - 1; i++) {
            menorIndex = i; // Assume que o menor elemento é o atual
            for (j = i + 1; j < lista.size(); j++) {
                // Encontra o índice do menor elemento
                if (lista.get(j) < lista.get(menorIndex)) {
                    menorIndex = j;
                }
            }
            // Troca o menor elemento encontrado com o elemento da posição i
            aux = lista.get(i);
            lista.set(i, lista.get(menorIndex));
            lista.set(menorIndex, aux);
        }
    }

    /**
     * Ordena uma lista de strings usando o algoritmo Selection Sort (Ordenação por Seleção).
     * 
     * @param lista A lista de strings a ser ordenada.
     */
    public static void selecaoPalavra(ArrayList<String> lista) {
        int i, j, menorIndex;
        String aux;
        for (i = 0; i < lista.size() - 1; i++) {
            menorIndex = i; // Assume que a menor string é a atual
            for (j = i + 1; j < lista.size(); j++) {
                // Encontra o índice da menor string
                if (lista.get(j).compareTo(lista.get(menorIndex)) < 0) {
                    menorIndex = j;
                }
            }
            // Troca a menor string encontrada com a string da posição i
            aux = lista.get(i);
            lista.set(i, lista.get(menorIndex));
            lista.set(menorIndex, aux);
        }
    }

    /**
     * Ordena uma lista de inteiros usando o algoritmo Insertion Sort (Ordenação por Inserção).
     * 
     * @param lista A lista de inteiros a ser ordenada.
     */
    public static void insercao(ArrayList<Integer> lista) {
        int i, j, chave;
        for (i = 1; i < lista.size(); i++) {
            chave = lista.get(i); // Elemento a ser inserido na parte ordenada
            j = i - 1;
            // Move elementos maiores que a chave para uma posição à frente
            while (j >= 0 && lista.get(j) > chave) {
                lista.set(j + 1, lista.get(j));
                j--;
            }
            // Insere a chave na posição correta
            lista.set(j + 1, chave);
        }
    }

    /**
     * Ordena uma lista de strings usando o algoritmo Insertion Sort (Ordenação por Inserção).
     * 
     * @param lista A lista de strings a ser ordenada.
     */
    public static void insercaoPalavra(ArrayList<String> lista) {
        int i, j;
        String chave;
        for (i = 1; i < lista.size(); i++) {
            chave = lista.get(i); // Elemento a ser inserido na parte ordenada
            j = i - 1;
            // Move strings maiores que a chave para uma posição à frente
            while (j >= 0 && lista.get(j).compareTo(chave) > 0) {
                lista.set(j + 1, lista.get(j));
                j--;
            }
            // Insere a chave na posição correta
            lista.set(j + 1, chave);
        }
    }
}
