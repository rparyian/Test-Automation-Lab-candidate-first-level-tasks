
import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class OptionalTaskTwoPartTree {
    public static int result=0;
    public static int arraySize;
    public static int maxRandomValue;
    public static int [][]array;
    public static void main(String[] args) {
      array=createArray();
      printArray(array);
      for (int i=0;i<array.length;i++){
          result+=getSummOfElementsInRawSituatedBetweenFirstTwoPositiveElements(array,i);
      }
        System.out.println("result= "+result);
    }

    public static int getSummOfElementsInRawSituatedBetweenFirstTwoPositiveElements(int[][] array, int rawNumber){
        int summ=0;
        int firstPositiveElementIndex=0;
        int secondPositiveElementIndex=0;
        int countOfPositiveElements=0;
            for (int j = 0; j < array[rawNumber].length; j++) {
                if  ((array[rawNumber][j]>0)&&(countOfPositiveElements==0)){
                    firstPositiveElementIndex=j;
                    countOfPositiveElements++;
                    continue;
                }
                if ((array[rawNumber][j]>0)&&(countOfPositiveElements==1)){
                    secondPositiveElementIndex=j;
                    countOfPositiveElements++;
                    continue;
                }
                if (countOfPositiveElements==2)
                    break;
            }
            for (int j=firstPositiveElementIndex+1;j<secondPositiveElementIndex;j++)
                summ+=array[rawNumber][j];
        return summ;
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
}


