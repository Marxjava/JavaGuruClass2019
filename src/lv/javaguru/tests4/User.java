package lv.javaguru.tests4;

public class User {
    private String login;
    private String password;
    private int logiinAttemptsLeft = 3;
    private boolean blocked = false;


    //public User (String login) {
    //    this.login = login;
    //}
    public void resetLoginAttempys () {
        this.logiinAttemptsLeft = 3;
        this.blocked = false;
    }
    public void block (){
        this.blocked = true;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getLogiinAttemptsLeft() {
        return logiinAttemptsLeft;
    }

    public void setLogiinAttemptsLeft(int logiinAttemptsLeft) {
        this.logiinAttemptsLeft = logiinAttemptsLeft;
    }

    public boolean isBlocked() {
        return blocked;
    }
}
