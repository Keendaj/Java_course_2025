import java.util.Arrays;
/**
 * Старт моего проекта
 * @author Dmitriy Shevtsov
* @verision 1.0
* @since 2025
 */
public class Solution {

    /**
     * @param args
     * @return void
     * @see Показывает использование некоторых методов java.util.Array
     */
    public static void main(String[] args){
        int[] arr1 = {5, 2, 8, 1, 3};
        int[] arr2 = {5, 2, 8, 1, 3};
        int[] arr3 = {1, 2, 3, 4, 5};

        System.out.println("arr1: " + Arrays.toString(arr1));

        System.out.println("arr1 равно arr2? " + Arrays.equals(arr1, arr2));
        System.out.println("arr1 равно arr3? " + Arrays.equals(arr1, arr3));

        int cmp1 = Arrays.compare(arr1, arr2);
        int cmp2 = Arrays.compare(arr1, arr3);
        System.out.println("Сравнение arr1 и arr2: " + cmp1); // 0  равенство
        System.out.println("Сравнение arr1 и arr3: " + cmp2); // 1 либо -1  разные (знак зависит от лексикографического порядка)

        Arrays.sort(arr1);
        System.out.println("arr1 после сортировки: " + Arrays.toString(arr1));

        int index = Arrays.binarySearch(arr1, 3);
        System.out.println("Индекс элемента 3 в arr1: " + index); //Только для отсортированных
    }
}