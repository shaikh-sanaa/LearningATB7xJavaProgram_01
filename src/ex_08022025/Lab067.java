package ex_08022025;

import java.util.Locale;

public class Lab067 {
    public static void main(String[] args) {
    String name="Sana";// string constant pool
    String name2 =new String("Sana");// new is object string store in object
        System.out.println(name);
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.length());
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));


    }
}
