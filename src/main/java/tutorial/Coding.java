package tutorial;
import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/*************
 * This classfV
 ************/
public class Coding {
    /*
     * Method for doing the binary Search algorithm
     */
    static void binarySearch(int mat[][], int i, int j_low, int j_high, int number) {
        while(j_low <= j_high) {
            int j_mid = (j_low + j_high) / 2;

            // Number found
            if(mat[i][j_mid] == number) {
                System.out.println("Number found at: [" + i + "]["+ j_mid + "]");
                return;
            }

            else if(mat[i][j_mid] > number) {
                j_high = j_mid - 1;
            }

            else {
                j_low = j_mid + 1;
            }

            System.out.println("Element not found");
        }
    }

    /*
     * method that search for a number on a bi-dimensional array
     */
    static void sortedMatrixSearch(int mat[][], int n, int m, int number) {

        // Single row matrix
        if(n == 1) {
            binarySearch(mat, 0, 0, m-1, number);
        }

        // Do binary search in middle column.
        // Condition to terminate the loop when the
        // 2 desired rows are found
        int i_low = 0, i_high = n - 1, j_mid = m /2;

        while( (i_low + 1) < i_high ) {
            int i_mid = (i_low + i_high) / 2;

            // Number found
            if(mat[i_mid][j_mid] == number) {
                System.out.println("Number found at: [" + i_mid + "]["+ j_mid + "]");
                return;
            }

            else if (mat[i_mid][j_mid] > number) {
                i_high = i_mid;
            }

            else {
                i_low = i_mid;
            }

            if(mat[i_low][j_mid] == number) {
                System.out.println("Number found at: [" + i_low + "]["+ j_mid + "]");
            }

            else if (mat[i_low + 1][j_mid] == number) {
                System.out.println("Number found at: [" + (i_low+1) + "]["+ j_mid + "]");
            }

            // Search element on 1st half of 1st row
            else if(number <= mat[i_low][j_mid - 1]) {
                binarySearch(mat, i_low, 0, j_mid - 1, number);
            }

            // Search element on 2nd half of 1st row
            else if(number >= mat[i_low][j_mid + 1] && number <= mat[i_low][m - 1] ) {
                binarySearch(mat, i_low, j_mid + 1, m - 1, number);
            }

            // Search element on 1st half of 2nd row
            else if(number <= mat[i_low + 1][j_mid - 1]) {
                binarySearch(mat, i_low + 1, 0, j_mid - 1, number);
            }

            // Search element on 2nd half of 2nd row
            else {
                binarySearch(mat, i_low + 1, j_mid + 1, m - 1, number);
            }
        }
    }

    static String convertToTitle(int n) {
        return n == 0 ? "" : convertToTitle(--n / 26) + (char)('A' + (n % 26));
    }


    static int shapeArea(int n) {
        int acum = 1;
        for(int i = 2; i<=n; i++) {
            acum+=Math.pow(2,i);
        }
        return acum;
    }




    boolean checkPalindrome(String inputString) {

        StringBuffer reverseString  = new StringBuffer(inputString);
        reverseString.reverse();

        return reverseString.equals(inputString);
    }

    static int sprDigSum(int n) {
        int acum = 0;
        int num = n;
        int y = 3;

        for(int j=1; j <=num; j+=2) {
            for (int i = y+(j-1); i <= j*j; i=i+(j-1)) {
                System.out.println(i);
                acum+=y=i;
            }
        }
        return acum+3+1;
    }
    static int makeArrayConsecutive2(int[] statues) {
        Arrays.sort(statues);
        int acum = 0;
        for(int i = 0; i< statues.length - 1; i++) {
            if(statues[i+1] - statues[i] != 1) {
                acum+= statues[i+1] - statues[i] - 1;

            }
        }
        return acum;
    }



    public static void main(String[] args) {
        int x[] = {7,12};
        System.out.println("Total: " + makeArrayConsecutive2(x));
        /*Collection<String> nombres = new ArrayList<>();

        nombres.add("Juan X");
        nombres.add("Pedro");
        nombres.add("Martin");
        nombres.add("Juan Jose");

        nombres.stream().filter(s -> s.contains("Juan")).sorted().forEach(System.out::println);


        Runnable hilo1 = () -> System.out.println("Hika");

        int n = 1;

        int i = n % 26;
        System.out.println("i=" + );
        System.out.println((char)(n+64));
        hilo1.run();*/

    }
}
