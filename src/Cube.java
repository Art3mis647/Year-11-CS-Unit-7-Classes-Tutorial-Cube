public class Cube {
    private int side;
    public int getSide(){
        return side;
    }
    public void setSide(int n){
        if (n < 1){
            throw new IllegalArgumentException("A cube’s side length cannot be less than 1!");
        }
        this.side = n;
    }
    public int getSurfaceArea(){
        return side * side * 6;
    }
    public int getVolume(){
        return side * side * side;
    }
    public String toString(){
        return "Cube{side=" + this.side + "}";
    }
    public Cube(){
        side = 1;
    }
    public Cube(int n){
        if (n < 1){
            throw new IllegalArgumentException("A cube’s side length cannot be less than 1!");
        }
        this.side = n;
    }



}
