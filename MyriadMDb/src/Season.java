import java.util.ArrayList;

public class Season {
    private final String seasonID;
    private byte seasonNum;
    private ArrayList<String> seasonCast;
    private byte numOfEpisodes;

    public Season(String seasonID, byte seasonNum, ArrayList<String> seasonCast, byte numOfEpisodes) {
        this.seasonID = seasonID;
        this.seasonNum = seasonNum;
        this.seasonCast = seasonCast;
        this.numOfEpisodes = numOfEpisodes;
    }

    // since seasonID is final variable, it doesn't have a set method
    public String getSeasonID() {
        return this.seasonID;
    }

    public void setSeasonNum(byte seasonNum) {
        this.seasonNum = seasonNum;
    }

    public byte getSeasonNum() {
        return this.seasonNum;
    }

    public void setSeasonCast(ArrayList<String> seasonCast) {
        this.seasonCast = seasonCast;
    }

    public ArrayList<String> getSeasonCast() {
        return this.seasonCast;
    }

    public void setNumOfEpisodes(byte numOfEpisodes) {
        this.numOfEpisodes = numOfEpisodes;
    }

    public byte getNumOfEpisodes() {
        return this.numOfEpisodes;
    }
}
