public class Main {
    public static void main(String[] args) {
        StopWatch stopwatch = new StopWatch();
        stopwatch.start();
        for (int i = 0; i < 100000; i++) {
            System.out.print("");
        }
        stopwatch.stop();
        System.out.print("ket qua: " + stopwatch.getElapsedTime());
    }
}
