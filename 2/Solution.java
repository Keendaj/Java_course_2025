class Chair {
    public void sit(){
        System.out.println("Sit on normal chair");
    }
}

class PyramidalChair extends Chair {
    @Override
    public void sit(){
        System.out.println("Sit on pyramidal chair");
    }

    public void pyramidalSit(){
        System.out.println("Amazing pyramidal chair");
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
     */
    public static void main(String[] args){
        Chair chair1 = new Chair();
        Chair chair2 = new PyramidalChair();

        System.out.println(chair1 instanceof Chair); // true
        System.out.println(chair2 instanceof PyramidalChair); //true

        if(chair1 instanceof PyramidalChair){
            System.out.println("Chair");
            ((PyramidalChair)chair1).pyramidalSit(); //Ничего т.к. chair1 это Chair - родитель PyramidalChair
        }

        if(chair2 instanceof PyramidalChair){ //Буквально PyramidalChair
            System.out.println("PyramidalChair");
            ((PyramidalChair)chair2).pyramidalSit();
        }

        chair2 = null;
        System.out.println(null instanceof Chair); // false
        System.out.println(chair2 instanceof Chair); //false -> можно использовать также как проверку на null

    }
}