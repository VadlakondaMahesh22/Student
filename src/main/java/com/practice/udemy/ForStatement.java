package com.practice.udemy;

public class ForStatement {

    public static void main(String[] args) {
        int[] iArray = {2, 6, 9, 12, 25, 36, 78};
        int i = 0, j = 0;
        int temp;
        // for ( i = 1, j = 1; i < iArray.length & j < iArray.length; System.out.println(iArray[i++]+" - "+ iArray[j++]));


        /*for (i = 0, j = iArray.length - 1; i < j; i++, j--) {
            temp = iArray[i];
            iArray[i] = iArray[j];
            iArray[j] = temp;

            System.out.println(iArray[i] + " - " + iArray[j]);
        }
        for (i = 0; i < iArray.length; i++) {
            System.out.print(iArray[i]+ " ");
        }*/

        //to count the number division of a particulr value
        int n = 7;
        int count = 0;
        for (i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println( n+ " of divisor is :" + i );
                count++;
            }
        }
        System.out.println("\ncount of 25 divisors " + count);


       /* if (count == 2) {
            System.out.print("it is prime number : " + n);
        } else {
            System.out.println("it is not a prime number :" + n);
        }*/


        /*int n=7;
        boolean isPrime=true;
        int k=0;
        if (n <=1){
            isPrime = false;
        }
        if ( n == 2 || n == 3){
            isPrime = true;
        }
        for ( k=3; k * k <= n; k+=2){
            if(k % k == 0){
                isPrime = false;
                break;
            }

        }
       if ( isPrime){
           System.out.print("it is prime number : " + n);
       } else {
           System.out.println("it is not a prime number :" + n);
       }*/
    }

}
