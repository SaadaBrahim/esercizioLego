import java.util.Arrays;
public class Main {
    public static void main(String args[]) {

        Prodotto costruzione1 = new Prodotto("001", "macchina");
        Lego mattoncinoBlu = new Lego(1, 20, new Rgb(255, 255, 255), new Dimensioni(1,1,1));

        Rgb coloreMattoncinoBlu = mattoncinoBlu.getColore();

        String codiceHex = coloreMattoncinoBlu.getCodiceRGB(coloreMattoncinoBlu.getRed(), coloreMattoncinoBlu.getGreen(), coloreMattoncinoBlu.getBlue());

        System.out.println("codice colore: " + codiceHex);


        System.out.println(" numero mattonicni progetto " + costruzione1.getNLegoTotali());
        Prodotto.stampaListaMattoncini(costruzione1.getListaMattoncini());
        System.out.println("peso totale progetto " + costruzione1.calcolaPesoTotale());

        costruzione1.aggiungiMattoncino(mattoncinoBlu);


        System.out.println(" numero mattonicni progetto " + costruzione1.getNLegoTotali());
        Prodotto.stampaListaMattoncini(costruzione1.getListaMattoncini());

        Lego mattoncinoVerde = new Lego(2, 40, new Rgb(254, 254,254), new Dimensioni(2, 2, 2));
        costruzione1.aggiungiMattoncino(mattoncinoVerde);
        System.out.println(" numero mattonicni progetto " + costruzione1.getNLegoTotali());
        Prodotto.stampaListaMattoncini(costruzione1.getListaMattoncini());
        System.out.println("peso totale progetto " + costruzione1.calcolaPesoTotale());
    }
}
