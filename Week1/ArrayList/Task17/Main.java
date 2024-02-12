import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();

        myList.add("Червен");
        myList.add("Син");
        myList.add("Зелен");
        myList.add("Оранжев");
        myList.add("Жълт");

        System.out.println("Списък преди изпразване:");
        System.out.println(myList);

        myList.clear();

        System.out.println("Списък след изпразване:");
        System.out.println(myList);
    }
}
