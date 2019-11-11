import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class MainTaskPartThree {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int countOfNumbers;
    MainTaskPartThree (){
        try {
            countOfNumbers=Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i=0;i<countOfNumbers;i++){
            System.out.println(String.valueOf(new Random().nextInt(76)));
        }
    }
}

