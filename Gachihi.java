import javax.swing.*;
import java.util.*;


public class Gachihi {
    public static void main(String[] args) {
        int size;
        int[] numbers;
        int temp;
        int y;
        int i;
        int flag;
        String input;

        input = JOptionPane.showInputDialog("Enter the prefered size of your array");
        size = Integer.parseInt(input);

        numbers = new int[size];

        for (i = 0; i < size; i++) {
            input = JOptionPane.showInputDialog("Enter a number " + (i + 1));
            numbers[i] = Integer.parseInt(input);
        }

        //now from this part we are sorting the  bubble
        flag = 1;
        for (y = 1; y < size && flag == 1; y++) {

            flag = 0;
            for (i = 0; i < size - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    temp = numbers[i];
                    numbers[i] = numbers[i
                            + 1];    //swaping the numbers you entered
                    numbers[i + 1] = temp;
                    flag = 1;
                }
            }
        }

        System.out.println("New list of numbers");
        for (i = 0; i < size; i++)
            System.out.println(numbers[i]);
    }
}