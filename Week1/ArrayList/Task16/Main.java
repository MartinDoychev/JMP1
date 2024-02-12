import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> firstList = new ArrayList<>();
        firstList.add("Червен");
        firstList.add("Бял");
        firstList.add("Син");

        ArrayList<String> secondList = new ArrayList<>(firstList);

        System.out.println("Копие на първия списък:");
        System.out.println(secondList);
    }
}
