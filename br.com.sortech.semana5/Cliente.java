/*TAREFA 05 - Crie a classe Cliente com seus
respectivos atributos:
Nome (Texto)
CPF (Texto)
E-mail (Texto)
Profissão (Texto)
Telefone (Texto)
Endereço (Endereco) */


public class Cliente {
    private String nome;
    private String cpf;
    private String email;
    private String profissao;
    private String telefone;
    private Endereco endereco;

    public Cliente(String nome, String cpf, String email, String profissao, String telefone, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.profissao = profissao;
        this.telefone = telefone;
        this.endereco = endereco;
    }

/*TAREFA 08 - Crie opções de criação da classe Cliente conforme abaixo:
Fornecendo um nome e cpf
Fornecendo um nome, cpf e e-mail*/

    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public Cliente(String nome, String cpf, String email){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void exibeInformacoes() {
        System.out.println("Nome do cliente: " + nome);
        System.out.println("CPF do cliente: " + cpf);
        System.out.println("Email: " + email);
        System.out.println("Profissão: " + profissao);
        System.out.println("Telefone: " + telefone);
        System.out.println("Endereço: " + endereco.exibeEndereco());
    }
}
