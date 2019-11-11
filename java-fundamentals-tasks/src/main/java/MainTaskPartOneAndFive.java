import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Month;

public class MainTaskPartOneAndFive {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    String userName;
    MainTaskPartOneAndFive(){
        try {
            userName = bufferedReader.readLine();
            System.out.println("Hello, " + userName);;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        System.out.println("enter username");
        new MainTaskPartOneAndFive();
        System.out.println("enter arguments");
        try {
            new MainTaskPartTwo().reverseAndPrintArguments();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("enter quantity of random numbers");
        new MainTaskPartThree();
        System.out.println("enter arguments");
        try {
            new MainTaskPartFour().countSummAndProduktOfArguments();
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int number=0;
        System.out.println("enter number of month");
        try {
            number = Integer.parseInt(bufferedReader.readLine());
            if (number>=1 && number<=12)
                System.out.println(Month.of(number));
            else
                System.out.println("Не существует такого месяца");
        } catch (NumberFormatException | IOException e) {
            System.out.println("Ошибка, введите целое число");;
        }


    }
}

