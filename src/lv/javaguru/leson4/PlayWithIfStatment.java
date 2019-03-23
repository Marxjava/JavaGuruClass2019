package lv.javaguru.leson4;

public class PlayWithIfStatment {
    public static void main(String[] args) {
        int x = 10;

        if ((x > 5) && (x < 15)) {
            System.out.print("Within bounds!");
        }

        x=6;

        if ((x<5) || (x >= 10)){
            System.out.println("X");
        }
        x = 4;

        if (x != 20){
            System.out.println("x is not 20");
        }
    }
}
