package lv.javaguru.leson8.fauna;

abstract class Fish implements Animal {

    abstract void swim();

    abstract String getFishName();

    @Override
    public void eat() {
        System.out.println(getFishName() + "is eating");
    }

}
