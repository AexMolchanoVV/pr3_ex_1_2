package abc;

public class TestShape {
    public static void main(String[] args) {
        Circle c1 = new Circle(5, "красный", false );
        Rectangle r1 = new Rectangle(4,2);
        Square s1 = new Square(3);
        System.out.println("Circle area: " + c1.getArea());
        System.out.println("Circle perimetr: " + c1.getPerimeter());
        System.out.println("Rectangle area: " + r1.getArea());
        System.out.println("Recrtangle perimetr: " + r1.getPerimeter());
        s1.setSide(6);
        s1.setLength(2);
        s1.setWidth(3);
        System.out.println("Square area: "+ s1.getArea());
        System.out.println("Square perimetr: "+ s1.getPerimeter());
    }
}
