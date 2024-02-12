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

        Collections.reverse(myList);

        System.out.println("Списък след обръщане:");
        System.out.println(myList);
    }
}
