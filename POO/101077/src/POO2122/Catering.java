package POO2122;

public class Catering extends Activity{
    public enum Option {
        FULL_MENU, DRINKS_AND_SNACKS
    }
    
    private Option op;
    private final static int PRICE = 30;

    public Catering(Option op, int participants){
        super(participants);
        this.op = op;
    }

    public Option getOption() {
        return this.op;
    }

    public int getPrice() {
        return PRICE;
    }
    
    @Override 
    public String toString() {
        return String.format("%-20s ", this.getOption()) + super.toString();
    }
}
