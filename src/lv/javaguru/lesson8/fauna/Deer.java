package lv.javaguru.lesson8.fauna;

class Deer implements Animal {
    @Override
    public void eat() {
        System.out.println("Dear is eating");
    }

    @Override
    public void poop() {
        System.out.println("Dear is pooping");
    }

    @Override
    public void sleep() {
        System.out.println("Dear is sleeping");
    }
}
