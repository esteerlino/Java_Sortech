/*TAREFA 06 - Crie uma classe de teste para
efetuar a criação dos objetos Cliente e Endereço
e criar a associação entre eles.*/


public class Teste {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua Arthur Lavigne", 987, "Primeiro andar", "Conquista", "Ilhéus", "Bahia");
        Cliente cliente = new Cliente("Lola Flores", "12345678900", "lolaflores@gmail.com", "Enfermeira", "(73) 991984053", endereco);

        cliente.exibeInformacoes();
    }
}
