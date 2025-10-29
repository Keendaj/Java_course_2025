import java.util.ArrayList;
import java.util.List;

/**
 * Старт моего проекта
 * @author Dmitriy Shevtsov
 * @version 1.0
 * @since 2025
 */
public class Solution {
    
    static class ExtendsExample<T extends Comparable<T>> {
        private T item;

        public void setItem(T item) {
            this.item = item;
        }

        public T getItem() {
            return item;
        }

        public static <T extends Comparable<T>> T getMaxFlexible(List<? extends T> list) {
            if (list == null || list.isEmpty()) return null;
            T max = list.get(0);
            for (T item : list) {
                if (item.compareTo(max) > 0) max = item;
            }
            return max;
        }
    }

    static class SuperExample<T> {
        private T item;
        
        public void setItem(T item) {
            this.item = item;
        }

        public T getItem() {
            return item;
        }

        public static <T> void copyFlexible(List<? super T> dest, List<? extends T> src) {
            for (T item : src) {
                dest.add(item);
            }
        }
    }
    /**
     * @param args
     * @return void
     * @see Показывает примеры работы <? extends T> и <? super T>. 
     * Они нужны для того, чтобы созданный generic класс мог работать со всей иерархией наследования, а не с конкретным T, там где это надо
     */
    public static void main(String[] args) {
        System.out.println("=== ДЕМОНСТРАЦИЯ===");
        
        List<Integer> integers = List.of(1, 2, 3);
        List<Double> doubles = List.of(1.5, 2.5, 3.5);
        
        List<Number> numbers = new ArrayList<>();
        List<Object> objects = new ArrayList<>();

        System.out.println("\n=== <? extends T> ===");

        Number max1 = ExtendsExample.getMaxFlexible(integers);
        Number max2 = ExtendsExample.getMaxFlexible(doubles);
        System.out.println("Результат: " + max1 + ", " + max2);


        System.out.println("\n=== <? super T> ===");
        
        SuperExample.copyFlexible(numbers, integers);
        SuperExample.copyFlexible(objects, integers);
        System.out.println("Результат - numbers: " + numbers);
        System.out.println("Результат - objects: " + objects);
    }
}