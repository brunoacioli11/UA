package guiao5;
//import java.util.*;

public class Data {
    public static final String[] MES_EXTENSO = {"", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
    public static final String[] SEMANA_EXTENSO = {" ", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    
    private int day;
    private int month;
    private int year;
    private int weekDay;

    public Data() {}

    public Data(int day, int month, int year){
        assert valid(day, month, year): "Invalid Date";

        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public Data(int weekDay, int year) {
        assert validWeekDay(weekDay) && validYear(year);
        this.weekDay = weekDay;
        this.year = year;
    }

    public int firstWeekDayOfYear() {
        return weekDay;
    }

    public int firstWeekDayOfMonth(int month) {
        int countWeekDay = weekDay;
        for(int i = 1; i<month; i++) {
            countWeekDay += monthDays(i, year);
        }
        return countWeekDay % 7;

    }


    public int day(){
        return day;
    }

    public int month(){
        return month;
    }

    public int year(){
        return year;
    }

    public static boolean validMonth(int month) {
        return month >= 1 && month <= 12;
    }

    public static boolean validYear(int year) {
        return year > 0;
    }
    
    public static boolean validWeekDay(int weekDay) {
        return weekDay >= 1 && weekDay <= 7;
    }

    public static boolean leapYear(int year) {
        if(year%4 == 0) {
            if(year%100 == 0) {
                if(year%400 == 0){
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static int monthDays(int month, int year) {
        switch(month){
            case 2:
                if(leapYear(year)){
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

    public static boolean valid(int day, int month, int year){
        if(!validMonth(month) || !validYear(year) || day <= 0 || day > monthDays(month, year)) {
            return false;
        }
        return true;

    }

    public void set(int day , int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
        assert valid(this.day, this.month, this.year);
    }

    public void increment(){
        assert valid(day, month, year);

        int days = monthDays(month, year);
        if (days == day) {
            day = 1;
            if (month == 12) {
                month = 1;
                year++;
            } else {
                month++;
            }
        } else {
            day++;
        }
    }

    public void decrement(){
        assert valid(day, month, year);

        if(day == 1) {
            if(month == 1) {
                month = 12;
                day = 31;
                year--;
            } else {
                month--;
            }
            day = monthDays(month, year);
        } else {
            day--;
        }
    }

    /* QUESTÃO 5.1
    @Override
    public String toString(){
        return String.format("%04d-%02d-%02d", year, month, day);
    }*/

    @Override
    public String toString() {
        String result = "";
        String titulo = "";
        String semana = "";
        int space = 0;
        int s = 1;

        for(int i = 1; i <= 12; i++ ) {
            //System.out.println("firstWeekDayOfMonth " + firstWeekDayOfMonth(i));
            titulo = String.format("   %9s %4d", MES_EXTENSO[i], year);
            semana = "Su Mo Tu We Th Fr Sa";
            result += titulo;
            result += "\n";
            result += semana;
            result += "\n";
            s = 1;
            
            if(i == 1) {
                space = weekDay;
            } else {
                space = firstWeekDayOfMonth(i);
            }

            while(s < space) {
                result += "   ";
                s++;
            }


            for(int j = 1; j <= monthDays(i, year); j++) {
                result += String.format("%2d ", j);
                if(s%7 == 0){
                    result += "\n";
                }
                s++;
            }

            result += "\n";

        }
        

        
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null || this.getClass() != obj.getClass())
            return false;
        Data other = (Data) obj;
        if(this.day == other.day) {
            if(this.month == other.month) {
                if(this.year == other.year)
                    return true;
            }
        }
        return false;
    }
}
