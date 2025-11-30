package com.daily.practice;

public class Arrays {

    public static void main(String[] args) {
        int[] array= new int[5];
        array[0] =10;
        array[1] =40;
        array[2] =9;
        array[3] =16;
        array[4] =50;
       // lengthOfArray(array);
       //  reverseArray(array);
        // maxValueFromArray(array);
        containsGivenNumber(array,50);

    }

    //print all elements of the array
    public static void printAllelements(int[] arr){
        System.out.println("=========== using for each loop=========");
        for (int i=0; i< arr.length; i++){
        System.out.println(arr[i]);
        }
        System.out.println("=========== using for loop =========");
        for (int value : arr){
            System.out.println(value);
        }
    }
    //Find the length of the array
    public static void lengthOfArray(int[] array){
        System.out.println(" ====lengthOfArray====");
            System.out.println(array.length);
    }

    //Reverse the array
    public static void reverseArray(int[] arr) {
        System.out.println("=========== using for each loop=========");
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    //Find the maximum value in the array
    public static void maxValueFromArray(int[] arr) {
        System.out.println("=========== using for each loop=========");
       int max = arr[0];

       for (int i=1; i < arr.length; i++){
         if  (arr[i] > max) {
             max = arr[i];
           }
       }
        System.out.println(max);
    }

    //check if array contains a given number
    public static void containsGivenNumber(int[] arr, int n){
        for ( int j=0; j < arr.length; j++){
            if ( arr[j] == n){
                System.out.println("Array contains given number :"+ n);
                return;
            }
        }
        System.out.println("Array does not contains given number :");
    }
}
