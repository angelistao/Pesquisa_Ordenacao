package Aula_07_08.Java;



import java.util.ArrayList;
import java.util.Random;


public class Util {
    /*
     * Método estático que gera números aleatórios em uma lista de inteiros
     * @param v - lista de inteiros para serem populados
     * @param n - quantidade de números
    */
    public static void popularNumeros(ArrayList<Integer> v, int n) {
        Random gerador = new Random();
        for (int i = 0; i < n; i++) {
            v.add(gerador.nextInt(100));
        }
    }

    /**
     * Método que gera uma palavra aleatória
     * @param tamanho
     * @return palavra aleatória
     */
    public static String gerarPalavra(int tamanho){
        StringBuilder letras = new StringBuilder("abcdefghijklmnopqrstuvwxyz ");
        Random gerador = new Random();
        StringBuilder palavra = new StringBuilder();

        for(int i = 0; i < tamanho; i++){
            palavra.append(letras.charAt(gerador.nextInt(letras.length())));
        }

        return palavra.toString();
    }

    /**
     * Método que gera palavras a partir da quantidade de palavras e o tamanho das mesmas
     * @param lista
     * @param qtd
     * @param tamanhoPalavra
    */
    public static void gerarPalavrasLista(ArrayList<String> lista, int qtd, int tamanhoPalavra){
        for(int i = 0; i < qtd; i++){
            lista.add(Util.gerarPalavra(tamanhoPalavra));
        }
    }


    /**
     * Método que exibe as palavras da lista gerada no método gerarPalavrasLista
     * @param lista
     * @param frase
     */
    public static void exibir(ArrayList<String> lista, String frase) {
        System.out.println(frase);
        for (Object item : lista) {
            System.out.println(item);
        }
        
    }
}