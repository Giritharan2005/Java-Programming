class Shapes {
    void area() {
        System.out.println("area 1");
    }

    void area(int r) {
        System.out.println("Area of the circle: " + (3.14 * r * r));
    }

    void area(int l, int b) {
        System.out.println("Area of rectangle: " + (l * b));
    }
}

public class areaofcircle {
    public static void main(String[] args) {
        Shapes s = new Shapes();
        s.area(2);
    }
}
