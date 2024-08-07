
using System;
using System.Collections.Generic;
using System.Text;

public class Util {
    /**
     * 
     * @param v
     * @param n
    */
    public static void popularNumeros(List<int> v, int n) {
        Random gerador = new Random();
        for (int i = 0; i < n; i++) {
            v.Add(gerador.Next(100));
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
            palavra.Append(letras[(gerador.Next(letras.Length))]);
        }

        return palavra.ToString();
    }

    /**
     * Método que gera palavras a partir da quantidade de palavras e o tamanho das mesmas
     * @param lista
     * @param qtd
     * @param tamanhoPalavra
    */
    public static void gerarPalavrasLista(List<string> lista, int qtd, int tamanhoPalavra){
        for(int i = 0; i < qtd; i++){
            lista.Add(Util.gerarPalavra(tamanhoPalavra));
        }
    }


    /**
     * Método que exibe as palavras da lista gerada no método gerarPalavrasLista
     * @param lista
     * @param frase
     */
    public static void exibir(List<string> lista, String frase) {
        Console.WriteLine(frase);
        foreach (var item in lista) {
            Console.WriteLine(item);
        }
    }
}