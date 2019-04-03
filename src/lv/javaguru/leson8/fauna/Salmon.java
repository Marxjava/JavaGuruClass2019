package lv.javaguru.leson8.fauna;

public class Salmon extends Fish {

    @Override
    void swim() {
        System.out.println(getFishName() + " is swimming");
    }

    @Override
    String getFishName() {
        return "Wild salmon";
    }

    @Override
    public void poop() {
        System.out.println(getFishName() + " is pooping");
    }

    @Override
    public void sleep() {
        System.out.println(getFishName() + " is sleeping");
    }
}
