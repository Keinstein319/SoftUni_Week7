import java.util.Scanner;

public class Numbers1to100 {

    public static void main(String[] args){


        Scanner scanner=new Scanner(System.in);

int n=Integer.parseInt(scanner.nextLine());
int sum1=0;
int sum2=0;

int count1=0;
int count2=0;


        for (int count = 1; count <=n; count++) {

            while (count1<n){

          int num=Integer.parseInt(scanner.nextLine());
          sum1=sum1+num;
            count1++;
} while (count2<n){
                int num=Integer.parseInt(scanner.nextLine());
                sum2=sum2+num;
                count2++;
            }
        }
        if (sum1 == sum2) {
            System.out.println("Yes, sum = "+sum1);
        } else if (sum1!=sum2){
            System.out.println("No, diff = "+Math.abs(sum1-sum2));
        }
    }
}
