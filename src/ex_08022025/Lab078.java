package ex_08022025;

public class Lab078 {
    public static void main(String[] args) {
String s1= "Sana@1234";
String s2= s1.toLowerCase();
        System.out.println(s1==s2);// check for reference and s1 & s2 both have diff string so reference is diff

      //  s1.length();
        System.out.println(s1.length());
        System.out.println(s1.charAt(0));
        System.out.println(s1.indexOf("@"));
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        String s4= "sAna@1234";
        System.out.println(s1.equalsIgnoreCase(s4));


    }
}
