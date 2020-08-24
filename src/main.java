public class Main {
    public static void Main(String[] args) {
        int balance = 100;
        int transfer = 500;
        int limit = 1000;
        int bonus;
        if (transfer >= limit) {
            bonus = 1;
        } else {
            bonus = 0;
        }

        int bonus_balance = transfer * bonus / 100;
        System.out.println(bonus_balance);
       
    }
}
