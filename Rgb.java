public class Rgb {
  private int red;
  private int green;
  private int blue;

public Rgb(){}

public Rgb(int red, int green, int blue){
  this.red = red;
  this.green = green;
  this.blue = blue;

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
