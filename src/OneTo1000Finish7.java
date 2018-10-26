import java.util.Scanner;
import java.text.DecimalFormat;

public class OneTo1000Finish7 {

    public static void main(String[] args) {
//https://pastebin.com/PyYTnDe6
        Scanner scanner = new Scanner(System.in);

        double n=Double.parseDouble(scanner.nextLine());
        DecimalFormat decimalFormat = new DecimalFormat("#.###");

        double OddSum = 0;
        double OddMin = 1000000;
        double OddMax = -1000000;

        double EvenSum = 0;
        double EvenMin = 1000000;
        double EvenMax = -1000000;

        for (int i = 1; i <= n; i++) {

            double num=Double.parseDouble(scanner.nextLine());

            if (i % 2 == 0) {
                EvenSum += num;
                if (num > EvenMax) {
                    EvenMax = num;
                }
                if (num < EvenMin) {
                    EvenMin = num;
                }
            } if (i % 2 != 0) {
                OddSum += num;
                if (num > OddMax) {
                    OddMax = num;
                }
                if (num < OddMin) {
                    OddMin = num;
                }
            }

        }  System.out.printf("OddSum=%s%n", decimalFormat.format(OddSum));
        if (OddMin == 1000000000.0) {
            System.out.println("OddMin=No");
        } else {
            System.out.printf("OddMin=%s%n", decimalFormat.format(OddMin));
        }
        if (OddMax  == 1000000000.0) {
            System.out.println("OddMax=No");
        } else {
            System.out.printf("OddMax=%s%n", decimalFormat.format(OddMax  ));
        }
        System.out.printf("EvenSum=%s%n", decimalFormat.format(EvenSum));
        if (EvenMin == 1000000000.0) {
            System.out.println("EvenMin=No");
        } else {
            System.out.printf("EvenMin=%s%n", decimalFormat.format(EvenMin));
        }
        if (EvenMax == -1000000000.0) {
            System.out.println("EvenMax=No");
        } else {
            System.out.printf("EvenMax=%s%n", decimalFormat.format(EvenMax));
        }


    }
}