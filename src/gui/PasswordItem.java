package gui;

public class PasswordItem {

    private String login;
    private String password;
    private String source;

    public PasswordItem(String login, String password, String source) {
        this.login = login;
        this.password = password;
        this.source = source;
    }

    public PasswordItem(String line) throws Exception {
        String[] split = line.split(";");
        this.login = split[0];
        this.password = split[1];
        this.source = split[2];
    }

    public String getSaveFormat() {
        return login + ";" +password + ";" + source;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getSource() {
        return source;
    }
}
