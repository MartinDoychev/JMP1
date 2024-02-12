import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Елемент 1");
        myList.add("Елемент 2");
        myList.add("Елемент 3");

        System.out.println("Елементи на списъка, използвайки позицията:");

        for (int i = 0; i < myList.size(); i++) {
            System.out.println("Елемент на позиция " + i + ": " + myList.get(i));
        }
    }
}
