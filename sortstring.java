import java.util.*;

public class sortstring {
    
    public static void main(String args[])
    {
     String[] arr = {"B","A","C","D"};
        int n = arr.length;
        // convert the string arr to char array     
        char[] charArr = new char[n];
        for (int i = 0; i < n; i++) {
            charArr[i] = arr[i].charAt(0);
        }
        // sort the char array using bubble sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (charArr[j] > charArr[j + 1]) {
                    // swap charArr[j] and charArr[j + 1]
                    char temp = charArr[j];
                    charArr[j] = charArr[j + 1];
                    charArr[j + 1] = temp;
                }
            }
        }
        // convert the char array back to string array
        for (int i = 0; i < n; i++) {
            arr[i] = String.valueOf(charArr[i]);
        }
        // print the sorted string array
        System.out.println("Sorted string array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}