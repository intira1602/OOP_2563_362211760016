package LAB2;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class BasicDataType {
    public static void main(String[] args) {
        //boolean => T,F (1,0)
        boolean myboo = true;
        System.out.println(myboo);

        //character => only 1 character auc aa'a','x','a'
        char c = 'a';
        System.out.println(c);

        //integer => -2 -1 0 1 2 3 ... 1000
        int number;
        number = 100;
        System.out.println(number); //100
        System.out.println(number*5); //500
        //number = ? 100

        //real number => float,double => 10.11. -22.1
        float a = 10.10f;
        double b  = 20.20;
        System.out.println(a+b);

        //String => massage => "..." => "Hello"
        //String คือ ข้อมูลชนิดแบบความ ที่มีตัวอักษรต่อเรียงกัน

        String mag = "Hello RUTS Saiyai 2020";
        System.out.println(mag);
        System.out.println(mag.length());

        //constant variable

        final int num = 100;


    }

}
