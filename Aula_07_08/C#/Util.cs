
using System;
using System.Collections.Generic;
using System.Text;

public class Util {
    
 
    /// <summary>
    /// Método que popula uma lista de inteiros com n valores
    /// </summary>
    /// <param name="lista"> Variável na qual reside a lista a preencher </param>
    /// <param name="n"> Quantidade de números a preencher </param>
    public static void popularNumeros(List<int> lista, int n) {
        Random gerador = new Random();
        for (int i = 0; i < n; i++) {
            v.Add(gerador.Next(100));
        }
    }

    
    /// <summary>
    /// Método estático que gera uma palavra baseada com o número de letras desejadas como entrada
    /// </summary>
    /// <param name="tamanho">Tamanho desejado para a palavra</param>
    /// <returns>String com a palavra criada</returns>
    public static String gerarPalavra(int tamanho){
        StringBuilder letras = new StringBuilder("abcdefghijklmnopqrstuvwxyz ");
        Random gerador = new Random();
        StringBuilder palavra = new StringBuilder();

        for(int i = 0; i < tamanho; i++){
            palavra.Append(letras[(gerador.Next(letras.Length))]);
        }

        return palavra.ToString();
    }

    /// <summary>
    /// Método que gera uma lista de palavras com o tamanho de letras desejado
    /// </summary>
    /// <param name="lista"> Lista de palavras a ser preenchida </param>
    /// <param name="qtd"> Quantidade de palavras desejada na lista </param>
    /// <param name="tamanhoPalavra">Tamanho desejado para as palavras da lista</param>
    public static void gerarPalavrasLista(List<string> lista, int qtd, int tamanhoPalavra){
        for(int i = 0; i < qtd; i++){
            lista.Add(Util.gerarPalavra(tamanhoPalavra));
        }
    }


    /// <summary>
    /// Método que exibe uma lista de palavras
    /// </summary>
    /// <param name="lista"> Lista que contém as palavras </param>
    /// <param name="frase"> Frase a ser exibida antes da impressão das palavras </param>
    public static void exibir(List<string> lista, String frase) {
        Console.WriteLine(frase);
        foreach (var item in lista) {
            Console.WriteLine(item);
        }
    }
}