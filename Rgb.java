public class Rgb {
  private int red;
  private int green;
  private int blue;
  private String codiceRGB;

public Rgb(){}

    public Rgb(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.codiceRGB = getCodiceRGB(red, green, blue);
    }


    public String toString() {
        return String.format("#%02X%02X%02X", red, green, blue);
    }

public String getCodiceRGB(int red, int green, int blue) {
    String hex = String.format("#%02X%02X%02X", red, green, blue); // 0 riempi con 0 se n e piu corto, 2 larghezza minima X converti in base 16
    return hex;
}
  
public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    // Getter e Setter per green
    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    // Getter e Setter per blue
    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }
}
