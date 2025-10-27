/**
 * Старт моего проекта
 * @author Dmitriy Shevtsov
* @verision 1.0
* @since 2025
 */
public class Solution {

    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    /**
     * @param args
     * @return void
     * @see Показывает все возможные типы в switch
     */
    public static void main(String[] args){
        int value = 2;
        int i = 0;
        switch (value) {
            case 1:
                i = 10;
                break;
            case 2:
                i = 20;
                break;
            default:
                i = 30;
        }
        System.out.println("int switch result: " + i);

        byte b = 1;
        String resultB = "";
        switch (b) {
            case 1:
                resultB = "Byte is 1";
                break;
            case 2:
                resultB = "Byte is 2";
                break;
            default:
                resultB = "Byte default";
        }
        System.out.println(resultB);

        char c = 'A';
        String resultC = "";
        switch (c) {
            case 'A':
                resultC = "Char is A";
                break;
            case 'B':
                resultC = "Char is B";
                break;
            default:
                resultC = "Char default";
        }
        System.out.println(resultC);

        short s = 10;
        String resultS = "";
        switch (s) {
            case 5:
                resultS = "Short is 5";
                break;
            case 10:
                resultS = "Short is 10";
                break;
            default:
                resultS = "Short default";
        }
        System.out.println(resultS);

        String color = "red";
        String resultColor = "The color is ";
        switch(color) {
            case "red":
                resultColor += "Red";
                break;
            case "blue": 
                resultColor += "Blue";
                break;
            default: 
                resultColor += "Strange";
                break;
        }
        System.out.println(resultColor);

        Day today = Day.WEDNESDAY;

        String message = "Today ";
        switch (today) {
            case MONDAY:
                message += "Monday";
                break;
            case TUESDAY:
                message += "Tuesday";
                break;
            case WEDNESDAY:
                message += "Wednesday";
                break;
            case THURSDAY:
                message += "Thursday";
                break;
            case FRIDAY:
                message += "Friday";
                break;
            case SATURDAY:
                message += "Saturday!";
                break;
            case SUNDAY:
                message += "Sunday!";
                break;
            default:
                message += "UnknownDay";
        }

        System.out.println(message);
    }
}