public class Temperature {
    public static void main(String[] args) {
        String[] cidades = { "Londres", "Madrid", "Nueva York", "Buenos Aires", "Assuncion", "Sao Paulo", "Lima","Santiago de Chile", "Lisboa", "Tokio" };

        int[][] temperature = { {-2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42}, {5, 43}, {0, 39}, {-7, 26}, {-1, 31}, {-10, 35} };
        int min = temperature[0][0];
        int max = temperature[0][1];
        String cidadeMin = "";
        String cidadeMax = "";

        for (int linha = 0; linha < cidades.length; linha += 1){
            if (temperature[linha][0] < min){
                min = temperature[linha][0];
                cidadeMin = cidades[linha];
            }
            if (temperature[linha][1] > max){
                max = temperature[linha][1];
                cidadeMax = cidades[linha];
            }
        }

        System.out.printf("%s Min = %d %s Max = %d", cidadeMin, min, cidadeMax, max);
    }


}

