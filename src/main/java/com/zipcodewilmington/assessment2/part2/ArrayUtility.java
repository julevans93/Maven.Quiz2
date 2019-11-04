package com.zipcodewilmington.assessment2.part2;

import com.sun.deploy.util.ArrayUtil;
import sun.awt.image.ImageWatched;

import java.util.Arrays;
import java.util.LinkedList;


public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        return null;
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
        return null;
    }

    public Integer mostCommon(Integer[] array) {
        return null;
    }
}
