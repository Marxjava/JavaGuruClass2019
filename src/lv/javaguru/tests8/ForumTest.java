package lv.javaguru.tests8;

public class ForumTest {

    public static void main(String[] args) {

        User user = new User();
        Moderator moderator = new Moderator();
        Administrator administrator = new Administrator();
        System.out.println("\nUser:");
        user.readPost();
        user.writePost();
        System.out.println("\nModerator:");
        moderator.readPost();
        moderator.writePost();
        moderator.blockPost();
//Administrator behavior (+ contains Moderator behavior + contains User behavior)
        System.out.println("\nAdministrator:");
        administrator.readPost();
        administrator.writePost();
        administrator.blockPost();
        administrator.blockUser();
    }
}