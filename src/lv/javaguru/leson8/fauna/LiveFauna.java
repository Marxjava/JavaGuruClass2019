package lv.javaguru.leson8.fauna;

public class LiveFauna {

    public static void main(String[] args) {

        Deer rudolf = new Deer();
        Viper doge = new Viper();
        Salmon goldy = new Salmon();

        living(rudolf);
        living(doge);
        doge.dropSkin();
        living(goldy);
        goldy.swim();
        goldy.makeBubbles();
    }

    private static void living(Animal animal) {
        animal.eat();
        animal.poop();
        animal.sleep();

        if (animal instanceof Fish) {
            ((Fish)animal).swim();
        }
    }

}
