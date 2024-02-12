import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Елемент 1");
        myList.add("Елемент 2");
        myList.add("Елемент 3");

        System.out.println("Списък преди замяната:");
        System.out.println(myList);

        int indexToReplace = 1;

        String replacementElement = "Нов елемент";

        if (indexToReplace >= 0 && indexToReplace < myList.size()) {
            myList.set(indexToReplace, replacementElement);
            System.out.println("Списък след замяната:");
            System.out.println(myList);
        } else {
            System.out.println("Невалиден индекс за замяна");
        }
    }
}

