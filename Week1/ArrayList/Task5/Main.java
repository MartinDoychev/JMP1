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

        int index = 1;
        String newColor = "Оранжев";
        if (index >= 0 && index < colorsList.size()) {
            colorsList.set(index, newColor);
            System.out.println("Списъкът с цветове след актуализацията:");
            System.out.println(colorsList);
        } else {
            System.out.println("Невалиден индекс");
        }
    }
}