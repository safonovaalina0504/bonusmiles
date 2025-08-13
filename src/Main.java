public class Main {
    public static void main(String[] args) {
        int price = 10_000;
        int rublesPerMile = 20;


        int bonusMiles = price / rublesPerMile;
        System.out.println("Вам начислено: " + bonusMiles + " бонусных миль.");
    }
}