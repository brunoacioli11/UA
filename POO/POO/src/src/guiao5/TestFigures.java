package guiao5;

public class TestFigures {
    public static void main(String[] args) {

        Circle c = new Circle(4);
        Triangle t = new Triangle(6, 6, 6);
        Rectangle r = new Rectangle(5, 4);
        Circle c2 = new Circle(4);
        Triangle t2 = new Triangle(6, 6, 6);
        Rectangle r2 = new Rectangle(5, 4);

        System.out.println(c.equals(r));
        System.out.println(c.equals(t));
        System.out.println(r.equals(c));
        System.out.println(t.equals(t2));
        System.out.println(t.equals(c2));
        
    }
}
