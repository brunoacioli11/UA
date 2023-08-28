package guiao10;

import java.util.*;
import java.util.regex.*;
import java.io.*;

public class FileHandler {
    private static Set<String> longWords = new HashSet<>();
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new File("words.txt"));
        while (input.hasNext()) {
            String word = input.next();
            //System.out.println(word);
            // save words with 2 or more characters
            if(word.length()>=2)
                longWords.add(word);
            // list words finishing with 's'
            if(word.charAt(word.length()-1) == 's')
                System.out.println(">> " + word);
        }
        System.out.println();

        // print structure before wipe 
        System.out.println("Long Words: ");
        System.out.println(longWords);

        Pattern p = Pattern.compile("([\\W]+)");

        Set<String> toRemove = new HashSet<>();
        for(String lw: longWords) {
            Matcher m = p.matcher(lw);

            if(m.find()) { // non-word characters
                toRemove.add(lw);
            }
        }
        for(String tr: toRemove) {
            longWords.remove(tr);
        }

        System.out.println();
        // print structure after wipe
        System.out.println("Long Words: ");
        System.out.println(longWords);

        String s = "abc@";
        System.out.println(s.matches("\\w]"));
    }
}
