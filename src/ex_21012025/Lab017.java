package ex_21012025;

public class Lab017 {
    public static void main(String[] args) {
        byte age =123;// good allocation less memory we can use upto 127 so
        int p_age =124;//wasting of memory

        // store pi value up to 2 decimal 3.14 only
        float pi= 3.14f;// good option of memory allocation
        double d_pi= 3.1466565656; // wasting of memory here if we just need tp print 3.14
        //its good to use float option
        System.out.println(pi);
    }
}
