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
