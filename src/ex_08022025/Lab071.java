package ex_08022025;

public class Lab071 {
    public static void main(String[] args) {
        String s1="Sana";
        String s2=s1;
        System.out.println(s2);// Sana
        String s3= s2.toLowerCase();//sana
        System.out.println(s3);//sana
        System.out.println(s1);//Sana  // all string storing in string constant pool- SCP
    }
}
