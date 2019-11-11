
import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class OptionalTaskOnePartSeven {
    public String countOfNumbers;
    public String  number;

    public static void main(String[] args) {
        List<Integer> listOfNumbers = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        OptionalTaskOnePartSeven optionalTaskOnePartSeven= new OptionalTaskOnePartSeven();
        try {
            optionalTaskOnePartSeven.countOfNumbers=bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i=1;i<=Integer.parseInt(optionalTaskOnePartSeven.countOfNumbers);i++){
            try {
                listOfNumbers.add(Integer.parseInt(bufferedReader.readLine()));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        for (Integer number:
                listOfNumbers) {
            List<Integer> resultList =new OptionalTaskOnePartSeven().getListOfNumerals(number);
            if (doesListContainOnlyDifferentNumerals(resultList)){
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
    public static boolean doesListContainOnlyDifferentNumerals(List<Integer> list){
        HashSet<Integer> hashSet=new HashSet<>();
        hashSet.addAll(list);
        return hashSet.size()==list.size();
    }

}
