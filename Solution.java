class Chair{
    public void sit(){
        System.out.println("You've have sat on normal chair");
    }
}

class PyramidalChair extends Chair {
    @Override
    public void sit(){
        System.out.println("You've have sat on pyramidal chair.\nEuw, it hurts!");        
    }
}

public class Solution {
    public static void wannaSit(Chair chair)
    {
        System.out.println("I'm so tired, i wanna sit");
        chair.sit();
    }

    public static void main(String[] args) {
        PyramidalChair pyrChair = new PyramidalChair();

        wannaSit(pyrChair);

        Chair chair = new Chair();

        wannaSit(chair);
    }
}