import java.util.Scanner;

public class CleverLilly {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double price = Double.parseDouble(scanner.nextLine());
        int p=Integer.parseInt(scanner.nextLine());

        int money = 0;
        int toys = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                money += (10 * i / 2) - 1;
            }
            if (i % 2 != 0) {
                toys += 1;
            }
        } money=money+toys*p;
        if (money>=price){
            double remain=(money-price);
            System.out.printf("Yes! %.2f", remain);
        } if (money<price){
         double remain=Math.abs(money-price);
            System.out.printf("No! %.2f", remain);
        }
    }
}