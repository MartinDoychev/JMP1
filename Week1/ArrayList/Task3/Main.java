import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> colorsList = new ArrayList<>();

        colorsList.add("Червен");
        colorsList.add("Син");
        colorsList.add("Зелен");
        colorsList.add("Жълт");

        System.out.println("Оригинален списък с цветове:");
        System.out.println(colorsList);

        String newColor = "Оранжев";
        colorsList.add(0, newColor);

        System.out.println("Списък с цветове след вмъкване на първа позиция:");
        System.out.println(colorsList);
    }
}