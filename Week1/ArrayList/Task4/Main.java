import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> colorsList = new ArrayList<>();

        colorsList.add("Червен");
        colorsList.add("Син");
        colorsList.add("Зелен");
        colorsList.add("Жълт");

        int index = 1;
        if (index >= 0 && index < colorsList.size()) {
            String extractedColor = colorsList.get(index);
            System.out.println("Елементът на позиция " + index + " е: " + extractedColor);
        } else {
            System.out.println("Невалиден индекс");
        }
    }
}
