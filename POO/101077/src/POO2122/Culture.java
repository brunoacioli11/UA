package POO2122;

public class Culture extends Activity {
    public enum Option {
        ARCHITECTURAL_TOUR, RIVER_TOUR, WINE_TASTING, ART_MUSEUM
    }
    
    private Option op;
    private final static int PRICE = 25;

    public Culture(Option op, int participants){
        super(participants);
        assert participants <= 15;
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
