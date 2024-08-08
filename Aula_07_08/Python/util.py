import random

class util:
    
    @staticmethod
    def popularNumeros(lista, n):
        """
        método estático que popula uma lista com números aleatórios

        Args:
            lista (list): lista a ser populada
            n (int): quantidade de números a serem gerados
        """
        for i in range(n):
            lista.add(random.randint(0, 100))
        
    

    @staticmethod
    def gerarPalavra(tamanho):
        """método estático que gera uma palavra através de um tamanho informado

        Args:
            tamanho (int): tamanho da palavra

        Returns:
            string: retorna a palavra formada
        """
        letras = "abcdefghijklmnopqrstuvwxyz "
        numeros = random.randint(letras.Length)
        palavra = ""

        for i in range(tamanho):
            palavra.Append(letras[numeros])
        

        return palavra
    

    @staticmethod
    def gerarPalavrasLista(lista, qtd, tamanhoPalavra):
        """
        método estático que gera palavras e adiciona em uma lista

        Args:
            lista (list):  lista a ser populada
            qtd (int): quantidade de palavras a serem geradas
            tamanhoPalavra (int): tamanho da palavra a ser gerada
        """

        for i in range(qtd):
            lista.add(util.gerarPalavra(tamanhoPalavra))
        
    

    @staticmethod
    def exibir(lista, frase):
        """
        método estático que exibe uma lista de itens

        Args:
            lista (list): lista a ser exibida
            frase (string): frase a ser exibida antes da lista
        """
        print(frase)
        for item in lista:
            print(item)
        
        
    
