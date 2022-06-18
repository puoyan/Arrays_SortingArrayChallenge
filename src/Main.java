import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] myIntArray;
//        myIntArray = getInteger(5);
        printArray(getInteger(5));

    }

    public static int[] getInteger(int number){
        System.out.println("Enter " + number + " Integers Number: \r");
        int[] array = new int[number];
        for(int i = 0 ; i < array.length ; i++){
            array[i] = scanner.nextInt();
        }return array;
    }

    public static void printArray(int[] array){
        for(int i = 0 ; i <array.length ; i++){
            System.out.println("Element " + i + " Value is " +array[i]);
        }
    }
}
