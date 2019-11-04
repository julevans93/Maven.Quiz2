package com.zipcodewilmington.assessment2.part2;

import com.sun.deploy.util.ArrayUtil;
import sun.awt.image.ImageWatched;

import java.util.Arrays;
import java.util.LinkedList;


public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        Integer[] result = new Integer[array1.length + array2.length];
        System.arraycopy(array1,0, result,0,array1.length);
        System.arraycopy(array2, 0, result, array1.length, array2.length);
        return result;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        LinkedList<Integer> rotate = new LinkedList<>(Arrays.asList(array));
        Integer counter = 0;
        while(counter < index){
            rotate.addLast(rotate.removeFirst());
            counter++;
        }
        Integer [] rotations = new Integer [array.length];
        return rotate.toArray(rotations);
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        int counter1 = 0;
        int counter2 = 0;
        int sum = 0;
        for (Integer x : array1){
            if(x == valueToEvaluate);
            counter1++;
            for (Integer j : array2){
                if (j == x);
                counter2++;
            }
        }

        return counter1 + counter2;
    }

    public Integer mostCommon(Integer[] array) {
        Arrays.sort(array);
        int maxCount = 1;
        int result = array[0];
        int currCount =1;

        for (int i = 1; i < array.length; i++){
            if (array[i] == array [i-1]){
                currCount++;
            }
            else{
                if (currCount>maxCount) {
                    maxCount = currCount;
                    result = array[i - 1];
                }
                currCount =1;
            }
        }
        if (currCount > maxCount){
            maxCount = currCount;
            result = array[array.length-1];
        }
        return result;
    }
}
