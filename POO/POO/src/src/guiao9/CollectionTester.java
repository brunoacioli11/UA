package guiao9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTester {
    public static void main(String[] args) {
        int[] DIMS = {1000, 5000, 10000, 20000, 40000, 100000};
        String[] FUNCTS = {"add", "search", "remove"};
        Collection<Integer> col = new ArrayList<>();
        double[][] result = new double[DIMS.length][3];
        for(int d=0; d<DIMS.length; d++) {
            result[d] = checkPerformance(col, DIMS[d]);
        }
        // Table
        System.out.printf("%20s", "Collection");
        for(int dim: DIMS)
            System.out.printf("%10d", dim);
        System.out.println();
        for(int i=0; i<FUNCTS.length; i++) {
            System.out.printf("%20s", FUNCTS[i]);
            for(int d=0; d<DIMS.length; d++)
                System.out.printf("%10.3g", result[d][i]);
            System.out.println();
        }
    }   

    private static double[] checkPerformance(Collection<Integer> col, int DIM) {
        double start, stop, delta;
        double[] stats = new double[3];
        // stats: [0] add; [1] search; [2] remove
        
        // Add
        start = System.nanoTime(); // clock snapshot before
        for(int i=0; i<DIM; i++ )
            col.add( i );
        stop = System.nanoTime(); // clock snapshot after
        delta = (stop-start)/1e6; // convert to milliseconds
        stats[0] = delta;
        
        // Search
        start = System.nanoTime(); // clock snapshot before
        for(int i=0; i<DIM; i++ ) {
            int n = (int) (Math.random()*DIM);
            if (!col.contains(n))
                System.out.println("Not found???"+n);
        }
        stop = System.nanoTime(); // clock snapshot after
        delta = (stop-start)/1e6; // convert nanoseconds to milliseconds
        stats[1] = delta;
        
        // Remove
        start = System.nanoTime(); // clock snapshot before
        Iterator<Integer> iterator = col.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        stop = System.nanoTime(); // clock snapshot after
        delta = (stop-start)/1e6; // convert nanoseconds to milliseconds
        stats[2] = delta;

        return stats;
    }


}
