/**
 * Creates a Storage object.
 */
package duke;

import java.util.ArrayList;

public class TaskList {

    private static ArrayList<Task> list = new ArrayList<>();

    public TaskList() {    }

    public static void printList () {
        if (list.size() == 0) {
            System.out.println("There is nothing on the list! :)");
        } else {
            for (int i = 0; i < list.size(); i++) {
                System.out.print(i + 1 + ".");
                list.get(i).getTask();
            }
        }
    }

    public static void printListLength () {
        System.out.println("Now you have " + list.size() + " task(s) in the list.");
    }

    public static int getListLength () {
        return list.size();
    }

    public static void printOneTask (int i) {
        System.out.println(list.get(i).toString());
    }

    public static String getTask (int i) {
        return list.get(i).toString();
    }

    public static void printLastTask () {
        System.out.println("Now you have " + list.size() + " task(s) in the list.");
    }

    public static void addTodo(String line) {
        list.add(new Todo(line));
        //list.get(list.size() - 1).printTask(); // print newly added tasks
    }
    public static void addDeadline(String line) {
        list.add(new Deadline(line));
        //list.get(list.size() - 1).printTask(); // print newly added tasks
    }

    public static void addEvent(String line) {
        list.add(new Event(line));
        //list.get(list.size() - 1).printTask(); // print newly added tasks
    }

    public static void markDone(int index) {
        list.get(index).markAsDone();
    }

    public static Boolean checkDone(int index) {
        return list.get(index).getStatusBoolean();
    }

    public static void markNotDone(int index) {
        list.get(index).markAsNotDone();
    }

    public static void deleteTask(int index) {
        //System.out.println("Noted. I've removed this task: ");
        //list.get(index).getTask();
        list.remove(index);
    }
}