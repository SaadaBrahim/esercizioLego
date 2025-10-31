import java.util.Arrays;

public class Prodotto {
  private String codiceNumerico;
  private String denominazione;
  private int nLegoTotali;
  private Lego[] listaMattoncini;

  //metodo cost
      public Prodotto(String codiceNumerico, String denominazione) {
        this.codiceNumerico = codiceNumerico;
        this.denominazione = denominazione;
        this.listaMattoncini = new Lego[10]; // 10 
        this.nLegoTotali = 0;
    }

  public void aggiungiMattoncino(Lego nuovoLego) {
        if (nLegoTotali == listaMattoncini.length) {
            raddoppiaSpazio(); // se pieno rad spazio
        }
        listaMattoncini[nLegoTotali] = nuovoLego;
        nLegoTotali++;
  }

    public static void stampaListaMattoncini(Lego[] lista) {
        if (lista == null || lista.length == 0) {
            System.out.println("lista e vuota");
            return;
        }

        boolean tuttiNull = true;

        for (Lego m : lista) {
            if (m != null) {
                tuttiNull = false;
                System.out.println("Codice: " + m.getCodiceUnivoco()
                        + ", Peso: " + m.getPeso()
                        + ", Colore: " + m.getColore()
                        + ", Dimensioni: " + m.getDimensione());
            }
        }
        if (tuttiNull) {
            System.out.println("lista e vuota");
        }
    }

    public float calcolaPesoTotale() {
        float pesoTotale = 0;



        if (listaMattoncini.length == 0 || listaMattoncini == null) {
            System.out.println("lista dei mattoncini vuota");
            return pesoTotale;
        }

        // ciclo x litsa
        for (int i = 0; i < listaMattoncini.length; i++) {
            Lego mattoncino = listaMattoncini[i];

            // controllo se in quella posiziopne ce un mattonicno
            if (mattoncino != null) {
                // calcolo peso
                float pesoSingolo = mattoncino.getPeso();
                pesoTotale += pesoSingolo;

                // stampo mattoncino singolo e se e non ce
                System.out.println("Mattoncino " + i + " peso: " + pesoSingolo);
            } else {
                System.out.println("Mattoncino " + i + " ignorato.");
            }
        }

        return pesoTotale;
    }


private void raddoppiaSpazio() {
    listaMattoncini = Arrays.copyOf(listaMattoncini, listaMattoncini.length * 2);
    System.out.println("spazio raddoppiato a " + listaMattoncini.length + " elementi.");
}
  
  public String getCodiceNumerico() {
        return codiceNumerico;
    }

    public void setCodiceNumerico(String codiceNumerico) {
        this.codiceNumerico = codiceNumerico;
    }


    public String getDenominazione() {
        return denominazione;
    }

    public void setDenominazione(String denominazione) {
        this.denominazione = denominazione;
    }


    public int getNLegoTotali() {
        return nLegoTotali;
    }

    public void setNLegoTotali(int nLegoTotali) {
        this.nLegoTotali = nLegoTotali;
    }

    public Lego[] getListaMattoncini() {
        return listaMattoncini;
    }

    public void setListaMattoncini(Lego[] listaMattoncini) {
        this.listaMattoncini = listaMattoncini;
    }
  
}
