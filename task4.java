// Реализовать простой калькулятор (+ - / *)
// Ввод числа ->
// Ввод знака ->
// Ввод числа ->

import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
public class task4 {
    private static final Logger logger = Logger.getLogger(Task1.class.getName());

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            FileHandler fileHandler = new FileHandler("calclog.txt");
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);
            logger.addHandler(fileHandler);
            logger.setLevel(Level.INFO); 
            System.out.printf("Введите число: ");
            double a = input.nextDouble();
            logger.info("First Number " + a);
            System.out.print("Введите арифметическое действие (+, -, *, /): ");
            char b = input.next().charAt(0);
            logger.info("Arithmetic sign " + b);
            System.out.printf("Введите число: ");
            double c = input.nextDouble();
            logger.info("Second Number " + c);
            double res;
             switch (b) {
                case '+':
                    res = a + c;
                    break;
                case '-':
                    res = a - c;
                    break;
                case '*':
                    res = a * c;
                    break;
                case '/':
                    res = a / c;
                    break;
                default:
                    System.out.printf("Ошибка, введите +, -, * или / ");
                    logger.info("Mistake ");
                    return;
            }
            logger.info("Result: " + res);
            System.out.print("Результат:\n");
            System.out.printf(a + " " + b + " " + c + " = " + res);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

