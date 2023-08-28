package guiao4;
import java.util.*;

public class Data {
    public static final String[] MES_EXTENSO = {"", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
    public static void main(String[] args){
        int mes = 0;
        int ano = 0;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Mes: ");
            mes = sc.nextInt();
            if(!mesValido(mes)) {
                System.out.println("Erro: mes invalido!");
            }
        } while(!mesValido(mes));
        do {
            System.out.print("Ano: ");
            ano = sc.nextInt();
            if(!anoValido(ano)) {
                System.out.println("Erro: ano invalido");
            }
        } while(!anoValido(ano));
        sc.close();
        System.out.println(MES_EXTENSO[mes] + " teve " + diasDoMes(mes, ano) + " em " + ano );
        printAno(2022);
    }

    public static boolean mesValido(int mes) {
        return mes >= 1 && mes <= 12;
    }

    public static boolean anoValido(int ano) {
        return ano > 0;
    }

    public static boolean diaSemanaValido(int diaSemana){
        return diaSemana >= 1 && diaSemana <= 7;
    }

    public static boolean bissexto(int ano) {
        if(ano%4 == 0) {
            if(ano%100 == 0) {
                if(ano%400 == 0){
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static int diasDoMes(int mes, int ano) {
        switch(mes){
            case 2:
                if(bissexto(ano)){
                    return 29;
                }
                    return 28;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
        } 
        return 30;
    }

    

    public static void printAno(int ano) {
        System.out.println(">> " + ano);
        for (int mes = 1; mes <= 12; mes++) {
            System.out.printf("%-9s - %d dias%n", MES_EXTENSO[mes], diasDoMes(mes, ano));
        }
    }
}
