import java.io.*;
/**
 * Демонстрация работы со StringBuilder
 * @author Dmitriy Shevtsov
 * @version 1.0
 * @since 2025
 */
public class Solution {

    /**
     * @param args
     * @return void
     * @see Показывает пример работы с OutputStream 
     */
    public static void main(String[] args) {
         ByteArrayOutputStream output = new ByteArrayOutputStream();

        output.write(72);   
        output.write(101);  
        output.write(108);  
        output.write(108);  
        output.write(111);  
        output.write(32);   
        output.write(119);  
        output.write(111);  
        output.write(114);  
        output.write(108);  
        output.write(100);  
        output.write(33);   
        
        System.out.println(output.toString());
    }
}