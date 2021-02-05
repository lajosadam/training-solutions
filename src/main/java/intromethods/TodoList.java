package intromethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TodoList {

    private List<Todo> todoList = new ArrayList<>(Arrays.asList(
            new Todo("Porszívózás"),
            new Todo("Takarítás"),
            new Todo("Mosogatás")
    ));

    public void addTodo(String name){
        todoList.add(new Todo(name));
    }

    public void finishTodos(String name){
        for (Todo i : todoList){
            if (i.getName().equals(name)){
                i.finish();
            }
        }
    }

    public void finishAllTodos(List<String> todosToFinish){
        for (String i : todosToFinish){
            for (Todo j : todoList){
                if (i.equals(j.getName())){
                    j.finish();
                }
            }
        }
    }

    public List<String> todosToFinish(){
        List<String> returnValue = new ArrayList<>();
        for (Todo i : todoList){
            if (i.isFinished()==false){
                returnValue.add(i.getName());
            }
        }
        return returnValue;
    }

    public int numberOfFinishedTodos(){
        int count=0;
            for (Todo i : todoList){
                if (i.isFinished()==true){
                    count++;
                }
            }
        return count;
    }

}
