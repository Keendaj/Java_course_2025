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
     */
    public static void main(String[] args){
        int a = 10, b = 3;
        
        // = (присваивание)
        int result = a; // result = 10
        
        // +=, -=, *=, /=, %=
        a += 5;      // a = a + 5 → 15
        b -= 1;      // b = b - 1 → 2
        a *= 2;      // a = a * 2 → 30
        a /= 3;      // a = a / 3 → 10
        a %= 4;      // a = a % 4 → 2

        //?:
        //a = 0;
        System.out.println((a > 0) ? "Есть остаток" : "Нет остатка");

        a = 10;
        b = 3;
        System.out.println((a > 5) || (b < 2)); //a > 5 -> true, b < 2 -> false; true || false -> true
        System.out.println((a > 5) && (b < 2)); //a > 5 -> true, b < 2 -> false; true && false -> false
        
        a = 5; // 101
        b = 3; // 011

        System.out.println(a | b); // b'101' | b'011' = b'111' = 7 - побитовое или
        System.out.println(a & b); // b'101' | b'011' = b'001' = 1 - побитовое и
        System.out.println(a ^ b); // b'101' | b'011' = b'110' = 6 - побитовый XOR

        a = 10;
        b = 5;
        double x = 10.0;
        
        // == (равенство)
        System.out.println(a == b);   // false
        System.out.println(a == x);   // true (10 == 10.0)
        
        // >, >=, <, <=
        System.out.println(a > b);    // true
        System.out.println(a >= x);   // true
        System.out.println(a < b);    // false
        System.out.println(a <= 10);  // true

        a = 16; // 10000 

        // << (сдвиг влево)
        System.out.println(a << 2);  // 1000000 → 64 (умножение на 4 / сдвиг влево на 2 бита)
        
        // >> (арифметический сдвиг вправо)
        System.out.println(a >> 2); // 100 → 4 (деление на 4 / сдвиг вправо на 2 бита)
        
        // >>> (логический сдвиг вправо)
        System.out.println(a >>> 2); // 00100 → 4 (Сдвиг плюс заполнение слева таким же количеством нулей, полвияет только на отрицательные числа)


        a = 10;
        b = 5;
        
        // + (сложение)
        System.out.println(a + b); // 10 + 5 -> 15
        
        // - (вычитание)
        System.out.println(a - b); // 10 - 5 -> 5
        
        // * (умножение)
        System.out.println(a * b); // 10 * 5 -> 50
        
        // / (деление)
        System.out.println(a / 3); // 3 (целочисленное деление)
        
        // % (остаток от деления)
        System.out.println(a % b); // 0 (Остаток от целочисленного деления)

        a = 10;
        //++ и --
        System.out.println(a++); // print -> 10; a -> 11
        System.out.println(++a); // print -> 12; a -> 12
        System.out.println(--a); // print -> 11; a -> 11
        System.out.println(a--); // print -> 11; a -> 10

        a = 5;    // 00000101
        System.out.println(~a); // 11111010 → -6 инвертируем биты (битовое не)
        System.out.println(!true); // Инвертируем boolean (логическое не)

        //()
        a = 5;
        b = 3;
        int c = 2;
        
        // Без скобок (следование приоритету)
        System.out.println(a + b * c);     // 5 + (3 * 2) = 11
        System.out.println(a * b + c);     // (5 * 3) + 2 = 17
        
        // Со скобками (изменение порядка)
        System.out.println((a + b) * c);   // (5 + 3) * 2 = 16
        System.out.println(a * (b + c));   // 5 * (3 + 2) = 25


        //[]
        int[] array = {1, 2, 3, 4, 5};

        System.out.println(1 + array[1]); // 1 + 2 = 3 Всегда вначале обращаемся к элементу массива

        //Строки
        System.out.println("123" + "456" + "789" + "0"); // 1234567890
        
        String str = "Hello";
        str += "world!";

        System.out.println(str);
    }
}