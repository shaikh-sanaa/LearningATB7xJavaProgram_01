package ex_21012025;

public class Lab025 {
    public static void main(String[] args) {
        int a=10;
        int b =20;
        System.out.println(a+b);//30

        String s1="Sana";
        String s2= "Anjum";
        System.out.println(s1+s2);//SanaAnjum

        int x=99;
        int y=100;
        String s3= "Shaikh";
        System.out.println(x+y+s3);//199Shaikh
        System.out.println(s3+x+y);//Shaikh99100
        System.out.println(x+s3+y);//99Shaikh100
        System.out.println(x+y+s3+y+s3+x+y);//199Shaikh100Shaikh99100

    }
}
