public class Main {
    public static void main(String[] args) {

        Sphere sphere = new Sphere(5);
        Cube cube = new Cube(3);

        displayInformation(sphere);
        displayInformation(cube);
    }

    public static void displayInformation(Shape shape){
        System.out.println("The shape is: " + shape.nameOfObject());
        System.out.println("The area of the shape is: " + shape.area());
        System.out.println("The volume of the shape is: " + shape.volume());
    }
}