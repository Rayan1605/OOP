import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        Scanner myinput = new Scanner(System.in);
        int[] array = new int[10];
        int hundred   = 100;
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = hundred;
            hundred = hundred+100;
        }

        for (int x : array) {
            System.out.println("In the index " + counter + ", it contains the number " + x +" \n");
            counter++;

        }
        int a = 10;
        do {
            try {
                System.out.println("Please enter the index you would like to see\n");
                a = myinput.nextInt();
                System.out.println(" The number that is contained in index " + a + " is " + array[a]);
            }catch (ArrayIndexOutOfBoundsException e ){
                e.printStackTrace();
                System.out.println("Please write between the numbers 1-9\n");
            }

        }while (a>=10);


    }
}
