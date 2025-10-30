class MyClass {
    private int id;
    private String name;
    
    public MyClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        MyClass other = (MyClass) obj;
        
        if (id != other.id) {
            return false;
        }

        if (name == null) {
            return other.name == null;
        } else {
            return name.equals(other.name);
        }
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
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
     * @see Показывает пример переопределния equals. 
     * Метод должен удовлетворять таким критериям:
     * 1) Симметричность
     * 2) Рефлексивность
     * 3) Транзитивность
     * 4) Согласованность
     * 5) Если null, то всегда false
     * 6) Согласованность с hashCode (если коды равны, то и equals выдаст true)
     */
    public static void main(String[] args) {
        MyClass obj1 = new MyClass(1, "Test");
        MyClass obj2 = new MyClass(1, "Test");
        MyClass obj3 = new MyClass(2, "Test");
        MyClass obj4 = new MyClass(1, "Other");
        
        System.out.println("obj1.equals(obj1): " + obj1.equals(obj1));
        System.out.println("obj1.equals(obj2): " + obj1.equals(obj2));
        System.out.println("obj2.equals(obj1): " + obj2.equals(obj1));
        System.out.println("obj1.equals(obj3): " + obj1.equals(obj3));
        System.out.println("obj1.equals(obj4): " + obj1.equals(obj4));
        System.out.println("obj1.equals(null): " + obj1.equals(null));

        System.out.println("\nobj1.hashCode(): " + obj1.hashCode());
        System.out.println("obj2.hashCode(): " + obj2.hashCode());
        System.out.println("obj3.hashCode(): " + obj3.hashCode());
        
        System.out.println("\nСогласованность equals и hashCode:");
        System.out.println("obj1.equals(obj2) && obj1.hashCode() == obj2.hashCode(): " + 
                          (obj1.equals(obj2) && obj1.hashCode() == obj2.hashCode()));
    }
}