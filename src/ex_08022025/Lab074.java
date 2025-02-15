package ex_08022025;

public class Lab074 {
    public static void main(String[] args) {
        String name1 ="The Testing Academy";
        String name2 ="The Testing Academy";
       System.out.println(name1==name2);//check for reference
       System.out.println(name1.equals(name2));// check for content

        String name3= new String("The Testing Academy");
        System.out.println(name1==name3);//check for reference
        System.out.println(name1.equals(name3));//check for the content



    }
}
