import java.util.Scanner;

public class งาน {

        public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount of money: ");
        double amount = scanner.nextDouble();
        System.out.print("Enter the card type (silver, gold, platinum): ");
        String cardType = scanner.next().toLowerCase(); 
        double finalAmount = MethodFinalAmount(amount, cardType);
        double discount = getDiscount(amount, cardType); 
        System.out.printf("Card Type: %s%n", cardType);
        System.out.printf("Original Amount: %.2f%n", amount);
        System.out.printf("Discount: %.2f%%%n", discount * 100);
        System.out.printf("Final Amount after discount: %.2f%n", finalAmount);

        scanner.close();
    }

   
    public static double MethodFinalAmount(double amount, String cardType) {
        double discount = getDiscount(amount, cardType);
        return amount * (1 - discount);
    }

    
    public static double getDiscount(double amount, String cardType) {
        switch (cardType) {
            case "silver":
                return (amount >= 1000) ? 0.02 : 0.0;
            case "gold":
                return (amount >= 1000) ? 0.03 : 0.0;
            case "platinum":
                return 0.05; 
            default:
                System.out.println("Invalid card type entered.");
                return 0.0;
        }
    }
}
