
/**
 * Старт моего проекта
 * @author Dmitriy Shevtsov
 * @version 1.0
 * @since 2025
 */
public class Solution {
    
    public enum TrafficLight {
        RED, YELLOW, GREEN;

        public String getAction() {
            switch (this) {
                case RED: return "СТОП";
                case YELLOW: return "ВНИМАНИЕ";
                case GREEN: return "ИДТИ";
                default: return "НЕИЗВЕСТНО";
            }
        }

        public TrafficLight getNext() {
            switch (this) {
                case RED: return GREEN;
                case GREEN: return YELLOW;
                case YELLOW: return RED;
                default: return RED;
            }
        }
    }

    /**
     * @param args
     * @return void
     * @see Показывает примеры работы с enum. 
     */
    public static void main(String[] args) {
        System.out.println("=== ПРИМЕР 1: Светофор ===");
        TrafficLight light = TrafficLight.RED;
        System.out.println("Сейчас: " + light + " - " + light.getAction());
        System.out.println("Следующий: " + light.getNext() + " - " + light.getNext().getAction());
    }
}