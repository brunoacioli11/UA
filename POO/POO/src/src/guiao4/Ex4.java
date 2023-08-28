package guiao4;
import java.util.*;

public class Ex4 {
    static int mes;
    static int ano;
    static int diaSemanaInicial;
    public static void main(String[] args){
        readCalendarInfo();
        printCalendar();

    }

    public static void readCalendarInfo() {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Mes: ");
            mes = sc.nextInt();
            sc.nextLine();
            if(!Data.mesValido(mes)){
                System.out.println("ERRO: mês inválido! Deve estar no intervalo [1-Janeiro, 12-Dezembro].");
            }
        } while(!Data.mesValido(mes));

        do {
            System.out.print("Ano: ");
            ano = sc.nextInt();
            sc.nextLine(); 
            if(!Data.anoValido(ano))
                System.out.println("ERRO: ano inválido! Deve ser maior ou igual a 1.");
        } while(!Data.anoValido(ano));

        do {
            System.out.print("Dia da semana em que o mês começa: ");
            diaSemanaInicial = sc.nextInt();
            sc.nextLine();
            if(!Data.diaSemanaValido(diaSemanaInicial))
                System.out.println("ERRO: dia da semana inválido! Deve estar no intervalo [1-Segunda, 7-Domingo]");
        } while(!Data.diaSemanaValido(diaSemanaInicial));

        sc.close();
            

    }

    public static void printCalendar(){
        String titulo = String.format("   %9s %4d", Data.MES_EXTENSO[mes], ano);
        String semana = "Su Mo Tu We Th Fr Sa";
        
        System.out.println(titulo);
        System.out.println(semana);

        int s = 1;
        while(s < diaSemanaInicial){
            System.out.print("   ");
            s++;
        }

        for (int i = 1; i <= Data.diasDoMes(mes, ano); i++){
            System.out.printf("%2d ", i);
            if(s%7 == 0){
                System.out.println();
            }
            s++;
        }
    }
}
