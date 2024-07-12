package org.example;

import java.util.Arrays;
import java.util.Optional;

public class StreamSearch {
    public static <T> T findElement(T[] array, T value){
        Optional<T> foundElement = Arrays.stream(array)
                .filter(e -> e.equals(value))
                .findFirst();
        return foundElement.orElse(null);
    }
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"elma", "armut", "portakal"};

        Integer intResult = findElement(intArray, 3); // Output: 3
        String strResult = findElement(strArray, "muz"); // Output: banana
        Integer intNotFoundResult = findElement(intArray, 75); // Output: -1
        String strNotFoundResult = findElement(strArray, "vişne"); // Output: -1

        System.out.println(intResult != null ? intResult : -1);
        System.out.println(strResult != null ? strResult : -1);
        System.out.println(intNotFoundResult != null ? intNotFoundResult : -1);
        System.out.println(strNotFoundResult != null ? strNotFoundResult : -1);
    }
}
