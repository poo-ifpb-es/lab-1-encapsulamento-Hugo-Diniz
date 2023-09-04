public class Estudante {
    private int matricula;
    private String nome;

    public Estudante(String nome, int matricula) { // Como se fosse o def __init__ do python, o que ela precisa para ser inicializada
        this.nome = nome; // o *this* é um modificador que permite acessar os atributos da propria classe
        this.matricula = matricula;

    }

    public String getNome() { // permite acessar um valor de um atributo lá de fora
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    public int getMatricula() {
        return this.matricula;
    }
}