public class User {
    private String username;
    private String emailAddress;
    private char[] password;
    private int reputation;

    public User(String username, String emailAddress, char[] password) {
        this.username = username;
        this.emailAddress = emailAddress;
        this.password = password;
        this.reputation = 0;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    //ghjk
    public String getUsername() {
        return this.username;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getEmailAddres() {
        return this.emailAddress;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }

    public char[] getPassword() {
        return this.password;
    }

    public void setReputation(int reputation) {
        this.reputation = reputation;
    }

    public int getReputation() {
        return this.reputation;
    }
}

