public class Pessoa {
    String id;
    String nome;
    int idade;
    double peso;
    double altura;

    public Pessoa(){ }

    public Pessoa(String id, String nome, int idade){
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa(String id, String nome, int idade, double peso, double altura){
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC(){
        double IMC = this.peso/(this.altura * 2);

        if (IMC < 20) return -1;

        if (20 <= IMC && IMC <= 25) return 0;

        else return 1;
    };

    public boolean boehMaiorIdade() {
        return this.idade >= 18;
    };

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", nome=" + nome +
                ", idade=" + idade +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
};