import java.util.ArrayList;

public abstract class Media { // Media (for a lack of a better word) is a hypernym for movies and tv series
    protected final String ID;
    protected String title;
    // Bitmap class can be used to store image (movie and tv series poster in our
    // case)
    protected ArrayList<String> genre;
    protected String description;
    protected String contentRating;
    protected String runtime;
    protected ArrayList<String> language;

    public Media(String ID, String title, ArrayList<String> genre, String description, String contentRating,
            String runtime,
            ArrayList<String> language) {
        this.ID = ID;
        this.title = title;
        this.genre = genre;
        this.description = description;
        this.contentRating = contentRating;
        this.runtime = runtime;
        this.language = language;
    }

    // Since ID is a constant value, it won't have a set method
    public String getID() {
        return this.ID;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setGenre(ArrayList<String> genre) {
        this.genre = genre;
    }

    public ArrayList<String> getGenre() {
        return this.genre;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public String getRuntime() {
        return this.runtime;
    }

    public void setLanguage(ArrayList<String> language) {
        this.language = language;
    }

    public ArrayList<String> getLanguage() {
        return this.language;
    }

}
