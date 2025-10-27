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
     * @see Показывает все способо создания Boolean (new Boolean устарело и лучше не использовать)
     */
    public static void main(String[] args){
        Boolean b1 = Boolean.valueOf(true);

        boolean b2 = Boolean.parseBoolean("true"); //Проверяет, что передано именно true в любом регистре

        Boolean b3 = Boolean.valueOf("true");//Под капотом лежит вызов parseBoolean
        Boolean b4 = Boolean.valueOf("false");
        Boolean b5 = Boolean.valueOf("TRUE");
        Boolean b6 = Boolean.valueOf("rand");

        Boolean b7 = true; //Автоупаковка / boxing

        Boolean b8 = new Boolean("true"); //Под капотом лежит вызов parseBoolean
        Boolean b9 = new Boolean(true);

        System.out.println(b1 + ", " + b2 + ", " + b3 + ", " + b4 + ", " + b5 + ", " + b6 + ", " + b7+ ", " + b8 + ", " + b9);
    }
}