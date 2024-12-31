/*TAREFA 02 - Crie uma nova classe de teste para
comparar dois produtos.*/


public class ComparaProdutos {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Guarda-Roupa", "Lugar para guardar roupas e itens pessoais.", 1500.00, 2);
        Produto produto2 = new Produto("Armário de Cozinha", "Lugar para armazenar alimentos e utensílios de cozinha.", 950.00, 1);

        /*TAREFA 03 - Crie um comportamento para a classe Produto
        com o objetivo de imprimir as informações no console*/
        produto1.exibeDados();
        produto2.exibeDados();

        if (produto1.equals(produto2)) {
            System.out.println("Os produtos são iguais.");
        } else {
            System.out.println("Os produtos são diferentes.");
        }
    }
}
