import java.util.Scanner;


public class BeverageTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Do you want extras with your tea (yes/no)? ");
        boolean teaExtras = scanner.nextLine().trim().equalsIgnoreCase("yes");

        System.out.print("Do you want extras with your coffee (yes/no)? ");
        boolean coffeeExtras = scanner.nextLine().trim().equalsIgnoreCase("yes");

        Beverages tea = new Tea();
        tea.setWantsExtras();
        Beverages coffee = new Coffee();
        coffee.setWantsExtras();

        System.out.println("Making Tea...");
        tea.finalTemplateMethod();

        System.out.println("\nMaking Coffee...");
        coffee.finalTemplateMethod();

        scanner.close();
    }
}