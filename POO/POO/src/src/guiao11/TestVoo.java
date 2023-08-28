package guiao11;

import java.util.*;
import java.io.*;

public class TestVoo{
    public static void main(String[] args) throws IOException {
        List<Voo> voos = new ArrayList<>();

        File f = new File("C:/POO/guiaoPOO/POO/src/guiao11/voos.txt");
        Scanner sc = new Scanner(f);
        sc.nextLine();
        while(sc.hasNextLine()){
            String[] aux = sc.nextLine().split("\t");
            if(aux.length == 3) {
                voos.add(new Voo(aux[0], aux[1], aux[2], ""));
            } else {
                voos.add(new Voo(aux[0], aux[1], aux[2], aux[3]));
            }
        }

        String toPrint = print(voos);
        System.out.println(toPrint);

        
        createFile(toPrint,"C:/POO/guiaoPOO/POO/src/guiao11/infopublico.txt");
        Map<String, String> delayMap = atrasoMedio(voos);
        System.out.println(delayMap);
        
        LinkedHashMap<String,String> delayMapSorted=new LinkedHashMap<>();
        delayMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEachOrdered(x -> delayMapSorted.put(x.getKey(), x.getValue()));

        System.out.println(delayMapSorted);
        
        
        String toPrintCities = printCities(voos);
        createFile(toPrintCities,"C:/POO/guiaoPOO/POO/src/guiao11/cidades.txt");


    }

    public static void createFile(String toWrite, String path) throws IOException{
        PrintWriter out = new PrintWriter(new File(path));
        out.print(toWrite);
        out.close();
    }
    
    public static Map<String,String> atrasoMedio(List<Voo> voos) {
        Map<String,List<Integer>> auxMap = new HashMap<>();
        Map<String,String> delayMap = new HashMap<>();
        for(Voo voo: voos) {
            if(!voo.getAtraso().isEmpty()) {
                auxMap.putIfAbsent(voo.getCompanhia(), new ArrayList<Integer>());
                auxMap.get(voo.getCompanhia()).add(voo.getAtrasoEmSeg());
            }            
        }
        for(String aux: auxMap.keySet()){
            int delay = avg(auxMap.get(aux));
            int delayHour = delay/3600;
            int delayMin = (delay - delayHour*3600)/60;
            String delayString = String.format("%02d:%02d", delayHour, delayMin); 
            delayMap.put(aux, delayString);
        }
        return delayMap;

    }

    public static int avg(List<Integer> delayList){
        int sum = 0;
        for(int aux: delayList){
            sum += aux;
        }
        return sum/delayList.size();
    }

    public static String print(List<Voo> voos) {
        String toPrint = "";
        String header = String.format("%-7s %-8s %-20s %-21s %-7s %-40s\n", "Hora", "Voo", "Companhia", "Origem", "Atraso", "Obs");
        toPrint += header + "\n";
        for(Voo voo: voos) {
            toPrint += voo + "\n";
        }
        return toPrint;
    }

    public static String printCities(List<Voo> voos) {
        Map<String, Integer> arrivalMap = new HashMap<>();
        
        
        String header = String.format("%-20s %-5s", "Origem", "Voos");
        String toPrintCities = header + "\n";
        for(Voo voo: voos) {
            arrivalMap.putIfAbsent(voo.getOrigem(), 0);
            arrivalMap.put(voo.getOrigem(), arrivalMap.get(voo.getOrigem()) + 1);
        }
        Map<String, Integer> arrivalMapSorted = new LinkedHashMap<>();
        arrivalMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEachOrdered(x -> arrivalMapSorted.put(x.getKey(),x.getValue()));

        for(String city: arrivalMapSorted.keySet()){
            toPrintCities += String.format("%-20s %-5d", city, arrivalMapSorted.get(city)) + "\n";
        }
        
        
        return toPrintCities;
    }

}