package Homework;

public class Homework1_task2 {
    public static void main(String[] args) {

        int number = 546;

        int e = number %10;
        int d = number /10 % 10;
        int s = number / 100;

        System.out.println(s);
        System.out.println(d);
        System.out.println(e);
        //System.out.println(""+s+d+e);

        /*String result = String.valueOf(s) + String.valueOf(d) + String.valueOf(e);
        System.out.println(result);*/



    }
}
