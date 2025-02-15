package ex_08022025;

public class Lab075 {
    public static void main(String[] args) {
        String s1= new String("Hello World");
        String s2= new String("Hello World");
        String s3= new String("Hello World");

        System.out.println(s1==s2);// here in heap s1 & s2 store on 2 diff refernce so its false
        System.out.println(s1.equals(s2));//check for content so the content is same its true
        System.out.println(s2==s3);// refernce is diff//false
        System.out.println(s2.equals(s3));// content is same// true
    }
}
