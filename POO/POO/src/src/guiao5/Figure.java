package guiao5;

public class Figure {
    
    public class Circle {
        private int radius;

        public Circle(int radius){
            assert validRadius(radius);
            this.radius = radius;
        }
        
        public int radius() {
            return radius;
        }

        public boolean validRadius(int radius){
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

    public class Rectangle {
        private int height;
        private int length;

        public Rectangle(int height, int length) {
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
            if(height != other.height() || length != other.length()) {
                return false;
            }
            return true;
        }

    }

}
