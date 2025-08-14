public class Sphere implements Shape {

    private double radius;

    public Sphere(double radius){
       this.radius = radius;
    }

    @Override
    public String nameOfObject() {
        return "Sphere";
    }

    @Override
    public double area() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double volume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
}
