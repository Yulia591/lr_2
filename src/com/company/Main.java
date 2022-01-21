package com.company;
public class Main {
    public static void main(String[] args) {
        int i = 35;
        Integer.toString(i);
        String str = Integer.toString(i);
        System.out.println(str);

        double i1 = 32.4e10;
        String str1 = Double.toString(i1);
        System.out.println(str1);

        long i2 = 3422222;
        String str2 = Long.toString(i2);
        System.out.println(str2);

        float i3 = 3.46f;
        String str3 = Float.toString(i3);
        System.out.println(str3);

        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\");
        char ch = 'S';


        String charToString = Character.toString(ch);
        System.out.println(charToString);

// с использованием операции добавления класса String
        String str4 = "" + ch;
        System.out.println(str4);

//с использованием массива
        String fromChar = new String(new char[] { ch });
        System.out.println(fromChar);

// с использованием метода valueOf класса String
        String valueOfchar = String.valueOf(ch);
        System.out.println(valueOfchar);

        char ch1 = '9';

// c использованием метода getNumericValue
// класса Character
        int i4 = Character.getNumericValue(ch1);
        System.out.println(i4);

// c использованием метода digit класса Character
        int i5 = Character.digit(ch1,10);
        System.out.println(i5);
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\");

        int i6 = 2015;
        long l = (long) (i6);
        System.out.println(l);

        int i7 = 2015;
        float f = (float) (i7);
        System.out.println(f);

        long l1 = 214748364;
        int i8 = (int) l1;
        System.out.println(i8);

        double d = 3.14;
        int i9 = (int) d;
        System.out.println(i9);
    }
}