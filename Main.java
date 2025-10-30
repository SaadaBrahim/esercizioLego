public class Main {
    public static void main(String args[]) {

        Lego mattoncinoBlu = new Lego();
        mattoncinoBlu.setColore(new Rgb());
        mattoncinoBlu.setDimensione(new Dimensioni());
        mattoncinoBlu.setPeso(70);
        mattoncinoBlu.setCodiceUnivoco(1);

        Lego mattoncinoVerde = new Lego(1, 20, new Rgb(), new Dimensioni());

        System.out.println(mattoncinoVerde.getColore());
        System.out.println(mattoncinoBlu.getColore());

        System.out.println(mattoncinoVerde.getPeso());
        System.out.println(mattoncinoBlu.getPeso());

    }
}