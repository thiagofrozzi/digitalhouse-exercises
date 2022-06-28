public class Distribuidora {
    public static void main(String[] args) {
        Produto[] listaDeProdutos = new Produto[5];
        double total = 0;

        listaDeProdutos[0] = new Pereciveis(3,"Chocolate", 2.50);
        listaDeProdutos[1] = new Pereciveis(2,"Carne", 25.90);
        listaDeProdutos[2] = new Pereciveis(1,"Tomate", 4.60);
        listaDeProdutos[3] = new NaoPereciveis("Feijao", 1.50, "comida");
        listaDeProdutos[4] = new NaoPereciveis("Arroz", 5.80, "comida");

        for (Produto p : listaDeProdutos) {
            total += p.calcular(5);
            System.out.printf("%.2f\n", p.calcular(5));
        }

        System.out.printf("O total da compra foi: R$ %.2f", total);
    }
}
