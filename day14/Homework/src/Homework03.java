import javax.sound.midi.Soundbank;

/*3、在程序中经常要对时间进行操作但是并没有时间类型的数据。
        那么我们可以自己实现一个时间类来满足程序中的需要。
        定义名为MyTime的类其中应有三个整型成员时hour分minute秒second
        为了保证数据的安全性这三个成员变量应声明为私有。
        为MyTime类定义构造方法以方便创建对象时初始化成员变量。
        再定义diaplay方法用于将时间信息打印出来。
        为MyTime类添加以下方法
        addSecond(int sec)
        addMinute(int min)
        addHour(int hou)
        subSecond(int sec)
        subMinute(int min)
        subHour(int hou)
        分别对时、分、秒进行加减运算。*/
public class Homework03 {
    public static void main(String[] args) {
        MyTime m = new MyTime(12,0,0);
       // m.addMinute(40);
        //m.addSecond(30);
       // m.display();
        //m.subHour(24);
        m.subMinute(10);
        m.display();
    }
}

class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime() {
    }

    public MyTime(int hour, int minute, int second) {
        if (hour < 24 && hour >= 0) {
            this.hour = hour;
        } else { return; }
        if (minute < 60 && minute >= 0) {
            this.minute = minute;
        } else { return; }
        if (second < 60 && second >= 0) {
            this.second = second;
        } else { return; }
        System.out.println("初始化时间是：" + getHour() + "时" + getMinute() + "分" + getSecond() + "秒");
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    public void addSecond(int sec) {
        int sum;
        int carry;
        sum = sec + getSecond();
        carry = sum / 60;
        sum = sum % 60;
        setSecond(sum);
        addMinute(carry);
        //System.out.println("时间过去" + carry + "分" + sum + "秒");
    }
    public void addMinute(int min) {

        int sum;
        int carry;
        sum = min + getMinute();
        carry = sum / 60;
        sum = sum % 60;
        setMinute(sum);
        addHour(carry);
        //System.out.println("时间过去" + carry + "小时" + sum + "分");
    }
    public void addHour(int hou) {

        int sum = hou + getHour();
        sum = sum % 24;
        setHour(sum);
        //System.out.println("时间过去" + hou + "小时");
    }
    public void subSecond(int sec) {

        int sum;
        int carry;
        carry = sec / 60;
        sec = sec % 60;
        if (sec <= getSecond()) {
            sum = getSecond() - sec;
        }else {
            sum = 60 + getMinute() - sec;
            carry += 1;
        }
        setSecond(sum);
        subMinute(carry);
        //System.out.println("时间倒流" + carry + "分" + sum + "秒");
    }

    public void subMinute(int min){

        int sum;
        int carry;
        carry = min / 60;
        min = min % 60;
        if (min <= getMinute()) {
            sum = getMinute() - min;
        }else {
            sum = 60 + getMinute() - min;
            carry += 1;
        }
        setMinute(sum);
        subHour(carry);
        //System.out.println("时间倒流" + carry + "小时" + sum + "分");
    }
    public void subHour(int hou){

        int sum;
        if (hou <= getHour()) {
            sum = getHour() - hou;
        }else {
            sum = (hou - getHour()) % 24;
        }
        setHour(sum);
        //System.out.println("时间倒流" + hou + "小时");
    }

    public void display() {
        System.out.println("现在时间是：" + getHour() + "时" + getMinute() + "分" + getSecond() + "秒");
    }
}


