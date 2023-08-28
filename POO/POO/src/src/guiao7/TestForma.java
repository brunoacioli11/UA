package guiao7;

public class TestForma {
    public static void main(String[] args) {

        Rectangle r = new Rectangle("Black",5, 4);
    
        Rectangle r2 = new Rectangle("Red",5, 4);

        Rectangle r3 = new Rectangle("Black", 5, 4);
        
        System.out.println(r.equals(r));
        System.out.println(r.equals(r2));
        System.out.println(r.equals(r3));
        System.out.println(r2.equals(r3));
        
    }
}
