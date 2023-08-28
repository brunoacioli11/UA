package guiao6;

public class Conjunto {
    private static final int CAPACITY = 10;

    private int[] numeros = new int[CAPACITY];
    private int size = 0;

    public void insert(int n) {
        if(!contains(n)){
            if(size() == this.numeros.length) {
                int[] aux = this.numeros;
                this.numeros = new int[numeros.length + CAPACITY];
                System.arraycopy(aux, 0, numeros, 0, numeros.length);
            }
            this.numeros[this.size++] = n;
        }
    }

    public boolean contains(int n) {
        for(int i = 0; i < size(); i++) {
            if(n == numeros[i]) return true;
        }
        return false;
    }
    
    public void remove(int n) {
        int i;
        for(i = 0; i < size() - 1; i++){
            if(n == numeros[i]){
                System.arraycopy(numeros, i+1, numeros, i, size() - (i-1));
                this.size--;
            }
        }
        if(n == numeros[i]) {
            this.size--;
        }
    }

    public void empty() {
        this.numeros = new int[CAPACITY];
        this.size = 0;
    }

    @Override
    public String toString() {
        if(size() == 0) return "{}";
        String res = "{ ";
        for(int i = 0; i < size() - 1; i++) {
            res += this.numeros[i] + ", ";
        }
        res += this.numeros[size() - 1] + " }";
        return res;
    }

    public int size(){
        return this.size;
    }

    public Conjunto combine(Conjunto add) {
        Conjunto union = new Conjunto();
        for(int i = 0; i < this.size(); i++){
            union.insert(this.numeros[i]);
        }
        for(int j = 0; j < add.size(); j++) {
            union.insert(add.numeros[j]);
        }
        return union;
    }

    public Conjunto subtract(Conjunto diff) {
        Conjunto sub = new Conjunto();
        for(int i = 0; i < this.size(); i++) {
            if(!diff.contains(this.numeros[i])){
                sub.insert(this.numeros[i]);
            }
        }

        return sub;
    }

    public Conjunto intersect(Conjunto inter) {
        Conjunto intConj = new Conjunto();
        int n = 0;
        for(int i = 0; i < this.size(); i++) {
            n = this.numeros[i];
            if(inter.contains(n)){
                intConj.insert(n);
            }
        }
        return intConj;
    }

    
    
}
