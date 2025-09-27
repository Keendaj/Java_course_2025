import java.util.*;

public class Solution {

    public static void main(String[] args){
        var str = "Hello world!";//Type interface - возможность Java самой определять тип переменной, реализовано через var, аналог auto из C++        
        var integer = 95;
        var doubleNum = 1.1;
        var longNum = 95L;
        var bool = true;

        System.out.println(str.getClass());
        System.out.println(((Object)integer).getClass());
        System.out.println(((Object)doubleNum).getClass());
        System.out.println(((Object)longNum).getClass());
        System.out.println(((Object)bool).getClass());
    }
}