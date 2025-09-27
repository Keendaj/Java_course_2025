public class Solution {

    public static void main(String[] args){
        double a = 1.1;

        byte byteValue = 10;
        short shortValue = 1000;
        int intValue = 10000;

        System.out.println(a * byteValue);//Конвертация в double, т.к. он стоит выше всех в иерархии
        System.out.println(a * shortValue);//Конвертация в double, т.к. он стоит выше всех в иерархии
        System.out.println(a * intValue); //Конвертация в double, т.к. он стоит выше всех в иерархии
        System.out.println(1.1f * a); //Конвертация в double, т.к. он стоит выше всех в иерархии (это заметно т.к. у нас хранится слишком много знаков в том числе из-за повышенной точности double)
        System.out.println(byteValue * shortValue); // Конвертация в short т.к. short > byte и 10 000 не поместятся в byte
        System.out.println(byteValue * intValue);  // Конвертация в int т.к. int > byte и 100 000 не поместятся в byte
        System.out.println(shortValue * intValue);  // Конвертация в int т.к. int > short и 1 000 000 не поместится в short
    }
}