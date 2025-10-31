import java.util.StringJoiner;

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
     * @see Показывает пример преобразований
     */
    public static void main(String[] args) {
        System.out.println("=== Преобразования ===");
        
        // 1. String -> StringBuilder
        String str = "Привет";
        StringBuilder sb = new StringBuilder(str);
        sb.append(" мир!");
        System.out.println("String -> StringBuilder: " + sb);
        
        // 2. String -> StringBuffer  
        StringBuffer buffer = new StringBuffer(str);
        buffer.append(" все!");
        System.out.println("String -> StringBuffer: " + buffer);
        
        // 3. StringBuilder -> String
        StringBuilder sb2 = new StringBuilder("Java");
        String result1 = sb2.toString();
        System.out.println("StringBuilder -> String: " + result1);
        
        // 4. StringBuffer -> String
        StringBuffer buffer2 = new StringBuffer("Programming");
        String result2 = buffer2.toString();
        System.out.println("StringBuffer -> String: " + result2);
        
        // 5. StringBuilder -> StringBuffer (через String)
        StringBuilder sb3 = new StringBuilder("Hello");
        String temp = sb3.toString();
        StringBuffer buffer3 = new StringBuffer(temp);
        System.out.println("StringBuilder -> StringBuffer: " + buffer3);
        
        // 6. StringBuffer -> StringBuilder (через String)
        StringBuffer buffer4 = new StringBuffer("World");
        String temp2 = buffer4.toString();
        StringBuilder sb4 = new StringBuilder(temp2);
        System.out.println("StringBuffer -> StringBuilder: " + sb4);
    }
}