import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
        Scanner myinput = new Scanner(System.in);
        List<Integer> arraylist = new ArrayList<>();
        int hundred   = 100;
        int counter = 0;
        for (int i = 0; i < 10; i++) {
            arraylist.add(hundred);
            hundred = hundred+100;
        }

        for (int x : arraylist) {
            System.out.println("Element at index " + counter + " is " + x + "\n");
            counter++;
        }

        System.out.println("Please enter a new value\n");
        int newvalue = myinput.nextInt();

        arraylist.add(newvalue);
    counter = 0;

        for (int x : arraylist) {
            System.out.println("Element at index " + counter + " is " + x + "\n");
            counter++;
        }

    }
}
