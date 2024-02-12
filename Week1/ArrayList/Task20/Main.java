import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();

        System.out.println("Капацитет преди увеличаването: " + myList.size());

        myList.ensureCapacity(10);

        System.out.println("Капацитет след увеличаването: " + myList.size());
    }
}
