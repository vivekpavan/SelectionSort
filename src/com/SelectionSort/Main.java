package com.SelectionSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[] numbers = {8,2,4,1,3,5};
        var sorted = new SelectionSort();
        var sort = new moshSelectionSort();
//        sorted.SelectionSort(numbers);
        sort.Sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
