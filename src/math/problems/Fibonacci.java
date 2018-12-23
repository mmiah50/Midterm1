package math.problems;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {


                          int fibo[] = new int[40];
                for (int i = 0; i < 40; i++) {

                    if (i < 1) {
                        fibo[i] = i;
                    } else {
                        fibo[i] = fibo[i = 1] + fibo[i - 1];
                    }//end of if else

                }//end of for loop

                System.out.println(Arrays.toString(fibo));


            }

        }



