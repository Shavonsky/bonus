public class main {
    public static void main(String[] args) {
        int balance = 1000;
        int transfer = 500;
        int limit = 1099;

        int final_balance = (balance + transfer);

        if (final_balance > limit) {
            int bonus = final_balance / 100;
            System.out.println(bonus);
        }
    }
}
