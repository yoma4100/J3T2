public class Main {
    public static void main(String[] args) {
        int accountAmount = 100;
        int payAmount = 1100;
        int bonusAmount = payAmount / 100;
        int finalAccountAmount = accountAmount + payAmount + bonusAmount;

        System.out.println("Начислено бонусов: "+bonusAmount);
        System.out.println("Ваш баланс с учётом бонусов: "+finalAccountAmount);
    }
}