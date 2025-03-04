package FirstStep;

public class Main {
    static int a=10;
    static int b=5;

    public static void main(String[] args) {

        int x=6,int y=53;
        System.out.println("Hello world!");

        int add=a+b;
        int mul=a*b;
        int sub=a-b;
        int div=a/b;


        System.out.println(add+" "+mul+" "+sub+" "+div);

        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;

        System.out.println(max+" "+ min);


        /*
        * Wrapper Class
        * a wrapper class provide simple operations, as well as
        * some basic information about the primite data type which cannot be stored
        * on primitive itself
        * eg MIX MAX of Integer
        * */

        var ab= 23L;//23l is also work

        System.out.println(ab+" "+ ((Object)ab).getClass().getName());

    }







}