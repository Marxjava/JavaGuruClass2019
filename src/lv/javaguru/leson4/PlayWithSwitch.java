package lv.javaguru.leson4;

public class PlayWithSwitch {
    public static void main(String[] args) {
        System.out.println(translateHttpCode(200));
        System.out.println(translateHttpCode(400));
        System.out.println(translateHttpCode(500));
        System.out.println(translateHttpCode(800));

    }

    private static String translateHttpCode(int code) {
        String message = null;

        switch (code) {
            case 200: message = "ok"; break;
            case 400: message = "Bad request"; break;
            case 500:
                System.out.println("Serrver error - 500");
                case 501: message = "Server error"; break;
            default: message = "Unknow error";
        }
        return message;
    }
}
