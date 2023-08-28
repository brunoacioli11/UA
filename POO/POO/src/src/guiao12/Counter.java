package guiao12;

import java.util.*;
import java.io.*;

public class Counter {
    public static void main(String[] args) throws IOException{
        File f  = new File("C:/POO/guiaoPOO/POO/src/guiao12/palavras.txt");
        Scanner sc = new Scanner(f);

        Map<String,Integer> nPalavrasUnicas = new HashMap<>();
        int nPalavras = 0;
        
        while(sc.hasNext()) {
            nPalavras++;
            nPalavrasUnicas.putIfAbsent(sc.next(), 1);
        }
        System.out.println("Num palavras: " + nPalavras);
        System.out.println("Num palavras unicas: " + nPalavrasUnicas.size());
        sc.close();
    }
    
}
