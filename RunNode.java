/* RunNode.java */

public class RunNode {
 
    private Pixel pixel;
    private int len;
    private RunNode next;
    private RunNode prev;
    
    RunNode(Pixel pixel, int len) {
        this.pixel = pixel;
        this.len = len;
        next = null;
        prev = null;
    }
    
    public Pixel getPixel() {
        return pixel;
    }
    
    public void setPixel(Pixel pixel) {
        this.pixel = pixel;
    }
    
    public int getLen() {
        return len;
    }
    
    public void setLen(int len) {
        this.len = len;
    }
    
    public RunNode getNext() {
        return next;
    }
    public void setNext(RunNode next) {
        this.next = next;
    }
    public RunNode getPrev() {
        return prev;
    }
    public void setPrev(RunNode prev) {
        this.prev = prev;
    }
    
    
    
}