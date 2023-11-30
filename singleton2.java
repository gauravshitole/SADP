class singleton2{
    public static void main(String args[])
    {
        Lazy l1=Lazy.getins();
       Lazy l2=Lazy.getins();
       Lazy l3=Lazy.getins();
    }
}
class Lazy{
    private static Lazy ins;
    private Lazy()
    {
        System.out.println("Hello world");
    }

    public static Lazy getins()
    {
        if(ins == null)
            ins = new Lazy();

        return ins;    
    }
}

