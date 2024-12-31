/*TAREFA 05 - alterar a listagem de clientes para
implementar a característica etária do cliente.*/


public class ListaDeClientesComIdade {
    public static String faixaEtaria(int anoAtual, int anoNascimento) {
        int idade = anoAtual - anoNascimento;
        if (idade <= 17) {
            return "ADOLESCENTE";
        } else if (idade >= 18 && idade <= 29 ) {
            return "JOVEM";
        } else if (idade >= 30 && idade <= 59) {
            return "ADULTO";
        } else {
            return "IDOSO";
        }
    }

    public static void main(String[] args) {
        int anoAtual = 2023;

        String nome1 = "Fulano";
        int data1 = 1980;

        String nome2 = "Sicrano";
        int data2 = 2000;

        System.out.println(">>> Listagem dos Clientes");
        System.out.println(">>> Ano atual: " + anoAtual);
        System.out.println("-------------------------------");
        System.out.println("Nome: " + nome1);
        System.out.println("Data de Nascimento: " + data1);
        System.out.println("Idade: " + (anoAtual - data1));
        System.out.println("Característica Etária: " + faixaEtaria(anoAtual, data1));
        System.out.println("-------------------------------");
        System.out.println("Nome: " + nome2);
        System.out.println("Data de Nascimento: " + data2);
        System.out.println("Idade: " + (anoAtual - data2));
        System.out.println("Característica Etária: " + faixaEtaria(anoAtual, data2));
    }

}
