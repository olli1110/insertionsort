package com.company;
import java.util.Arrays;
public class insertionSort {

    public static void main(String[] args) {
	int[] array = {12, 6, 8, 9, 3, 5, 7};

	for(int i = 1; i < array.length; i++){
	    int arrayToSort = array[i];

	    int j = i;
	    while (j > 0 && arrayToSort < array[j - 1]){
	        array[j] = array [j-1];
	        j--;
        }
        array[j] = arrayToSort;
    }
        System.out.println(Arrays.toString(array));

    }
}
