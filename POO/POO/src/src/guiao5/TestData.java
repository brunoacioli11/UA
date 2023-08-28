package guiao5;
import java.util.*;

public class TestData {
    public static void main(String[] args) {
        

        Data data = new Data();
        data.set(1,1, 2022);
        System.out.println("Day:" + data.day());
        System.out.println("Month:" + data.month());
        System.out.println("Year:" + data.year());
        System.out.println(data);
        data.increment();
        
        System.out.println(data);
        data.decrement();
        System.out.println(data);

        /*Data data2 = new Data();
        data2.set
        System.out.println(data2);
        data.increment();
        System.out.println(data2);
        data.decrement();
        System.out.println(data2);*/

        
    }
}
