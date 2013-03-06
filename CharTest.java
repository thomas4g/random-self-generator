import java.util.*;
public class CharTest {
    public static void main(String[] args) {
     final String template = "import java.util.*;class T{public static void main(String[] a){Random r=new Random(%dl);for(int i=0;i<152;i++,System.out.print((char)(r.nextInt(94)+32)));}}";

        System.out.println(template.length());
    //     Random rand = new Random();
    //     for(int i=0;i<100;i++) {
    //         int c = rand.nextInt(94)+32;
    //         System.out.println(c);
    //         System.out.println((char)c);
    //     }
    }
}