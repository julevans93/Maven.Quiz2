package com.zipcodewilmington.assessment2.part2;

import com.sun.deploy.util.ArrayUtil;
import com.sun.tools.javac.util.ArrayUtils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListUtility {
    List<Integer> list;

    public ListUtility(){
        this.list = new LinkedList<>();
    }
    public Boolean add(Integer i) {
        return null;
    }

    public Integer size() {
        return list.size();
    }

    public List<Integer> getUnique() {
        List<Integer> result = new LinkedList<>();
        for (Integer x : list){
            if(!result.contains(x)) {
                result.add(x);
            }
        }
        return result;
    }

    public String join() {
        StringBuilder result = new StringBuilder();
        int counter =1;
        for (Integer x : list) {
            if (counter == list.size()) {
                result.append(String.valueOf(x));}
                else result.append(String.format("%d, ", x));
                counter++;
            }
        return result.toString();
    }

    public Integer mostCommon() {
        return null;
    }

    public Boolean contains(Integer valueToAdd) {
        return list.contains(valueToAdd);
    }
}
