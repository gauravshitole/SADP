class Eager{
    private static Eager ins=new Eager();

    private Eager(){
        System.out.println("Hello world");
    }

    public static Eager getins(){
        return ins;
    }
}

public class singleton{
    public static void main(String[] args){
        Eager e1=Eager.getins();
       Eager e2=Eager.getins();
       Eager e3=Eager.getins();
    }
}