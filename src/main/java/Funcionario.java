public class Funcionario {
    private String nome;
    private String sobrenome;
    private Float salario;

    public Funcionario(String nome, String sobrenome, Float salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    public Float getSalario() {
        return this.salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

    public Float getSalarioAnual() {
        return this.salario * 12;
    }

    public void concederAumento(float valor) {
        this.salario = ((valor / 100)+ 1) * this.salario;
    }
    
}