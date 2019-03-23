package lv.javaguru.tests3;

public class ClassWithObjectsTest {
    public static void main(String[] args) {
        ClassWithObjects objectOne = new ClassWithObjects();

        printToConsole(objectOne);

        fillObjectVariables(objectOne);

        printToConsole(objectOne);
    }

    public static void printToConsole(ClassWithObjects classWithObjects) {
        System.out.println("Byte=" + classWithObjects.byteVariable);
        System.out.println("Short=" + classWithObjects.shortVariable);
        System.out.println("Integer=" + classWithObjects.integerVariable);
        System.out.println("Long=" + classWithObjects.longVariable);
        System.out.println("Float=" + classWithObjects.floatVariable);
        System.out.println("Double=" + classWithObjects.doubleVariable);
        System.out.println("Character=" + classWithObjects.characterVariable);
        System.out.println("Boolean=" + classWithObjects.booleanVariable);
    }
    public static void fillObjectVariables (ClassWithObjects classWithObjects) {
        classWithObjects.byteVariable = 13;
        classWithObjects.shortVariable = 432;
        classWithObjects.integerVariable = 15476;
        classWithObjects.longVariable = 6745654123412L;
        classWithObjects.floatVariable = 341.13F;
        classWithObjects.doubleVariable = 53454.123;
        classWithObjects.characterVariable = 'A';
        classWithObjects.booleanVariable = false;
    }
}
