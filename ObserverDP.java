import java.util.ArrayList;
interface Observer
{
    void update(String msg);
}
class User1 implements Observer
{
    public void update(String msg)
    {
        System.out.println("User1:"+msg);
    }
}
class User2 implements Observer
{
    public void update(String msg)
    {
        System.out.println("User2:"+msg);
    }
}
class User3 implements Observer
{
    public void update(String msg)
    {
        System.out.println("User3:"+msg);
    }
}
interface Subject
{
    void registerObserver(Observer o);
    void unregisterObserver(Observer o);
    void notifyObserver(String msg);
}
class YoutubeChannel1 implements Subject 
{
    ArrayList<Observer> ol;
    YoutubeChannel1()
    {
        ol=new ArrayList<Observer>();
    }
    public void registerObserver(Observer o)
    {
        ol.add(o);
    }
    public void unregisterObserver(Observer o)
    {
        int index=ol.indexOf(o);
        if(index==0)
        {
            ol.remove(index);
        }
    }
    public void notifyObserver(String msg)
    {
        for(Observer o:ol)
        {
            o.update(msg);
        }
    }
    void newVideoAdded(String msg)
    {
        notifyObserver(msg);
    }
}
class YoutubeChannel2 implements Subject
{
    ArrayList<Observer> ol;
    YoutubeChannel2()
    {
        ol=new ArrayList<Observer>();
    }
    public void registerObserver(Observer o)
    {
        ol.add(o);
    }
    public void unregisterObserver(Observer o)
    {
        int index=ol.indexOf(o);
        if(index==0)
        {
            ol.remove(index);
        }
    }
    public void notifyObserver(String msg)
    {
        for(Observer o:ol)
        {
            o.update(msg);
        }
    }
    void newVideoAdded(String msg)
    {
        notifyObserver(msg);
    }
}
class ObserverDP
{
    public static void main(String args[])
    {
        YoutubeChannel1 yc1=new YoutubeChannel1();
        YoutubeChannel2 yc2=new YoutubeChannel2();
        User1 u1=new User1();
        User2 u2=new User2();
        User3 u3=new User3();
        yc1.registerObserver(u1);
        yc1.registerObserver(u2);
        yc2.registerObserver(u1);
        yc2.registerObserver(u2);
        yc2.registerObserver(u3);
        yc1.newVideoAdded("Video 1 added in channel 1");
        yc2.newVideoAdded("Video 5 added in channel 2");
    }
}