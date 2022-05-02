import java.util.ArrayList;

public class TVSeries extends Media {
    protected final static String[] CONTENT_RATING = { "TV-Y", "TV-Y7", "TV-Y7-FV", "TV-G", "TV-PG", "TV-14", "TV-MA" };
    protected String premiereDate;
    protected String endDate;
    protected ArrayList<String> creator;
    protected ArrayList<String> mainCast;
    protected byte numOfSeasons;

    public TVSeries(String ID, String title, ArrayList<String> genre, String description, String contentRating,
            String runtime,
            ArrayList<String> language, String premiereDate, String endDate, ArrayList<String> creator,
            ArrayList<String> mainCast, byte numOfSeasons) {
        super(ID, title, genre, description, contentRating, runtime, language);
        this.premiereDate = premiereDate;
        this.endDate = endDate;
        this.creator = creator;
        this.mainCast = mainCast;
        this.numOfSeasons = numOfSeasons;
    }

    public void setPremiereDate(String premiereDate) {
        this.premiereDate = premiereDate;
    }

    public String getPremiereDate() {
        return this.premiereDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getEndDate() {
        return this.endDate;
    }

    public void setCreator(ArrayList<String> creator) {
        this.creator = creator;
    }

    public ArrayList<String> getCreator() {
        return this.creator;
    }

    public void setMainCast(ArrayList<String> mainCast) {
        this.mainCast = mainCast;
    }

    public ArrayList<String> getMainCast() {
        return this.mainCast;
    }

    public void setNumOfSeasons(byte numOfSeasons) {
        this.numOfSeasons = numOfSeasons;
    }

    public byte getNumOfSeasons() {
        return this.numOfSeasons;
    }

}
