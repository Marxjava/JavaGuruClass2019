package lv.javaguru.tests4;

public class UserLoginServiceTest {

    public static void main(String[] args) {
        User userA = new User();
        userA.setLogin("aaa");
        userA.setPassword("111");

        UserLoginService loginTest  = new UserLoginService();

        loginTest.login ("aaa",userA);

        User userB = new User();
        userB.setLogin("bbb");
        userB.setPassword("222");

        loginTest.login ("aaa",userB);

        loginTest.login ("aaa",userA);

        //login ("aaa",userB);
        //login ("aaa",userA);

        //verify("");
    }
}
