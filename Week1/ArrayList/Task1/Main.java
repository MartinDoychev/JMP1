import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> colorsList = new ArrayList<>();

        colorsList.add("Червен");
        colorsList.add("Син");
        colorsList.add("Зелен");
        colorsList.add("Жълт");
        colorsList.add("Оранжев");

        System.out.println("Списък с цветове:");
        for (String color : colorsList) {
            System.out.println(color);
        }
    }
}