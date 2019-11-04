package com.zipcodewilmington.assessment2.part2;

import java.util.LinkedHashMap;
import java.util.Map;

public class Router {
    private Map map;

    public Router(){
        this.map = new LinkedHashMap();
    }
    public void add(String path, String controller) {
        map.put(path, controller);
    }

    public Integer size() {

        return map.size();
    }

    public String getController(String path) {

        return null;
    }

    public void update(String path, String studentController) {
        map.replace(path, studentController);
    }

    public void remove(String path) {
        map.remove(path);
    }
}
