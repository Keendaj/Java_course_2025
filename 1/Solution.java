/**
 * Старт моего проекта
 * @author Dmitriy Shevtsov
 * @version 1.0
 * @since 2025
 */
public class Solution {

    /**
     * @param args
     * @return void
     * @see Показывает пример для спецификаторов и inner классов
     */
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        
        OuterClass.PublicInner publicInner = outer.new PublicInner();
        publicInner.show();
        
        //OuterClass.ProtectedInner protectedInner = outer.new ProtectedInner(); // Ошибка компиляции
        
        //OuterClass.PackagePrivateInner packageInner = outer.new PackagePrivateInner(); // Ошибка компиляции

        //OuterClass.PrivateInner privateInner = outer.new PrivateInner(); // Ошибка компиляции
        
        outer.testInnerClasses();
    }
}