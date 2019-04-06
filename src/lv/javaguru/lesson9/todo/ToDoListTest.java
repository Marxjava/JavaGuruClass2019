package lv.javaguru.lesson9.todo;

public class ToDoListTest {

    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        toDoList.add("Buy milk");
        toDoList.add("Do my Java homework");
        toDoList.add("Watch TV on why we need HashMap");

        toDoList.print();

        toDoList.completeTask("Buy milk");

        toDoList.print();
    }

}
