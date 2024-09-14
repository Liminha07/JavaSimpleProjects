import java.util.Scanner;

public class Transactions extends Usuario {

    protected Transactions(String name, String passWord, double money, double depositedMoney) {
        super(name, passWord, money, depositedMoney);
    }

    protected void transactionsMethods() {

        Scanner scanner = new Scanner(System.in);

        boolean validResponse = false;
        boolean keepGoing = true;

        while (!validResponse || keepGoing) {
            System.out.println(
                            "                 [{MENU}]                          " +
                            "\n----------------------------------------------------" +
                            "\n|Withdraw: (1)      ||\t Deposit: (2)              |" +
                            "\n|            Consult money: (3)                    | " +
                            "\n----------------------------------------------------"
            );
            int choice = scanner.nextInt();
            scanner.nextLine();

            double response = 0;

            switch (choice) {
                case 1:
                    System.out.println("How much?");
                    response = scanner.nextDouble();
                    scanner.nextLine();
                    if (response > getDepositedMoney()) {
                        System.out.println("You can not withdraw more than you have!!");
                    } else
                        setMoney(getMoney() + response);
                    setDepositedMoney(getDepositedMoney() - response);
                    validResponse = true;

                    break;
                case 2:
                    System.out.println("How much:");
                    response = scanner.nextDouble();
                    scanner.nextLine();
                    if (response > getMoney()) {
                        System.out.println("You can not deposit more than you have!!");
                    } else
                        setMoney(getMoney() - response);
                    setDepositedMoney(getDepositedMoney() + response);
                    validResponse = true;
                    break;
                case 3:
                    System.out.println("All the money in the bank:" + getDepositedMoney());
                    System.out.println("All the money with you:" + getMoney());
                    validResponse = true;
                    break;
                default:
                    System.out.println("Insert a valid option!!");
            }
            System.out.println("Do you want to stop(1) or keep going(anything)?");
            if (scanner.nextLine().equals("1")) {
                keepGoing = false;
            }
        }
    }
}
