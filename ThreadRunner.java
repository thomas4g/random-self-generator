public class ThreadRunner {
    public static void main(String[] a) {
        final long interval = 10000000;
        RandGenerator gen1 = new RandGenerator(Long.MIN_VALUE, Long.MIN_VALUE/2, interval);
        new Thread(gen1).start();

        RandGenerator gen2 = new RandGenerator(Long.MIN_VALUE/2, 0, interval);
        new Thread(gen2).start();

        RandGenerator gen3 = new RandGenerator(0, Long.MAX_VALUE/2, interval);
        new Thread(gen3).start();

        RandGenerator gen4 = new RandGenerator(Long.MAX_VALUE/2, Long.MAX_VALUE, interval);
        new Thread(gen4).start();
    }
}