package one;

import java.util.Arrays;

public class Main {
    /*
     * int array1 = [3,2,5,0,12];
     * int array2 = [11,9,7,8,54];
     * gabungankan ke 2 array tersebut jadi 1 array dan sorting dari terendah ke yg terbesar
     * */
    public static void main(String[] args) {
        int[] array1 = new int[]{3, 2, 5, 0, 12};
        int[] array2 = new int[]{11, 9, 7, 8, 54};
        int[] newArray = new int[array1.length + array2.length];
        int x = 0;

        for (int j : array1) {
            newArray[x] = j;
            x++;
        }

        for (int i : array2) {
            newArray[x] = i;
            x++;
        }

        System.out.println("Sebelum diurut:");
        System.out.println(Arrays.toString(newArray));
        sortArray(newArray);
        System.out.println("Setelah diurut:");
        System.out.println(Arrays.toString(newArray));
        var arr = new int[]{3,2,1};
        sortArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sortArray(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j <= arr.length - 1; j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void solutionB2camp() {
        int[] array1 = new int[]{3, 2, 5, 0, 12};
        int[] array2 = new int[]{11, 9, 7, 8, 54};
        int[] newArray = new int[array1.length + array2.length];

        int i = 0;
        while (i < array1.length) {
            newArray[i] = array1[i];
            i++;
        }

        int j = 0;
        while (j < array2.length) {
            newArray[i] = array2[j];
            j++;
            i++;
        }

        int value;
        for (int x = 0; x < newArray.length; x++) {
            for (int z = x + 1; z < newArray.length; z++) {
                if (newArray[x] > newArray[z]) {
                    value = newArray[x];
                    newArray[x] = newArray[z];
                    newArray[z] = value;
                }
            }
        }

        System.out.println(Arrays.toString(newArray));
    }
}
