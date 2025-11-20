package MINIPROJECT3.AlgorithmToolkit;

/**
 * Utility class for benchmarking algorithms.
 */
public class AnalysisUtil {

    public static long time(Runnable task) {
        long start = System.nanoTime();
        task.run();
        long end = System.nanoTime();
        return end - start;
    }
}