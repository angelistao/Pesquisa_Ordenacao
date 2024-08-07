using System;
using System.Collections.Generic;

class Program {
    public static void Main(string[] args) {
        List<string> listaPalavras = new List<string>();

        Util.gerarPalavrasLista(listaPalavras, 8, 6);
        Util.exibir(listaPalavras, "Lista de palavras:");

        Console.WriteLine(Util.gerarPalavra(10));

    }
}
