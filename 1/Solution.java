
/**
 * Старт моего проекта
 * @author Dmitriy Shevtsov
 * @version 1.0
 * @since 2025
 */
public class Solution {
    
    public enum CoffeeSize {
        SMALL(200, 100),
        MEDIUM(300, 150), 
        LARGE(500, 200);

        private final int ml;
        private final int price;

        CoffeeSize(int ml, int price) {
            this.ml = ml;
            this.price = price;
        }

        public int getMl() {
            return ml;
        }

        public int getPrice() {
            return price;
        }
    }

    public enum Color {
        RED, GREEN, BLUE, YELLOW, BLACK, WHITE
    }

    /**
     * @param args
     * @return void
     * @see Показывает примеры работы с enum. 
     */
    public static void main(String[] args) {
        System.out.println("\n=== ПРИМЕР 1: обычный enum ===");
        Color favoriteColor = Color.BLUE;
        System.out.println("Мой любимый цвет: " + favoriteColor);
        
        for (Color color : Color.values()) {
            System.out.println("Цвет: " + color);
        }

        System.out.println("=== ПРИМЕР 2: enum с заданными значениями ===");
        CoffeeSize myCoffee = CoffeeSize.LARGE;
        System.out.println("Мой кофе: " + myCoffee + " - " + myCoffee.getMl() + " мл, " + myCoffee.getPrice() + " руб.");
        
        for (CoffeeSize size : CoffeeSize.values()) {
            System.out.println(size + ": " + size.getMl() + " мл, " + size.getPrice() + " руб.");
        }
    }
}