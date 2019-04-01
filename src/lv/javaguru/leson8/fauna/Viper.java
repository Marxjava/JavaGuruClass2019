package lv.javaguru.leson8.fauna;

 class Viper implements  Animal{

     @Override
     public void eat() {
         System.out.println("Viper is eating");
     }

     @Override
     public void poop() {
         System.out.println("Viper is p0oping");

     }

     @Override
     public void sleep() {
         System.out.println("Viper is sleeping");

     }

     public void dropSkin(){
         System.out.println("Viper is dropping skean");
     }
}
