import java.util.Scanner;

public class EqualPairs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int count = 0;

        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;
        int sum5 = 0;
        int sum6 = 0;

        int diff=0;
        int max = -1000000;

        for (int i = 0; i < n; i++) {

            int num1 = Integer.parseInt(scanner.nextLine());
            int num2 = Integer.parseInt(scanner.nextLine());

            if (i==0){
            sum1 = num1 + num2;}

           else if (i == 1){
                sum2 = num1 + num2;
                diff = sum1 - sum2;
                if (diff!=0 && diff>max){max=diff;}
            } else if (i == 2) {
                sum3 = num1 + num2;
                diff = sum2 - sum3;
                if (diff!=0 && diff>max){max=diff;}}
            else if (i == 3) {
                sum4 = num1 + num2;
                diff = sum3 - sum4;
                if (diff!=0 && diff>max){max=diff;}}
            else if (i == 4) {
                sum5 = num1 + num2;
                diff = sum4 - sum5;
                if (diff!=0 && diff>max){max=diff;}}
            else if (i == 5) {
                sum6 = num1 + num2;
                diff = sum5 - sum6;
                if (diff!=0 && diff>max){max=diff;}}

            } if (max==-1000000){
            System.out.println("Yes, value="+sum1);}
            else System.out.println("No, maxdiff="+Math.abs(max));


        }

    }
