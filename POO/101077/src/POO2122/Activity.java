package POO2122;

public abstract class Activity {
    private int participants;

    public Activity(int participants) {
        this.participants = participants;
    }

    public int getParticipants() {
        return this.participants;
    }

    public abstract int getPrice();

    public String toString() {
        return String.format("%-5d", getParticipants());
    }
}
