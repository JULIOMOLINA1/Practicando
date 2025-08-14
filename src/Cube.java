public class Cube implements Shape{

    private double side;

    public Cube (double side){
       this.side = side;
    }

    @Override
    public String nameOfObject() {
        return "Cube";
    }

    @Override
    public double area() {
        return 6 * side * side;
    }

    @Override
    public double volume() {
        return side * side * side;
    }
}
