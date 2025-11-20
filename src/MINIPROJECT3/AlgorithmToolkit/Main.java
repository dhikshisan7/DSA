package MINIPROJECT3.AlgorithmToolkit;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = {5, 3, 8, 1, 9};

        System.out.println("Original: " + Arrays.toString(arr));

        long time = AnalysisUtil.time(() -> SortingUtil.bubbleSort(arr));
        System.out.println("Bubble Sorted: " + Arrays.toString(arr));
        System.out.println("Time: " + time);

        int index = SearchUtil.binarySearch(arr, 8);
        System.out.println("Binary Search 8 present at index: " + index);

        CollectionUtil.Stack<Integer> stack = new CollectionUtil.Stack<>();
        stack.push(10);
        stack.push(20);
        System.out.println("Stack Pop: " + stack.pop());

        CollectionUtil.Queue<String> queue = new CollectionUtil.Queue<>();
        queue.enqueue("A");
        queue.enqueue("B");
        System.out.println("Queue Dequeue: " + queue.dequeue());
    }
}