public class Main {
    public static void main (String[] args) {

        BonusM BonusM = new BonusM();
        int price = 20000;
        int miles = BonusM.calculate(price);
        System.out.println(miles);

    }
}