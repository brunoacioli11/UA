package guiao7;

public abstract class Forma {
    private String color;

    public Forma(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null || this.getClass() != obj.getClass())
            return false;
        Forma other = (Forma) obj;
        if(this.color == other.color)
            return true;
        return false;
    }
    
    @Override
    public String toString() {
        return String.format("color: %s", this.color);
    }

    public abstract int getArea();

    public abstract int getPerimeter();

}
