import java.util.Scanner;

public class OddEvenSum {

    public static void main(String[] args){


        Scanner scanner=new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());

        int sum1=0;
        int sum2=0;


        for (int count = 1; count <=n; count++) {

            if (count%2==0){

                int num=Integer.parseInt(scanner.nextLine());
                sum1=sum1+num;

            } if (count%2!=0){
                int num=Integer.parseInt(scanner.nextLine());
                sum2=sum2+num;

            }
        }
        if (sum1 == sum2) {
            System.out.println("Yes sum = "+sum1);
        } else if (sum1!=sum2){
            System.out.println("No diff = "+Math.abs(sum1-sum2));
        }
    }
}
