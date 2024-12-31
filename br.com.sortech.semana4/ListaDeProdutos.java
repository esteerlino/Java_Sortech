package br.com.sortech.semana4;/*TAREFA 03 - Criar uma listagem de produtos utilizando
variáveis primitivas para representar o preço dos produtos. */


public class ListaDeProdutos {
    public static void main(String[] args) {
        String produto1 = "Livro";
        double valor1 = 49.95;

        String produto2 = "Celular";
        double valor2 = 1470.76;

        System.out.println(">>> Listagem dos Produtos");
        System.out.println("------------------------");
        System.out.println("Nome: " + produto1);
        System.out.println("Preço: R$ " + valor1);
        System.out.println("------------------------");
        System.out.println("Nome: " + produto2);
        System.out.println("Preço: R$ " + valor2);
    }
}
