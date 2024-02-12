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

        int indexToRemove = 1; 
        if (indexToRemove >= 0 && indexToRemove < colorsList.size()) {
            colorsList.remove(indexToRemove);
            System.out.println("Списъкът с цветове след премахване на третия елемент:");
            System.out.println(colorsList);
        } else {
            System.out.println("Невалиден индекс за премахване");
        }
    }
}
