public class Pessoa {
    private String nome;
    private Long idade;
    private String cpf;
    private String regiao;
    public Pessoa() {

    }

    public Pessoa(String nome, Long idade, String cpf, String regiao) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.regiao = regiao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getIdade() {
        return idade;
    }

    public void setIdade(Long idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }
}
