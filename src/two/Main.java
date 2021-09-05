package two;

import java.util.Arrays;

public class Main {
    /*
     * array [1,2,3,4,5]
     * rubah jadi [3, 5, 7, 9]
     * penjelasanya
     * 3 dapet dari 1 + 2,
     * 5 dapet dari 2+3
     * 7 dapet dari 3 + 4
     * 9 dapet dari 4 + 5
     * */
    public static void main(String[] args) {
        var numbers = new int[]{1, 2, 3, 4, 5};
        var results = new int[numbers.length-1];

        for (int i = 0; i < numbers.length-1; i++) {
            results[i] = numbers[i] + numbers[i+1];
        }

//        for (int i = 1; i < numbers.length; i++) {
//            results[i-1] = numbers[i-1] + numbers[i];
//        }

        System.out.println(Arrays.toString(results));
    }

}
