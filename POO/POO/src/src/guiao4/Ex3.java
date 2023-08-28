package guiao4;
import java.util.*;

public class Ex3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma frase:");
        String str = sc.nextLine();
        String res = "";
        String[] split = str.split("\\s+");
        for (String w: split){
            if(w.length() >= 3){
                res += Character.toUpperCase(Character.toUpperCase(w.charAt(0)));
            }
        }
        System.out.println(res);
    }
}
