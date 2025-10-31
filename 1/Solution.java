import java.util.Formatter;
import java.util.Date;
/**
 * Демонстрация работы со StringBuilder
 * @author Dmitriy Shevtsov
 * @version 1.0
 * @since 2025
 */
public class Solution {
    static class AgeValidationException extends Exception {
        private final int enteredAge;

        public AgeValidationException() {
            super("Ошибка валидации возраста");
            this.enteredAge = 0;
        }

        public AgeValidationException(String message) {
            super(message);
            this.enteredAge = 0;
        }

        public AgeValidationException(String message, int age) {
            super(message);
            this.enteredAge = age;
        }

        public int getEnteredAge() {
            return enteredAge;
        }
}
    public static void validateAge(int age) throws AgeValidationException {
        if (age < 0) {
            throw new AgeValidationException("Возраст не может быть отрицательным", age);
        }
        if (age > 150) {
            throw new AgeValidationException("Возраст слишком большой", age);
        }
        System.out.println("Возраст корректен: " + age);
    }
    /**
     * @param args
     * @return void
     * @see Показывает пример работы с собственным исключением
     */
    public static void main(String[] args) {
        try {
            validateAge(25);  // OK
            validateAge(-5);  // Выбросит исключение
        } catch (AgeValidationException e) {
            System.out.println("Поймано AgeValidationException: " + e.getMessage() + ", с возрастом: " + e.getEnteredAge());
        }
    }
}