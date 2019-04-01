package lv.javaguru.leson8.fauna;

public class LiveFauna {

    public static void main(String[] args) {

        Deer rudolf = new Deer();
        Viper doge = new Viper();

        living(rudolf);
        living(doge);
        doge.dropSkin();
    }

    private static void living (Animal animal){
        animal.eat();
        animal.poop();
        animal.sleep();
    }
}
