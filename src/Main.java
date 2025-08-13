//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int price = 50_000;
        int rublesPerMile = 20;


        int bonusMiles = price / rublesPerMile;
        System.out.println("Вам начислено: " + bonusMiles + " бонусных миль.");
    }
}