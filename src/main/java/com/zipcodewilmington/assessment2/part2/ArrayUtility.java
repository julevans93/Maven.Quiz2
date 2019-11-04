package com.zipcodewilmington.assessment2.part2;

import com.sun.deploy.util.ArrayUtil;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        Integer [] mergeAll = new Integer[array1.length + array2.length];
        for(int i = 0; i < array1.length; i++){
            array1[i] = mergeAll[0];
            for(int j = 0; j < array2.length; j++){
                array2[j] = mergeAll[i+1];
            }
        }
        return mergeAll;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        return null;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        return null;
    }

    public Integer mostCommon(Integer[] array) {
        return null;
    }
}
