public class Dimensioni{
  private float larghezza;
  private float lunghezza;
  private float altezza;
  
// metodi cost.
  public Dimensioni(){}

  public Dimensioni(int larghezza, int lunghezza, int altezza){
    this.larghezza = larghezza;
    this.lunghezza = lunghezza;
    this.altezza = altezza;
  }
  
// setter&getter
  public float getLarghezza() {
        return largezza;
    }

    public void setLarghezza(float largezza) {
        this.largezza = largezza;
    }

    // Getter e Setter per lunghezza
    public float getLunghezza() {
        return lunghezza;
    }

    public void setLunghezza(float lunghezza) {
        this.lunghezza = lunghezza;
    }

    // Getter e Setter per altezza
    public float getAltezza() {
        return altezza;
    }

    public void setAltezza(float altezza) {
        this.altezza = altezza;
    }
  

}
