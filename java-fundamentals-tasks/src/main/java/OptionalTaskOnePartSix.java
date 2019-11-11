
import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OptionalTaskOnePartSix {
    public String countOfNumbers;
    public String  number;

    public static void main(String[] args) {
        List<Integer> listOfNumbers = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        OptionalTaskOnePartSix optionalTaskOnePartSix= new OptionalTaskOnePartSix();
        try {
            optionalTaskOnePartSix.countOfNumbers=bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i=1;i<=Integer.parseInt(optionalTaskOnePartSix.countOfNumbers);i++){
            try {
                listOfNumbers.add(Integer.parseInt(bufferedReader.readLine()));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        for (Integer number:
             listOfNumbers) {
        List<Integer> resultList =new OptionalTaskOnePartSix().getListOfNumerals(number);
        if (isListOrdered(resultList)){
            for (Integer numeral:
                 resultList) {
                System.out.print(""+numeral);
            }
            break;
        }
        }
    }
    public List<Integer> getListOfNumerals(Integer number){
       List<Integer> listOfNumerals=new ArrayList<>();
        listOfNumerals.add(number%10);
        while (true) {
            number /= 10;
            if (number>0)
                listOfNumerals.add(number%10);
            else break;
        }
        Collections.reverse(listOfNumerals);
        return listOfNumerals;
    }
    public static boolean isListOrdered(List<Integer> list){
        List tmp = new ArrayList(list);
        Collections.sort(tmp);
        return tmp.equals(list);
    }

}
