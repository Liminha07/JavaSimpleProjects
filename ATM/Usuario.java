public class Usuario {
    private String name;
    private String passWord;
    private double money;
    private double depositedMoney;

    protected Usuario(String name, String passWord, double money, double depositedMoney) {
        this.name = name;
        this.passWord = passWord;
        this.money = money;
        this.depositedMoney = depositedMoney;
    }

    protected String getName() {
        return name;
    }

    protected String getPassWord() {
        return passWord;
    }

    protected double getMoney() {
        return money;
    }

    protected double getDepositedMoney() {
        return depositedMoney;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    protected void setMoney(double money) {
        this.money = money;
    }

    protected void setDepositedMoney(double depositedMoney) {
        this.depositedMoney = depositedMoney;
    }
}