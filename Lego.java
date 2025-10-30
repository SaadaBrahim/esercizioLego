public class Lego{

    private int codiceUnivoco;
    private float peso;
    private Rgb colore;
    private Dimensioni dimensione;

    //metodi Costur.
    public Lego(){
    }

    public Lego(int codiceUnivoco, float peso, Rgb colore, Dimensioni dimensione){
        this.codiceUnivoco=codiceUnivoco;
        this.colore=colore;
        this.dimensione=dimensione;
        this.peso=peso;
    }

    // GET
    public Dimensioni getDimensione() {
        return dimensione;
    }

    public float getPeso() {
        return peso;
    }

    public int getCodiceUnivoco() {
        return codiceUnivoco;
    }

    public Rgb getColore() {
        return colore;
    }

    // SET
    public void setCodiceUnivoco(int codiceUnivoco) {
        this.codiceUnivoco = codiceUnivoco;
    }

    public void setColore(Rgb colore) {
        this.colore = colore;
    }

    public void setDimensione(Dimensioni dimensione) {
        this.dimensione = dimensione;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
}