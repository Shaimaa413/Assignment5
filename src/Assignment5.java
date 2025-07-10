import java.util.Scanner;

public class Assignment5 {
    public static void main(String[]args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number");
        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + "is even");
        } else {
            System.out.println(number + "is odd");
        }
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter day Number:  ");
        int Day = input2.nextInt();
        switch (Day) {
            case 1:
                System.out.print("Saturday");
                break;
            case 2:
                System.out.print("Sunday");
                break;
            case 3:
                System.out.print("Monday");
                break;
            case 4:
                System.out.print("Tuesday");
                break;
            case 5:
                System.out.print("Wednesday");
                break;
            case 6:
                System.out.print("Thursday");
                break;
            case 7:
                System.out.print("Friday");
                break;
            default:
                System.out.println("Invalid Number");
        }
 System.out.println() ;
        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 10; y++) {
                System.out.println(x + "×" + y + "=" + (x * y));
            }
            System.out.println();
        }


        Scanner input3 = new Scanner(System.in);
        System.out.println("Enter a number: ");
        long num = input3.nextLong();

        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        System.out.println("Number of digits: " + count);


            Scanner input4 = new Scanner(System.in);
            System.out.println(" Enter a Number: ") ;
            long number2 = input4.nextLong();

            long reversed = 0;
            while (number2 > 0) {
                int digit = (int) (number2 % 10);
                reversed = reversed * 10 + digit;
                number2 = number2 / 10;
            }

            System.out.println("Reversed number is " + reversed);

            input4.close();
    }
}

