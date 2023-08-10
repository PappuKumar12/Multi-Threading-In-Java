import java.util.*;

class MyRunnable1 implements Runnable{
    public void run(){
        int i = 0;
        while(i<=1000){
            System.out.println("I am Running RunnableClass-1 now!!");
            i++;
        }
    }
}

class MyRunnable2 implements Runnable{
    public void run(){
        int i = 0;
        while(i<=1000){
            System.out.println("I am Running RunnableClass-2 now!!");
            i++;
        }
    }
}
public class RunnableClass {
    public static void main(String[] args) {
        MyRunnable1 bullet1 = new MyRunnable1();
        MyRunnable2 bullet2 = new MyRunnable2();

        Thread gun1 = new Thread(bullet1, "Runnable1");
        Thread gun2 = new Thread(bullet2, "Runnable2");

        gun1.start();
        gun2.start();
    }
}
