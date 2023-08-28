package POO2122;

public class Sport extends Activity {
    public enum Modality {
        HIKING, KAYAK
    }
    private Modality mod;
    private final static int PRICE = 20;


    public Sport(Modality mod, int participants){
        super(participants);
        assert participants <= 10;
        this.mod = mod;

    }

    public Modality getModality(){
        return this.mod;
    }

    public int getPrice() {
        return PRICE;
    }
    
    @Override 
    public String toString() {
        return String.format("%-20s ", this.getModality()) + super.toString();
    }
    
}
