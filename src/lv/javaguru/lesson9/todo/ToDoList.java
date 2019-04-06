package lv.javaguru.lesson9.todo;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {

    private List<String> toDos = new ArrayList<>();

    public void add(String todo) {
        toDos.add(todo);
    }

    public void print() {
        System.out.println(toDos);
    }

    public void completeTask(String task) {
        toDos.remove(task);
    }
}
