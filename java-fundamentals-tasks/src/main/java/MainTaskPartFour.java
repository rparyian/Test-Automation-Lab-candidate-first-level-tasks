import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

public class MainTaskPartFour {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    String argument;
    int summ=0;
    int produkt = 1;
    ArrayList<Integer> listOfArguments = new ArrayList<>();
    public void countSummAndProduktOfArguments() throws IOException {
        while (true) {
            argument = bufferedReader.readLine();
            if (!argument.isEmpty())
                listOfArguments.add(Integer.parseInt(argument));
            else break;
        }
        for (Integer i:
                listOfArguments) {
            summ+=i;
            produkt*=i;
        }
        System.out.println(summ + " "+ produkt);
    }
}
