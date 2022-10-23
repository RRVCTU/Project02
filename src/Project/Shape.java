package Project;

interface Shape {
    void calculateArea();
    void calculatePerimiter();
}

class Circle implements Shape {
    double radius = 3;
    @Override
    public void calculateArea() {
        System.out.println("Area of the circle: " + radius * radius * 3.14);
    }
    @Override
    public void calculatePerimiter() {
        System.out.println("Perimeter of the circle: " + 3.14 * 2 * radius);
    }
}

class Square implements Shape {
    int side = 3;
    @Override
    public void calculateArea() {
        System.out.println("Area of the square : " + side * side);
    }
    @Override
    public void calculatePerimiter() {
        System.out.println("Perimeter of the square : " + 4 * side);
    }
}

class ShapeTest {

    public static void main(String[] args) {

        Shape[] myArray = {new Circle(), new Square()};

        for (Shape shape : myArray) {
            shape.calculateArea();
            shape.calculatePerimiter();
            System.out.println("------");

        }
    }
}
