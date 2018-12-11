package boletin13;

import javax.swing.JOptionPane;

public class Boletin13 {

    public static void main(String[] args) {
        Xogador xog1 = new Xogador(15, "30", 120, 30, "Pepe", "Garcia");
        Adestrador adest = new Adestrador("A50", 40, 25, "Manolo", "Pérez");
        Masaxista masax = new Masaxista("Fisioterapeuta", 10, 39, 45, "María", "Rodríguez");
        Seleccion xog2 = new Seleccion();

        System.out.println(xog1.toString());
        System.out.println(adest.toString());
        JOptionPane.showMessageDialog(null, masax.toString());

        xog1.viaxar();
        adest.viaxar();
        masax.viaxar();
        xog2.viaxar();
    }
}
