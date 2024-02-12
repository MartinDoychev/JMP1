import java.util.ArrayList;
import java.util.List;

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

        List<String> subList = myList.subList(0, 3);

        System.out.println("Извлечена част от списъка:");
        System.out.println(subList);
    }
}
