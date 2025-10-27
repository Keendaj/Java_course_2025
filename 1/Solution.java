class A1 {
    public final int a = 10; // сразу присвоили значение

    public void print() {
        System.out.println(a);
    }
}

class A2 {
    public final int a;

    public A2(int value) {
        this.a = value; // инициализация через конструктор
    }

    public void print() {
        System.out.println(a);
    }
}

class A3 {
    public final int a;

    // нестатический блок инициализации
    {
        a = 7;
    }

    public void print() {
        System.out.println(a);
    }
}

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
     * @see Показывает все варианты инициализации final переменной
     */
    public static void main(String[] args) {
        A1 a1 = new A1();
        A2 a2 = new A2(3);
        A3 a3 = new A3();
        a1.print();
        a2.print();
        a3.print();
    }
}
