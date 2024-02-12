import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();

        if (myList.isEmpty()) {
            System.out.println("Списъкът е празен.");
        } else {
            System.out.println("Списъкът не е празен.");
        }

        myList.add("Елемент");

        if (myList.isEmpty()) {
            System.out.println("Списъкът е празен.");
        } else {
            System.out.println("Списъкът не е празен.");
        }
    }
}

