package br.com.bernardolobato;

import java.util.Arrays;
import java.util.Scanner;

public final class App {
    private App() {
    }

    private static int GREAT_NUMBER_ALLOWED = 100000000;
    private static int[] insertionSortReverse(int[] arr) {
        int[] ret = Arrays.copyOf(arr, arr.length);

        for (int i = 1; i < ret.length; i++) {
            int valueToSort = ret[i];
            int j = i;
            while (j > 0 && ret[j - 1] < valueToSort) {
                ret[j] = ret[j - 1];
                j--;
            }
            ret[j] = valueToSort;
        }
        return ret;
    }
    private static int[] convertToIntArray(Integer input) {
        char[] tempCharArray = input.toString().toCharArray();
        int[] num = new int[tempCharArray.length];
        
        for (int i = 0; i < tempCharArray.length; i++){
            num[i] = tempCharArray[i] - '0';
        }
        return num;
    }

    public static int greaterBrotherNumber(Integer i) {
        if (i > App.GREAT_NUMBER_ALLOWED) {
            return -1;
        }
        if (i <=0 ) {
            throw new RuntimeException("Apenas números inteiros maiores que 0 são permitidos");
        }
        int[] intAsArray = App.convertToIntArray(i);        
        intAsArray = App.insertionSortReverse(intAsArray);
        String strArray[] = Arrays.stream(intAsArray)
								.mapToObj(String::valueOf)
                                .toArray(String[]::new);
                                
        String joined = String.join("", strArray);
        return Integer.parseInt(joined);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um número inteiro e não negativo: ");
        int n = s.nextInt();
        System.out.println("Resultado do maior número irmão de " + n + ": "+ App.greaterBrotherNumber(n));
        s.close();
    }
}
