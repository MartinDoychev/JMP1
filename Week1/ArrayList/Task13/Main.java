import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Червен");
        list1.add("Зелен");
        list1.add("Син");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Жълт");
        list2.add("Оранжев");
        list2.add("Син");

        boolean areEqual = Objects.equals(list1, list2);

        if (areEqual) {
            System.out.println("Двете списъка са равни.");
        } else {
            System.out.println("Двете списъка не са равни.");
        }
    }
}
