import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter integer number = ");
        int a = scan.nextInt();
        System.out.println("The series is ");
        if (a%2!=0){
        for(int i = 1;i<=a+a; i++)
        {
            if(i%2!=0)
            {
                System.out.print(i+" ");
            }
        }
    } else {
            for(int i = 1;i<=a+a-2; i++)
            {
                if(i%2!=0)
                {
                    System.out.print(i+" ");
                }
            }
        }
    }
}


