package lv.javaguru.tests4;

public class UserLoginService {

    public void login(String inputPassword, User user ){
        System.out.println(user.getLogin());
        System.out.println(user.getPassword());
        System.out.println(user.getLogiinAttemptsLeft());
        System.out.println(user.isBlocked());
    }
    public void verify (String a){
        //login("aaa", userA);

    }
}
