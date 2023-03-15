public class Area {
    private int length;
    private int breadth;

    /*public Area(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }*/

    public void setLength(int length) {
        this.length = length;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getArea(){
        return length * breadth;

    }
}
