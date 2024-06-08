import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        System.out.println("Welcome to the Currency Converter!");
        System.out.println("Please choose the currency to convert from (1 or 2 or 3):");
        System.out.println("1 Rupee");
        System.out.println("2 Dollar");
        System.out.println("3 Euro");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice:");
        int choice = sc.nextInt();
        String currency = "";
        
        switch (choice) {
            case 1:
                currency = "Rupee";
                break;
            case 2:
                currency = "Dollar";
                break;
            case 3:
                currency = "Euro";
                break;
            default:
                System.out.println("Invalid choice");
                System.exit(0);
        }

        System.out.println("Enter the amount in " + currency + ":");
        double amount = sc.nextDouble();
        
        switch (choice) {
            case 1:
                Ruppe_to_other(amount);
                break;
            case 2:
                Dollar_to_other(amount);
                break;
            case 3:
                Euro_to_other(amount);
                break;
        }
    }

    public static void Ruppe_to_other(double amt) {
        double dollarAmount = amt * 0.013;
        double euroAmount = amt * 0.012;

        System.out.println(amt + " Rupee = " + dollarAmount + " Dollar");
        System.out.println(amt + " Rupee = " + euroAmount + " Euro");
    }

    public static void Dollar_to_other(double amt) {
        double rupeeAmount = amt * 79.37;
        double euroAmount = amt * 0.98;

        System.out.println(amt + " Dollar = " + rupeeAmount + " Rupee");
        System.out.println(amt + " Dollar = " + euroAmount + " Euro");
    }

    public static void Euro_to_other(double amt){
        double rupeeAmount = amt * 80.85;
        double dollarAmount = amt * 1.02;

        System.out.println(amt + " Euro = " + rupeeAmount + " Rupee");
        System.out.println(amt + " Euro = " + dollarAmount + " Dollar");
    }
}
