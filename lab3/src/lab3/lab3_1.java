package lab3;
import java.util.Random;
import java.util.Scanner;

public class lab3_1 {
  public static void main(String[] args) {
    int numValues = getNumValuesFromUser();
    int[] values = generateRandomValues(numValues);
    printValues(values);
  }

  public static int getNumValuesFromUser() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Please enter your random value: ");
    return scanner.nextInt();	
  }

  public static int[] generateRandomValues(int numValues) {
    Random random = new Random();
    int[] values = new int[numValues];
    for (int i = 0; i < numValues; i++) {
      values[i] = random.nextInt(100);
    }
    return values;
  }

  public static void printValues(int[] values) {
    for (int i = 0; i < values.length; i++) {
      System.out.println("Array[" + i + "] = " + values[i]);
    }
  }
}

