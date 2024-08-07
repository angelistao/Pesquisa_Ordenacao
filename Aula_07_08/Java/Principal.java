package Aula_07_08.Java;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<String> listaPalavras = new ArrayList<>();

        Util.gerarPalavrasLista(listaPalavras, 8, 6);
        Util.exibir(listaPalavras, "Lista de palavras:");

        System.out.println(Util.gerarPalavra(10));

    }
}
