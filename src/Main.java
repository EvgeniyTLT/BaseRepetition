import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        int sumMax=0;
        int sumArray=0;
        int index = 0;
        for (int i = 0; i < array.length-2; i++) {
            sumArray = array[i]+array[i+1]+array[i+2];
            if (sumMax < sumArray){
                sumMax=sumArray;
                index=i;
            }
        }
        for (int e: array
             ) {
            System.out.print(e+ " ");
        }
        System.out.println("\nmaxSum: "+sumMax+" index: " + index);

    }
}
