import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Hello! What do you want to order? \n 1. Espresso \n 2. Americano \n 3. Exit");
            int orderChoice = scanner.nextInt();

            if (orderChoice == 3) {
                System.out.println("Goodbye!");
                break;
            }

            Coffee coffee = null;

            switch (orderChoice) {
                case 1:
                    coffee = new Espresso();
                    break;
                case 2:
                    coffee = new Americano();
                    break;
                default:
                    System.out.println("Invalid choice. Please select 1 for Espresso, 2 for Americano, or 3 to exit.");
                    continue;
            }

            System.out.println("Do you want to add any condiments? \n 1. Milk \n 2. Sugar \n 3. Syrup \n 4. Milk and Sugar \n 5. Nothing");
            int condimentChoice = scanner.nextInt();

            switch (condimentChoice) {
                case 1:
                    coffee = new MilkDecorator(coffee);
                    break;
                case 2:
                    coffee = new SugarDecorator(coffee);
                    break;
                case 3:
                    coffee = new SyrupDecorator(coffee);
                    break;
                case 4:
                    coffee = new MilkDecorator(new SugarDecorator(coffee));
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid condiment option.");
            }

                System.out.println("Your order: " + coffee.getDescription() + ", Cost: " + coffee.cost() + " tenge");
        }
    }
}