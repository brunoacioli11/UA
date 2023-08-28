package guiao4;
import java.util.*;

import javax.xml.stream.StreamFilter;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a frase:");
        String str = sc.nextLine();
        sc.close();
        String[] aux = str.split("\\s+");

        System.out.println("To Lower Case: " + str.toLowerCase());
        System.out.println("Last Character " + str.charAt(str.length() - 1));
        System.out.println("First Three Characters " + str.substring(0, 3));
        System.out.println("Words: " + aux.toString());
        System.out.println("Amount of Words " + str.split("\\s+").length);
        System.out.println("Matches 'Bruno' ?" + str.matches("Bruno"));
    }
}
