package lv.javaguru.lesson8.fauna;

abstract class Fish implements Animal {

    abstract void swim();

    abstract String getFishName();

    @Override
    public void eat() {
        System.out.println(getFishName() + " is eating");
    }

    public void makeBubbles(){
        System.out.println(getFishName() + " is making bubbles");
    }
}
