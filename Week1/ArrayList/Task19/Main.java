import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> originalList = new ArrayList<>();
        originalList.add("Елемент 1");
        originalList.add("Елемент 2");
        originalList.add("Елемент 3");

        System.out.println("Оригинален капацитет: " + originalList.size());

        ArrayList<String> reducedList = new ArrayList<>(originalList);

        System.out.println("Нов капацитет: " + reducedList.size());
    }
}
