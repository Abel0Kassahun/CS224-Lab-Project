import java.util.ArrayList;

public class Episode {
    private final String episodeID;
    private String episodeName;
    private String episodeRuntime;
    private ArrayList<String> episodeWriter;
    private String episodeDirector;

    public Episode(String episodeID, String episodeName, String episodeRuntime, ArrayList<String> episodeWriter,
            String episodeDirector) {
        this.episodeID = episodeID;
        this.episodeName = episodeName;
        this.episodeRuntime = episodeRuntime;
        this.episodeWriter = episodeWriter;
        this.episodeDirector = episodeDirector;
    }

    public String getEpisodeID() {
        return this.episodeID;
    }

    public void setEpisodeName(String episodeName) {
        this.episodeName = episodeName;
    }

    public String getEpisodeName() {
        return this.episodeName;
    }

    public void setEpisodeRuntime(String episodeRuntime) {
        this.episodeRuntime = episodeRuntime;
    }

    public String getEpisodeRuntime() {
        return this.episodeRuntime;
    }

    public void setEpisodeWriter(ArrayList<String> episodeWriter) {
        this.episodeWriter = episodeWriter;
    }

    public ArrayList<String> getEpisodeWriter() {
        return this.episodeWriter;
    }

    public void setEpisodeDirector(String episodeDirector) {
        this.episodeDirector = episodeDirector;
    }

    public String getEpisodeDirector() {
        return this.episodeDirector;
    }
}
