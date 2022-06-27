public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa("001", "Julia", 12);
        Pessoa p3 = new Pessoa("002", "Thiago", 23, 63.2,1.83);

        boolean maiorDeIdade = p3.boehMaiorIdade();
        int IMC = p3.calcularIMC();

        System.out.println(p3);
        if (IMC == -1) System.out.println("Abaixo do peso");
        if (IMC == 0) System.out.println("Peso Saudavel");
        if (IMC == 1) System.out.println("Sobrepeso");
    }
}
