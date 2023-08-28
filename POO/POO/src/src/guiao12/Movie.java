package guiao12;


public class Movie implements Comparable<Movie>{
    private String name;
    private float score;
    private String rating;
    private String genre;
    private int runningTime;


    public Movie(String name, float score, String rating, String genre, int runningTime){
        this.name = name;
        this.score = score;
        this.rating = rating;
        this.genre = genre;
        this.runningTime = runningTime;
    }

    public String getName() {
        return this.name;
    }

    public float getScore() {
        return this.score;
    }

    public String getRating() {
        return this.rating;
    }

    public String getGenre(){
        return this.genre;
    }
    
    public int getRunningTime(){
        return this.runningTime;
    }

    @Override
    public String toString(){
        String res = String.format("%-40s %3.1f %-7s %-10s %-15d", name, score, rating, genre, runningTime);
        return res;
    }

    @Override
    public int compareTo(Movie M) {
        return this.getName().toLowerCase().compareTo(M.getName().toLowerCase());
    }

}
