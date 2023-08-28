package guiao5;

public class Triangle {
    private int side1;
    private int side2;
    private int side3;


    public Triangle(int side1, int side2, int side3) {
        validSides(side1, side2, side3);

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public int side1(){
        return side1;
    }

    public int side2(){
        return side2;
    }

    public int side3(){
        return side3;
    }

    public boolean validSides(int side1, int side2, int side3) {
        return (side1 <= side2 + side3) || (side2 <= side1 + side3) || (side3 <= side1 + side2);
    }

    public void set(int side1, int side2, int side3) {
        validSides(side1, side2, side3);

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public int getPerimeter() {
        return side1 + side2 + side3;
    }

    public double getArea() {
        double p = Double.valueOf(getPerimeter())/2;
        return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
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
        Triangle other = (Triangle) obj;
        if(side1 != other.side1() || side2 != other.side2() || side3 != other.side3()) {
            return false;
        }
        return true;
    }
    
}
