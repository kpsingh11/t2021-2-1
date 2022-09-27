import java.util.Scanner;

public class Problem1 {
        public static void main(String[] args) {

            char operator;
            Double a, b, result;
            Scanner input = new Scanner(System.in);

            System.out.print("Enter first number = ");
            a = input.nextDouble();

            System.out.print("Enter second number = ");
            b = input.nextDouble();

            System.out.print("Choose an operator(+, -, *, or /) = ");
            operator = input.next().charAt(0);

            switch (operator) {

                case '+':
                    result = a + b;
                    System.out.println(a + " + " + b + " = " + result);
                    break;

                case '-':
                    result = a - b;
                    System.out.println(a + " - " + b + " = " + result);
                    break;

                case '*':
                    result = a * b;
                    System.out.println(a + " * " + b + " = " + result);
                    break;

                case '/':
                    if (b!=0){
                        result = a / b;
                        System.out.println(a + " / " + b + " = " + result);}
                    else{
                        System.out.println("Denominator must not be 0");
                    }
                    break;

                default:
                    System.out.println("Invalid operator!");
                    break;
            }

            input.close();
        }
    }

