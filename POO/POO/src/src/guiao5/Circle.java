package guiao5;

public class Circle {
    private int radius;

    public Circle(int radius){
        assert validRadius(radius);
        this.radius = radius;
    }
    
    public int radius() {
        return radius;
    }

    private static boolean validRadius(int radius){
        return radius > 0;
    }

    public void set(int radius){
        assert validRadius(radius);
        this.radius = radius;
    }

    public double getPerimeter() {
        return 2*Math.PI*radius;
    }
    
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj == null) {
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }
        Circle other = (Circle) obj;
        if(radius != other.radius()) {
            return false;
        }
        return true;
    }
}
