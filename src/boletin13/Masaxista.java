package boletin13;

public class Masaxista extends Seleccion {

    private String titulacion;
    private int anosExperiencia;

    public Masaxista() {
    }

    public Masaxista(String titulacion, int anosExperiencia) {
        super();
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }

    public Masaxista(String titulacion, int anosExperiencia, int id, int edade, String nome, String apelido) {
        super(id, edade, nome, apelido);
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }

    @Override
    public void viaxar() {
        System.out.println("Viaxan os xogadores...");
    }

    public void darMasaxes() {
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    @Override
    public String toString() {
        return "Masaxista: " + "titulacion= " + titulacion + ", anosExperiencia= " + anosExperiencia + " " + super.toString() + '}';
    }
}
