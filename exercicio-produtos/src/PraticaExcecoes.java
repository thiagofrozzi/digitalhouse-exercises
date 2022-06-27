public class PraticaExcecoes {
    public static void main(String[] args) {
        int a = 0;
        int b = 300;

        try {
            int result = b/a;
        } catch (ArithmeticException error) {
            System.out.println("Ocorreu um erro");
            throw new IllegalArgumentException("Não pode ser dividio por zero");
        } finally {
            System.out.println("Programa finalizado");
        }
    }

};
