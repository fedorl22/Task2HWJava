// Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
// результат после каждой итерации запишите в лог-файл.

import java.util.Arrays;
import java.util.logging.*;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

public class Task1 {
    private static final Logger logger = Logger.getLogger(Task1.class.getName());

    public static void main(String[] args) {

        try {
            FileHandler fileHandler = new FileHandler("log.txt");
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);
            logger.addHandler(fileHandler);
            int[] arr = { 125, 34, 725, 32, 22, 17, 90, 55, 78, -22, -33 };
            logger.setLevel(Level.INFO); 
            logger.info("Source array: " + Arrays.toString(arr));
            bubbleSort(arr);
            logger.info("Sorted array: " + Arrays.toString(arr));
        } catch (IOException e) {
            logger.warning("Failed to create log file");
        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            logger.info("Intermediate result on" + (i + 1) + "-th iteration: " + Arrays.toString(arr));
            
        }

    }
}
