package guiao11;

import java.io.*;
import java.util.*;

public class Pares {

    public static void main(String []args)throws IOException
    {
        File f= new File("C:/POO/guiaoPOO/POO/src/guiao11/major.txt");
        Scanner input= new Scanner(f);
        
        Map<String,Map<String,Integer>> pairsMap = new HashMap<>();
        List<String> wordsList = new ArrayList<>();
        
        String palavras="";
        while(input.hasNext()){
            palavras=palavras+ " "+input.next();
        }

        String[] aux = palavras.toLowerCase().replaceAll("[\\t\\n\\.\\,\\:\\'\\‘\\’\\;\\?\\!\\-\\*\\{\\}\\=\\+\\&\\/\\\\(\\)\\[\\]\\”\\“\\\"\\']", " ").split("\\s+");
        for(String palavra : aux){
            if(palavra.length()>2){
                wordsList.add(palavra);
                pairsMap.put(palavra, new HashMap<String,Integer>());
            }
        }
        
        for(int i = 0; i<wordsList.size() - 1; i++){
            String word1 = wordsList.get(i);
            String word2 = wordsList.get(i+1);
            pairsMap.get(word1).put(word2, pairsMap.get(word1).getOrDefault(word2, 0) + 1);
        }

        System.out.println(pairsMap.toString());

        input.close();

    }
 
}
