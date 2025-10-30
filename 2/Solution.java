class A {
  int a;
  int b;
  int c;
  int z;

  public A() {
    this.z = 1;
  }

  public A(int a) {
    this();
    this.a = a;
  }

  public A(int a, int b) {
    this(a);
    this.b = b;
  }

  public A(int a, int b, int c) {
    this(a, b);
    this.c = c;
  }

}

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
     * @see Показывает примеры работы с super. 
     */
    public static void main(String[] args) {
        System.out.println("Done!");
    }
}