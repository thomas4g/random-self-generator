import java.util.*;
public class RandGenerator implements Runnable {
    private static int num;
    private int id;
    private static final String template = "import java.util.*;class T{public static void main(String[] a){Random r=new Random(%dl);for(int i=0;i<156;i++,System.out.print((char)(r.nextInt(94)+32)));}}";
    private long min, max, update;
    public RandGenerator(long min, long max, long update) {
        this.min = min;
        this.max = max;
        this.update = update;
        id=++num;
        System.out.printf("Thread %d has been created.\n", id);
    }

    public void run() {

        long seed;
        Random rand = new Random();
        int i,k;
        String toMatch;
        boolean match = false;
        int matched = 0;
        String result="";
        System.out.printf("Thread %d has begun.\n", id);
        char c;
        for(seed = max; seed >= min; seed--){
            if(seed % update == 0) 
                System.out.printf("Thread %d reporting in at seed %d\n", id, seed);
            rand.setSeed(seed);
            toMatch = String.format(template, seed);
            match = true;
            matched=0;
            result="";
            for(i=0;i<toMatch.length();i++) {
                k = rand.nextInt(94)+32;
                c = (char)k;
                if(c != toMatch.charAt(i)) {
                    match = false;
                    break;
                }
                else {
                    matched++;
                }

            }
            if(matched > 5) System.out.printf("Thread %d got close with %d out of 156 matched", id, matched);
            if(match)
                break;

        }
        if(match)
            System.out.printf("Thread %d found seed!! It's: %d\n", id,seed);
        else
            System.out.printf("Thread %d completed. No seed found. :(", id);
    }
}