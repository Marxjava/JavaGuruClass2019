package lv.javaguru.leson8.shape;

public class PlayWithShapes {

    public static void main(String[] args) {

        Squere squere = new  Squere(10);

        Circle circle = new Circle(5);

        Triangle triangle = new Triangle(4,5,7);

        Shape[] myShapes = {squere,circle,triangle};

        for (Shape shape : myShapes){
            System.out.println();
        }
    }
}
