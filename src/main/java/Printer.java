import java.util.Scanner;

import static java.lang.Float.parseFloat;
import java.util.Arrays;

//Z1********************************************************

//class IsFloat {
//    public static float isFloat(String input) {
//
//
//
//        try {
//            float floatValue = Float.parseFloat(input);
//            return floatValue;
//
//        } catch (NumberFormatException e) {
//            System.out.println("Your input is not a float number. Please, try again." );
//
//            return  Float.NaN;
//        }
//
//
//    }
//}
//
//// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
//public class Printer {
//    public static void main(String[] args) {
//        String input;
//
//// При отправке кода на Выполнение, вы можете варьировать эти параметры
//        if (args.length == 0) {
//            input = "ttt"; // По умолчанию используем "3.14", если аргумент не передан
//        }
//        else {
//            input = args[0];
//        }
//
//        float result = IsFloat.isFloat(input);
//        System.out.println(result);
//    }
//}
//


//Z2***************************************

import java.util.Arrays;

class Expr {

    public static double expr(int[] intArray, int d) {
        // Введите свое решение ниже
        if (intArray.length > 8) {
            // Проверяем, равен ли делитель d нулю
            if (d != 0) {

                // Вычисляем значение выражения intArray[8] / d
                System.out.println("intArray[8] / d = " + intArray[8] + " / 1 " + "= " + (double)intArray[8] / d);


                return (double) intArray[8] / d;
            } else {
                System.out.println("It's not possible to evaluate the expression - intArray[8] / d as d = 0.\"");
            }
        } else {
            System.out.println("It's not possible to evaluate the expression - intArray[8] / d as there is no 8th element in the given array.");
        }
        // Возвращаем значение по умолчанию (например, NaN) в случае ошибки
        return Double.NaN;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки

public class Printer {
    public static void main(String[] args) {
        int[] intArray;
        int d;

        if (args.length == 0) {
            intArray = new int[]{ 1, 2, 3, 4, 5, 6, 7, 8, 9};//! Удалить 0 из кода GB!!!
            d = 1; // По умолчанию используем 0, если аргумент не передан
        } else {
            intArray = Arrays.stream(args[0].split(" ")).mapToInt(Integer::parseInt).toArray();
            d = Integer.parseInt(args[1]); // Можно использовать значение по умолчанию или передать его как аргумент.
        }

        double result = Expr.expr(intArray, d);
        System.out.println(result);
    }
}

//Z3*******************
