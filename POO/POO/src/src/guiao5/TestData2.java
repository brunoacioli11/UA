package guiao5;

public class TestData2 {
    public static void main(String[] args) {
        Data data = new Data(7,2022);

        System.out.println("Weekday: " + data.firstWeekDayOfYear());
        System.out.println("Weekday of the month: " + data.firstWeekDayOfMonth(4));
        System.out.println(data);
    }
    
    

}
