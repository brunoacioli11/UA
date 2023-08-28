package guiao7;

public class Rectangle extends Forma{
    private int height;
    private int length;

    public Rectangle(String color, int height, int length) {
        super(color);

        assert validSides(height, length);
        
        this.height = height;
        this.length = length;
    }

    public int height() {
        return height;
    }

    public int length() {
        return length;
    }

    public boolean validSides(int height, int length) {
        return height > 0 && length > 0;
    }

    public void set(int height, int length) {
        assert validSides(height, length);
        
        this.height = height;
        this.length = length;
    }

    public int getPerimeter() {
        return 2*height + 2*length;
    }

    public int getArea() {
        return height * length;
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
        Rectangle other = (Rectangle) obj;
        if(height != other.height() || length != other.length() || !this.getColor().equals(other.getColor())) {
            return false;
        }
        return true;
    }
}
