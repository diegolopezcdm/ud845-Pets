package com.example.android.pets;

/**
 * Created by diegolopez on 1/4/18.
 */

public class Deletme extends Deletme2{

    public static final Integer id =55;

    public Deletme() {

    }

    @Override
    public Integer getDni() {
        return super.getDni();
    }

    void helloworld(){
        getDni();
        System.out.print(true);
    }

    public static void main(String[]args){
        Integer dd =new Deletme2().getDni();
        System.out.println(dd);
        //test1();
        Deletme2.dni = 46844382;

        Deletme2 ff = new Deletme2();
        System.out.println(ff.getDni());



    }

    private static void test1() {
        String test1= "diego lopez";
        String test2="diegolopez";
        String test3="diego lopez";

        //System.out.println(test1.equals(test2));
        //System.out.println(test1.equals(test3));

        //System.out.println(test1.contentEquals(test2));
        //System.out.println(test1.contentEquals(test3));

        System.out.println
                ("====================================");

        Object obj;
        obj = new Object();

        Integer test4= 355;
        Integer test5=356;
        Integer test6=355;

        Integer test8= new Integer(355);
        Integer test9= new Integer(355);
        int iii;

        System.out.println(test4.equals(test5));
        System.out.println(test4.equals(test6));
        System.out.println(test4==test6);

        System.out.println(test4==test6);
        System.out.println(test8==test9);

        Integer x = 10;
        Integer y = 10;

        System.out.println(x == y);
        System.out.println(x.equals(y));
    }
}
