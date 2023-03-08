package sortingAlgorithm;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(Object[] array){
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if(((Comparable) array[j + 1]).compareTo(array[j]) < 0){
                    Object aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
                count++;
            }
        }
        System.out.println("Count: " + count);
    }
    public static void main(String[] args) {
        String[] technologies = {"Programming Java", "Java Developer", "Spring Boot",
                "Spring Security", "Databases", "Design patterns", "Programming functional"};

        //more optimized bubble sort
        bubbleSort(technologies);
        Arrays.stream(technologies).forEach(System.out::println);

    }
}