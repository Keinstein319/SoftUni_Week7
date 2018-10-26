import java.util.Scanner;

public class Salary {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n= Integer.parseInt(scanner.nextLine());
        int salary=Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <n; i++) {
            String tab=scanner.nextLine();

            if (tab.equals("Facebook")){
                salary-=150;
            }
            if (tab.equals("Instagram")){
                salary-=100;
            }
            if (tab.equals("Reddit")){
                salary-=50;
            }
            if (salary<=0){break;}




        } if (salary>0){
        System.out.println(salary);}
        else if (salary<=0){
            System.out.println("You have lost your salary.");

        }


        }

    }
