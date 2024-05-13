package OOPS;

class time
{
    int hr;
    int min;

    public time(int hr,int min){
        this.hr = hr;
        this.min = min;

    }
    public time()
    {

    }
    void show()
    {
        System.out.println(hr+ ": " +min);
    }
    public time addTime(time t1, time t2)
    {
        time t3 = new time();
        int minutes = t1.min+t2.min;
        int q = minutes/60;
        int r =minutes%60;
        int hour = (t1.hr+t2.hr)+q;
        int r2 = hour%24;
        t3.hr=r2;
        t3.min=r;
        return t3;
    }
}
public class Clock {
    public static void main(String[] args) {
        
        time t1 = new time(4, 25);
        time t2 = new time(5, 25);
        t1.show();
        t2.show();
        time t3  = t1.addTime(t1, t2);
        t3.show();
    }
}
