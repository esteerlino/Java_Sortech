/*TAREFA 01 - Cria a classe Produto com seus
respectivos atributos:
Nome (Texto)
Descrição (Texto)
Preço Unitário (ponto flutuante)
Quantidade (numero).*/


public class Produto {
    private String nome;
    private String descricao;
    private double precoUnitario;
    private int quantidade;

    public Produto(String nome, String descricao, double precoUnitario, int quantidade) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do produto não pode ser nulo ou vazio.");
        }
        this.nome = nome;
        this.descricao = descricao;
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void exibeDados() {
        System.out.println(">> Dados do produto");
        System.out.println("Nome do produto: " + nome);
        System.out.println("Descrição do produto: " + descricao);
        System.out.println("Preço Unitário: " + precoUnitario);
        System.out.println("Quantidade: " + quantidade);
    }
}
