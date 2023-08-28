package guiao10;

import java.util.*;

public class StringDetective {
    private static Scanner sc = new Scanner(System.in);
    private static String clue;
    private static HashMap<Character, ArrayList<Integer>> aparicoes = new HashMap<>();

    public static void main(String[] args) {
        System.out.print("Insira uma Frase: ");
        clue = sc.nextLine();

        clue = clue.toUpperCase();
        for(int i=0; i<clue.length(); i++) {
            char c = clue.charAt(i);
            if(!aparicoes.containsKey(c)) {
                aparicoes.put(c, new ArrayList<>());
            }
            aparicoes.get(c).add(i);
        }

        System.out.println(aparicoes);
    }
}
