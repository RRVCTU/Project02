/*
1. Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimiter.
Create 2 classes Circle & Square that implements functionality defined in the Shape Interface.
Test your code.



package Project2;

class Interface {
    public static void main(String[] args) {
        //Interface myObj = new Interface();
        Shape [] arr = {new Circle(), new Square()};
        for ( Shape forms :  arr ) {
            forms.calculateArea();
            forms.calculatePerimiter();
        }
    }
}

interface Shape {
    void calculateArea();
    void calculatePerimiter();
}

class Circle implements Shape {
    public int side1;
    @Override
    public void calculateArea() {
        System.out.println("calculateAreaCircle");

    }

    @Override
    public void calculatePerimiter() {
        System.out.println("calculatePerimiterCircle");

    }
}

class Square implements Shape {
    public int side1;
    @Override
    public void calculateArea(int side1) {
        System.out.println("calculateAreaSquare");
        System.out.println(side1*2);
    }

    @Override
    public void calculatePerimiter() {
        System.out.println("calculatePerimiterSquare");

    }

}
*/

