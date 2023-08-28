package guiao4;
import java.util.*;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a frase: ");
        String str = sc.nextLine();
        sc.close();
        System.out.println("Digits: " + countDigits(str));
        System.out.println("Spaces: " + countSpaces(str));
        System.out.println("Has only Lower Case ?: " + onlyLower(str));
        System.out.println("String with one space: " + replaceDoubleSpace(str));
        System.out.println("Is Palindrome: " + isPalindrome(str));

    }

    public static int countDigits(String str) {
        int count = 0;
        for (char c: str.toCharArray()){
            if(c >= '0' && c <= '9') {
                count++;
            }
        }
        return count;
    }

    public static int countSpaces(String str) {
        int count = 0;
        for (char c: str.toCharArray()) {
            if(c == ' ') {
                count++;
            }
        }
        return count;
    }

    public static boolean onlyLower(String str) {
        for(char c: str.toCharArray()) {
            if(Character.isUpperCase(c)) {
                return false;
            }
        }
        return true;
    }
    
    public static String replaceDoubleSpace(String str){
        StringBuilder res = new StringBuilder();
        String[] split = str.split("\\s+");
        for (String aux: split) {
            res.append(aux);
            res.append(" ");            
        }
        res.deleteCharAt(res.length() - 1);
        //res.append("!");
        return res.toString();
    }

    public static boolean isPalindrome(String str) {
        String[] aux = str.split("\\s");
        
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != str.charAt(str.length()-1 - i)){
                return false;
            }
        }
        return true;
    }
}
