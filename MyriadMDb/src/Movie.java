import java.util.ArrayList;

public class Movie extends Media {
    protected final static String[] CONTENT_RATING = { "G", "PG", "PG-13", "R", "NC-17" };
    protected ArrayList<String> director;
    protected ArrayList<String> writer;
    protected ArrayList<String> cast;
    protected String dateReleased;

    Movie(String id, String title, ArrayList<String> genre, String description, String contentRating, String runtime,
            ArrayList<String> language, ArrayList<String> director, ArrayList<String> writer, ArrayList<String> cast,
            String dateReleased) {
        super(id, title, genre, description, contentRating, runtime, language);
        this.director = director;
        this.writer = writer;
        this.cast = cast;
        this.dateReleased = dateReleased;
    }

    public void setDirector(ArrayList<String> director) {
        this.director = director;
    }

    public ArrayList<String> getDirector() {
        return this.director;
    }

    public void setWriter(ArrayList<String> writer) {
        this.writer = writer;
    }

    public ArrayList<String> getWriter() {
        return this.writer;
    }

    public void setCast(ArrayList<String> cast) {
        this.cast = cast;
    }

    public ArrayList<String> getCast() {
        return this.cast;
    }

    public void setDateReleased(String dateReleased) {
        this.dateReleased = dateReleased;
    }

    public String getDateReleased() {
        return this.dateReleased;
    }
}
