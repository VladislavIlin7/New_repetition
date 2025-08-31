import java.util.Arrays;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);

            //Обработка исключений

            try {
                int x = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                System.out.println("Done");
            }
        }

        // вывод
        System.out.print("Hello ");
        System.out.print("world!");
        // Вывод: Hello world!

        System.out.println("Hello");
        System.out.println("World");
        // Вывод:
        // Hello
        // World

        int a = 5;
        double b = 3.14159;

        System.out.printf("a = %d, b = %.2f%n", a, b);
        // a = 5, b = 3.14

//        Форматные спецификаторы:
//
//          %d — целое
//          %f — число с плавающей точкой (%.2f = 2 знака после запятой)
//          %s — строка
//          %n — перенос строки


        //Сортировки в Java
        String[] names = {"Vlad", "Anna", "Petr"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        // [Anna, Petr, Vlad]

        int[] nums = {5, 2, 8, 1, 3};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
    // [1, 2, 3, 5, 8]

    }
}