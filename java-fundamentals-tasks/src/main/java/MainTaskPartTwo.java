import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class MainTaskPartTwo {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    String argument;
    ArrayList<String> listOfArguments = new ArrayList<>();
    public void reverseAndPrintArguments() throws IOException {
        while (true){
            argument=bufferedReader.readLine();
            if (!argument.isEmpty())
                listOfArguments.add(argument);
            else break;
        }
        Collections.reverse(listOfArguments);
        System.out.println(listOfArguments);
    }


}
