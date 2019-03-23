package lv.javaguru.leson3;

public class Dog {

    private String name;
    private String color;
    private int age;

    public int getAge(){
        return this.age = age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public void voice(){
        System.out.println("vau vau");
    }

    public void eat(){
        System.out.println("nom nom");
    }
    public void sleep(){
        System.out.println("zzzzzzz...");
    }


}
