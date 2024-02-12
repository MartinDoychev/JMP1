import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Червен");
        list1.add("Зелен");
        list1.add("Син");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Жълт");
        list2.add("Оранжев");
        list2.add("Бял");

        list1.addAll(list2);

        System.out.println("Обединен списък:");
        System.out.println(list1);
    }
}