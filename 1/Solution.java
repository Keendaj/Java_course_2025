import java.util.List;

/**
 * Старт моего проекта
 * @author Dmitriy Shevtsov
* @verision 1.0
* @since 2025
 */
public class Solution {
    static class Wrapper<T> {
        private T item;

        public void setItem(T item) {
            this.item = item;
        }

        public T getItem() {
            return item;
        }
    }

    /**
     * @param obj
     * @return void
     * @see Показывает пример определения любого generic класса
     */
    public static void checkWrapper(Object obj) {
        if (obj instanceof Wrapper) {
            Wrapper wrapper = (Wrapper) obj;
            System.out.println("Это объект Wrapper");
        } else {
            System.out.println("Это не Wrapper");
        }
    }

    /**
     * @param wrapper
     * @return void
     * @see Показывает пример определения внутреннего типа Т
     */
    public static <T> void processWrapper(Wrapper<T> wrapper) {
        Object item = wrapper.getItem();
        
        if (item instanceof Integer) {
            Integer number = (Integer) item;
            System.out.println("Это число: " + (number * 2));
        } else if (item instanceof String) {
            String text = (String) item;
            System.out.println("Это строка, длина: " + text.length());
        } else if (item instanceof List) {
            System.out.println("Это список, размер: " + ((List) item).size());
        } else if (item == null) {
            System.out.println("Содержимое равно null");
        }
    }



     /**
     * @param args
     * @return void
     * @see Показывает примеры работы с instanceof для generic классов
     */
    public static void main(String[] args) {
        System.out.println("=== Пример 1: Проверка на 'сырой' тип ===");
        Wrapper<Integer> intWrapper = new Wrapper<>();
        intWrapper.setItem(42);
        checkWrapper(intWrapper);
        
        Wrapper<String> stringWrapper = new Wrapper<>();
        stringWrapper.setItem("Hello");
        checkWrapper(stringWrapper);
        
        Wrapper<Object> nullWrapper = new Wrapper<>();
        checkWrapper(nullWrapper);
        
        System.out.println("\n=== Пример 2: Проверка типа содержимого ===");
        Wrapper<Integer> numberWrapper = new Wrapper<>();
        numberWrapper.setItem(10);
        processWrapper(numberWrapper);
        
        Wrapper<List<String>> listWrapper = new Wrapper<>();
        listWrapper.setItem(List.of("a", "b", "c"));
        processWrapper(listWrapper);

    }
}
