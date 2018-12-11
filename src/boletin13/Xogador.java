package boletin13;

public class Xogador extends Seleccion {

    private int dorsal;
    private String demarcacion;

    public Xogador() {
    }

    public Xogador(int dorsal, String demarcacion) {
        super();
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public Xogador(int dorsal, String demarcacion, int id, int edade, String nome, String apelido) {
        super(id, edade, nome, apelido);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    @Override
    public void viaxar() {
        System.out.println("Viaxan os xogadores...");
    }

    public void xogarPartido() {
    }

    public void entrenar() {
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    @Override
    public String toString() {
        return "Xogador: " + "dorsal= " + dorsal + ", demarcacion= " + demarcacion + " " + super.toString() + '}';
    }
}
