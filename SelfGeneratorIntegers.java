import java.util.*;
public class SelfGeneratorIntegers {
   public static void main(String[] args) {
        String template = "import java.util.*;public class T{public static void main(String[] a){Random r=new Random(%d);System.out.println(Character.forDigit(r.nextInt(94)+32,10));}}";
        int seed;
        Random rand = new Random();
        int i;
        String toMatch;
        boolean matched = false;
        for(seed = Integer.MAX_VALUE; seed >= Integer.MIN_VALUE; seed--){
            if(seed % 100000 == 0) 
                System.out.println(seed);
            rand.setSeed(seed);
            toMatch = String.format(template, seed);
            matched = true;
            for(i=0;i<toMatch.length();i++) {
                if(Character.forDigit(rand.nextInt(94)+32,10) != toMatch.charAt(i))
                    matched = false;
            }
            if(matched)
                break;
        }
        if(matched)
            System.out.println(seed);
        else
            System.out.println("No seed. :(");
   }
}