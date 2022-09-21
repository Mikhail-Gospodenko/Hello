public class Hello {
        public static void main (String[]args){

        // задание 2
        int i = 1234;
        short sh = 312;
        long l = 1231234324;

        double dou = 235.35;
        float f = 2345.47f;

        char ch = 'a';
        boolean bool = false;

        byte bt = 100;

        System.out.println("Int is " + +i);
        System.out.println("Short is " + sh);
        System.out.println("Long is " + l);
        System.out.println("Double is " + dou);
        System.out.println("Float is " + f);
        System.out.println("Char is " + ch);
        System.out.println("Boolean is " + bool);
        System.out.println("Byte is " + bt);

        // задание 3
        int a, b, c, d, result;
        a = 123;
        b = 672;
        c = 1290;
        d = 12;
        result = a * (b + (c / d));
        System.out.println("Answer is " + result);

        // задание 4
                boolean b1 = true;
                boolean b2 = false;
                int myint = 12;
                int myint1 = 21;
        if (((myint>10) && (myint<=20)) && (myint1>10) && (myint1<=20)) {
                System.out.println(b1);
            } else {
                System.out.println(b2);
            }

        // задание 5
                int in = -5;
        if (in>=0){
                System.out.println("Число положительное");
        } else {
                System.out.println("Число отрицательное");
        }
        // задание 6
                int otr = -2;
                boolean b3 = true;
        if(otr<0){
                System.out.println(b3);
        }
        // задание 7
                String n = "Михаил";
                String h = "Привет, ";
                String end = "!";
                System.out.println( h + n + end);

                // задание 8
                double year, q, w, e, res1, res2, res3;
                year = 2024;
                q = 4;
                w = 100;
                e = 400;
                res1 = year / w;
                res2 = year / q;
                res3 = year / e;
                if((res2 % 1 ==0 && res1 % 1 != 0 )||(res2 % 1 ==0 && res1 % 1 == 0 && res3 % 1 ==0)) {
                        System.out.println("Год високосный");
                } else {
                        System.out.println("Год не високосный");
                }
                }

    }
