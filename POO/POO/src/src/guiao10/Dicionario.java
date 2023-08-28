package guiao10;

import java.util.*;

public class Dicionario {
    private static HashMap<String, String> dicionario = new HashMap<>();
    
    private static HashMap<String, ArrayList<String>> dicionario2 = new HashMap<>();

    public static void main(String[] args) {
        // Dicionario 1
        // Preencher
        dicionario.put("Algoritmo", "Sequência finita de instruções não ambíguas utilizadas para resolver um problema ou fazer um cálculo");
        dicionario.put("Sonho", "Conjunto de ideias e de imagens que se apresentam ao espírito durante o sono");
        dicionario.put("Vida", "O período de tempo que decorre desde o nascimento até à morte dos seres");
        dicionario.put("Albergar", "Dar albergue a");
        dicionario.put("Falésia", "Costa com rochas escarpadas batidas pelo mar");

        // Listar
        System.out.println("Dicionário:" + dicionario);
        System.out.println();

        System.out.println("Termos:" + dicionario.keySet());
        System.out.println();

        System.out.println("Significados:" + dicionario.values());
        System.out.println();

        // Dicionario 2
        // Preencher
        ArrayList<String> algoritmo = new ArrayList<>();
        algoritmo.add(dicionario.get("Algoritmo"));
        algoritmo.add("Processo de cálculo");

        ArrayList<String> sonho = new ArrayList<>();
        sonho.add(dicionario.get("Sonho"));
        sonho.add("Bolinho muito fofo, de farinha e ovos, frito e depois geralmente passado por calda de açúcar ou polvilhado com açúcar e canela");
        
        ArrayList<String> vida = new ArrayList<>();
        vida.add(dicionario.get("Vida"));
        vida.add("Fundamento, essência; causa, origem");

        ArrayList<String> albergar = new ArrayList<>();
        albergar.add(dicionario.get("Albergar"));
        albergar.add("Ter ou trazer no seu interior");

        dicionario2.put("Algoritmo", algoritmo);
        dicionario2.put("Sonho", sonho);
        dicionario2.put("Vida", vida);
        dicionario2.put("Albergar", albergar);
        dicionario2.put("Amor", new ArrayList<>());

        dicionario2.get("Amor").add("Sentimento que induz a aproximar, a proteger ou a conservar a pessoa pela qual se sente afeição ou atracção");
        dicionario2.get("Amor").add("Disposição dos afectos para querer ou fazer o bem a algo ou alguém");
        dicionario2.get("Amor").add("Qualidade do que é suave ou delicado");
        dicionario2.get("Amor").add("Ligação intensa de carácter filosófico, religioso ou transcendente");
        dicionario2.get("Amor").add("Grande dedicação ou cuidado");

        // Listar
        System.out.println("Dicionário 2:" + dicionario2);
        System.out.println();

        Collections.sort(dicionario2.get("Amor"));
        System.out.println("Dicionário 2 Sorted:" + dicionario2);
        System.out.println();

        System.out.println("Termos:" + dicionario2.keySet());
        System.out.println();

        System.out.println("Significados:" + dicionario2.values());
        System.out.println();

        System.out.println("Um significado de Amor: " + significadoAleatorio(dicionario2, "Amor"));
        System.out.println();
    }

    public static String significadoAleatorio(HashMap<String, ArrayList<String>> dicio, String termo) {
        ArrayList<String> significados = dicio.get(termo);
        int randomIndex = (int) (Math.random()*significados.size());
        return significados.get(randomIndex);
    }
}
