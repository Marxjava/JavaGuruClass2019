package lv.javaguru.leson8.fauna;

class Deer implements Animal {

    @Override
    public void eat() {
        System.out.println("Dear is eating");
    }

    @Override
    public void poop() {
        System.out.println("Dear is p0oping");

    }

    @Override
    public void sleep() {
        System.out.println("Dear is sleeping");

    }
}
