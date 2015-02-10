/* Pixel.java */
public class Pixel {
    private short red;
    private short green;
    private short blue;
    
    public Pixel(short red, short green, short blue) {
        this.red = red;
        this.blue = blue;
        this.green = green;
    }
    
    public short getRed() {
        return red;
    }
    
    public short getBlue() {
        return blue;
    }
    
    public short getGreen() {
        return green;
    }
    
    public void setRed(short red) {
        this.red = red;
    }
    
    public void setGreen(short green) {
        this.green = green;
    }
    
    public void setBlue(short blue) {
        this.blue = blue;
    }
    
    public boolean equals(Pixel other) {
        return (red == other.getRed() && green == other.getGreen() && blue == other.getBlue());
    }
    
}