import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listA = new ArrayList<>();
        ArrayList<String> listB = new ArrayList<>();

        System.out.println("Введите 5 строк для списка A: ");

        for (int i = 0; i < 5; i++) {
            listA.add(scanner.nextLine());
        }
        System.out.println("Список A: " + listA);

        System.out.println("Введите 5 строк для списка B: ");

        for (int i = 0; i < 5; i++) {
            listB.add(scanner.nextLine());
        }
        System.out.println("Список A: " + listB);

        ArrayList<String> listC = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(4 - i));
        }
        System.out.println("Список С :" + listC);
        listC.sort(Comparator.comparingInt(String::length));
        System.out.println("Список C после сортировки" + listC);
    }
}