package product;

public class Manager {
    private static String login = "N";
    private static String password = "16";

    public Manager() {
    }

    public static String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public static String getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = String.valueOf(password);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "login='" + login + '\'' +
                ", password=" + password +
                '}';
    }

    public Manager(String login, int password) {
        this.login = login;
        this.password = String.valueOf(password);


    }

}
