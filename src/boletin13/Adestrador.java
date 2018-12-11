package boletin13;

public class Adestrador extends Seleccion {

    private String idFederacion;

    public Adestrador() {
    }

    public Adestrador(String idFederacion) {
        super();
        this.idFederacion = idFederacion;
    }

    public Adestrador(String idFederacion, int id, int edade, String nome, String apelido) {
        super(id, edade, nome, apelido);
        this.idFederacion = idFederacion;
    }

    @Override
    public void viaxar() {
        System.out.println("Viaxan os xogadores...");
    }

    public void dirixirPartido() {
    }

    public void dirixirAdestramento() {
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    @Override
    public String toString() {
        return "Adestrador: " + "idFederacion= " + idFederacion + " " + super.toString() + '}';
    }
 }
