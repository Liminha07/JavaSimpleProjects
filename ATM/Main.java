import java.util.Scanner;

public class Main {

    private static String name;
    private static String passWord;
    private static double money;
    private static double depositedMoney = 1000;

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("nome:");
            name = scanner.nextLine();

            System.out.print("passWord:");
            passWord = scanner.nextLine();

            System.out.print("money:");
            money = scanner.nextDouble();

            Transactions userAccount = new Transactions(name, passWord, money, depositedMoney);

            userAccount.transactionsMethods();

        } catch (java.util.InputMismatchException e) {
            System.out.println("You typed something wrong!!");
        }
    }
}
