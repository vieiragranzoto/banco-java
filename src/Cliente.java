public class Cliente {
    private String cpf;
    private String nome;
    private int idade;
    private String endereco;

    public Cliente(String cpf, String nome, int idade, String endereco) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
}
