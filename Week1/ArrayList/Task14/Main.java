import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();

        myList.add("Червен");
        myList.add("Син");
        myList.add("Зелен");
        myList.add("Оранжев");
        myList.add("Жълт");

        System.out.println("Оригинален списък:");
        System.out.println(myList);

        int index1 = 1;
        int index2 = 3;

        if (index1 >= 0 && index1 < myList.size() && index2 >= 0 && index2 < myList.size()) {
            Collections.swap(myList, index1, index2);
            
            System.out.println("Списък след размяна на елементите на позиции " + index1 + " и " + index2 + ":");
            System.out.println(myList);
        } else {
            System.out.println("Невалидни индекси за размяна");
        }
    }
}