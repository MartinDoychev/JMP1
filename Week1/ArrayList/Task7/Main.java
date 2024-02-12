import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> colorsList = new ArrayList<>();

        colorsList.add("Червен");
        colorsList.add("Син");
        colorsList.add("Зелен");
        colorsList.add("Жълт");

        String searchElement = "Червен";

        boolean found = false;
        for (String color : colorsList) {
            if (color.equals(searchElement)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Елементът '" + searchElement + "' е намерен в списъка.");
        } else {
            System.out.println("Елементът '" + searchElement + "' не е намерен в списъка.");
        }
    }
}
