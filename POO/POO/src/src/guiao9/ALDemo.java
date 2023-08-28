package guiao9;

import java.util.*;

import guiao5.Data;
import guiao6.Pessoa;

public class ALDemo {
    public static void main(String[] args) {
        ArrayList<Integer> c1 = new ArrayList<>();
        for (int i = 10; i <= 100; i+=10)
            c1.add(i);
        System.out.println("Size: " + c1.size());
        for (int i = 0; i < c1.size(); i++)
            System.out.println("Elemento: " + c1.get(i));
        
        ArrayList<String> c2 = new ArrayList<>();
        c2.add("Vento");
        c2.add("Calor");
        c2.add("Frio");
        c2.add("Chuva");
        System.out.println(c2);
        Collections.sort(c2);
        System.out.println(c2);
        c2.remove("Frio");
        c2.remove(0);
        System.out.println(c2);

        Set<Pessoa> c3 = new HashSet<>();
        c3.add(new Pessoa("Maria Beatriz", 129765432,
                    new Data(19, 4, 1999)));
        c3.add(new Pessoa("Marco Antonio", 129532418,
                    new Data(8, 2, 2001)));
        c3.add(new Pessoa("Osmar Oliveira", 129345789,
                    new Data(18, 6, 2001)));
        c3.add(new Pessoa("Gabriel Negri", 129322455,
                    new Data(14, 11, 2000)));
        // tentar add um elemento repetido
        c3.add(new Pessoa("Maria Beatriz", 129765432,
                    new Data(19, 4, 1999)));
        
        Iterator<Pessoa> iter3 = c3.iterator();
        while(iter3.hasNext()) {
            Pessoa p = iter3.next();
            System.out.println(p + "; hashcode: " + p.hashCode());
        }

        Set<Data> c4 = new TreeSet<>();
        c4.add(new Data(14, 11, 2000));
        c4.add(new Data(19, 4, 1999));
        c4.add(new Data(20, 4, 1999));
        c4.add(new Data(8, 2, 2001));
        c4.add(new Data(18, 6, 2002));
        c4.add(new Data(15, 5, 1980));
        c4.add(new Data(19, 8, 1980));

        Iterator<Data> iter4 = c4.iterator();
        while(iter4.hasNext()) {
            Data d = iter4.next();
            System.out.println(d + "; hashcode: " + d.hashCode());
        }
    }
}
