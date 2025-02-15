package ex_08022025;

public class Lab056 {
    public static void main(String[] args) {
        byte b=127;
        int i = b; // implicit casting
        int result = (int)b;// explicit casting
        System.out.println(i);
        System.out.println(result);

        int x=300;
        //byte b =x;
        byte bb= (byte)x;
        System.out.println(bb);
    }
}
