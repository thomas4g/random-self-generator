public class ThreadRunner2 {
    public static void main(String[] a) {
        final long interval = 10000000;
        RandGenerator gen1 = new RandGenerator(Long.MIN_VALUE, Long.MAX_VALUE, interval);
        new Thread(gen1).start();
    }
}