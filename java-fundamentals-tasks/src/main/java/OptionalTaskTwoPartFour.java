
import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class OptionalTaskTwoPartFour {
    public static int arraySize;
    public static int maxRandomValue;
    public static int maxElementValue;
    public static int [][]array;
    public static int [][] resultArray;
   public static HashSet<Integer> rawsToDeleteSet = new HashSet<>();
    public static HashSet<Integer> columnsToDeleteSet = new HashSet<>();
    public static void main(String[] args) {
        array=createArray();
        printArray(array);
        maxElementValue=getMaxElementFromArray(array);
       int [][] resultArray= createResultArray(array);
       resultArray=deleteRawsAndColumnsWithMaxValueFromArray(array,resultArray);
       if (resultArray.length>0)
           printArray(resultArray);
       else System.out.println("В результате выполнения операций матрица пуста");
}
    public static int getMaxElementFromArray(int[][] array){
        int maxElementValue=array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
               if  (array[i][j]>maxElementValue)
                   maxElementValue=array[i][j];
            }
        }
        return maxElementValue;
    }
    public static int [][] createArray(){
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите размерность матрицы");
        try {
            arraySize = Integer.parseInt(bufferedReader.readLine());
        } catch (NumberFormatException | IOException e) {
            System.out.println("ОШИБКА!Необходимо ввести целое положительное число");
            e.printStackTrace();
        }
        System.out.println("Введите максимальное значение");
        try {
            maxRandomValue = Integer.parseInt(bufferedReader.readLine());
        } catch (NumberFormatException | IOException e)  {
            System.out.println("ОШИБКА!Необходимо ввести целое положительное число");
            e.printStackTrace();
        }
        array=new int [arraySize][arraySize];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j]=new Random().nextInt(maxRandomValue*2+1)-maxRandomValue;
            }
        }
        return array;
    }
    public static void printArray (int [][]array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int [][] createResultArray(int [][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
            if (array[i][j]==maxElementValue){
                rawsToDeleteSet.add(i);
                columnsToDeleteSet.add(j);
            }
            }
        }
        return new int [array.length-rawsToDeleteSet.size()][array.length-columnsToDeleteSet.size()];
    }
    public static int[][] deleteRawsAndColumnsWithMaxValueFromArray(int[][] array, int [][] resultArray) {
        int rawNumber=-1;
        int columnNumber=-1;
        for (int i = 0; i < array.length; i++) {
            if (rawsToDeleteSet.contains(i))
                continue;
            rawNumber++;
            for (int j = 0; j < array[i].length; j++) {
                if (columnsToDeleteSet.contains(j))
                    continue;
                columnNumber++;
                resultArray [rawNumber][columnNumber]= array[i][j];
                }
            columnNumber=-1;
            }
            return resultArray;
        }
    }

