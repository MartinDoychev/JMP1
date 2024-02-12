import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> firstList = new ArrayList<>();

        firstList.add("Зелен");
        firstList.add("Червен");
        firstList.add("Син");

        System.out.println("Първи списък:");
        System.out.println(firstList);

        ArrayList<String> secondList = new ArrayList<>(firstList);

        System.out.println("Втори списък след копиране:");
        System.out.println(secondList);
    }
}
