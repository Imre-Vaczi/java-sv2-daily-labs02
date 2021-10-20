package day02;

public class Geometry {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2.0, 8.0);
        System.out.println("Side 'a' of the rectangle: " + rectangle.getaSide());
        System.out.println("Side 'b' of the rectangle: " + rectangle.getbSide());
        System.out.println("Area of the rectangle: " + rectangle.calculateArea(rectangle.getaSide(), rectangle.getbSide()));

    }
}
