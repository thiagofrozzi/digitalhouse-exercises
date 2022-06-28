public class NaoPereciveis {
    String tipo;

    public NaoPereciveis(){ }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "NaoPereciveis{" +
                "tipo='" + tipo + '\'' +
                '}';
    }
}
