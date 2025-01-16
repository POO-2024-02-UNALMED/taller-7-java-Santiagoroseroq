package comunicacion;

public class Fabula extends Escrito {
    private String ensenanzas;
    private String interpretacion;
    private String tipo;

    public Fabula(String origen, String titulo, String autor, int paginas, String ensenanzas, String interpretacion, String tipo) {
        super(origen, titulo, autor, paginas);
        this.ensenanzas = ensenanzas;
        this.interpretacion = interpretacion;
        this.tipo = tipo;
    }

    public String getEnsenanzas() {
        return ensenanzas;
    }

    public void setEnsenanzas(String ensenanzas) {
        this.ensenanzas = ensenanzas;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String interpretacion() {
        return this.interpretacion;
    }

    @Override
    public String toString() {
        return super.resumen() + "\n" +
                "Enseñanzas: " + ensenanzas + "\n" +
                "Tipo: " + tipo;
    }

    @Override
    public int palabrasTotales(int palabrasPagina) {
        return super.getPaginas() * palabrasPagina * 1;
    }
}