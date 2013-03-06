import java.util.*;
public class SelfGenerator {
   public static void main(String[] args) {
        String template = "import java.util.*;class T{public static void main(String[] a){Random r=new Random(%20dl);for(int i=0;i<173;i++,System.out.print(Character.forDigit(r.nextInt(94)+32,10)));}}";
        System.out.println(template.length());
        // long seed;
        // Random rand = new Random();
        // int i;
        // String toMatch;
        // boolean matched = false;
        // for(seed = Long.MAX_VALUE; seed >0; seed--){
        //     if(seed % 10000000 == 0) 
        //         System.out.println(seed);
        //     rand.setSeed(seed);
        //     toMatch = String.format(template, seed);
        //     matched = true;
        //     for(i=0;i<toMatch.length();i++) {
        //         if(Character.forDigit(rand.nextInt(94)+32,10) != toMatch.charAt(i))
        //             matched = false;
        //     }
        //     if(matched)
        //         break;
        // }
        // if(matched)
        //     System.out.println(seed);
        // else
        //     System.out.println("No seed. :(");
   }
}