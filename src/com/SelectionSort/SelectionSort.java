package com.SelectionSort;

import java.util.ArrayList;

public class SelectionSort {
    private int minIndex;
    public void SelectionSort(int[] array){
        boolean isSorted;
        for(var j = 0;j < array.length;j++){
            isSorted = true;
            var min = array[j];
            for(var i = 1 + j;i < array.length;i++){
                if(array[i] < min) {
                    min = array[i];
                    minIndex = i;
                    isSorted = false;
                }
            }
            if(!isSorted)
                Swap(array,j);
        }
    }
    private void Swap(int[] array,int index1){
        var temp = array[index1];
        array[index1] = array[minIndex];
        array[minIndex] = temp;
    }
}
