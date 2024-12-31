package br.com.sortech.semana4;/*TAREFA 06 - implementar um cabeçalho dinâmico
utilizando laços. O sistema deve apresentar as linhas
conforme o valor da variável.*/


public class CabecalhoDinamico {
    public static void asteriscos(int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            System.out.print("*");
        }
    }

    public static void main(String[] args) {
        int tam = 20;
        asteriscos(tam);
        System.out.print("\nBem-vindo ao Comex!\n");
        asteriscos(tam);
    }
}

