/*TAREFA 04 - alterar a listagem de clientes para
utilizar as variáveis do tipo String para representar
os nomes dos clientes.*/


public class ListaDeClientesString {
    public static void main(String[] args) {
        String nome1 = "Fulano";
        int data1 = 1980;

        String nome2 = "Sicrano";
        int data2 = 2000;

        System.out.println(">>> Listagem dos Clientes");
        System.out.println("------------------------");
        System.out.println("Nome: " + nome1);
        System.out.println("Data de Nascimento: " + data1);
        System.out.println("------------------------");
        System.out.println("Nome: " + nome2);
        System.out.println("Data de Nascimento: " + data2);
    }
}
