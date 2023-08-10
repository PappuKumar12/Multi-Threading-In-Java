import java.util.*;

class MyThread1 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<=1000){
            System.out.println("I am running MyThread-1 now!!");
            i++;
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<=100){
            System.out.println("I am running MyThread-2 now!!");
            i++;
        }
    }
}

public class ThreadClass{

    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.start();
        t2.start();
    }
}