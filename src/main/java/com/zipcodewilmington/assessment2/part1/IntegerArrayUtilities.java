package com.zipcodewilmington.assessment2.part1;

import java.util.Arrays;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {

        return array.length % 2 == 0;
    }

    public Integer[] range(int start, int stop) {
        Integer[] array = new Integer[start-stop];

        return array;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {

        return array[0] + array[1];
    }

    public Integer getProductOfFirstTwo(Integer[] array) {

        return array [array.length-1] * array[array.length-2];
    }
}
