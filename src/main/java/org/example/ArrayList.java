package org.example;

import java.util.Arrays;

public class ArrayList {
    public static <T> T findElement(T[] array, T value){
        return Arrays.stream(array)
                .filter(e -> e.equals(value))
                .findFirst()
                .orElse(null);
    }
    public static void main(String[] args){
        Integer[] intArray = {1,2,3,12,14,15};
        String[] stringArray = {"elma", "armut", "portakal"};

        Integer intResult = findElement(intArray,3);
        Integer intNotFoundResult = findElement(intArray, 25);
        String stringResult = findElement(stringArray,"elma");
        String stringNotFoundResult = findElement(stringArray,"kiraz");
    }
}
