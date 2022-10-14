package homework;





public class HW6 {

    public static String verifyEquals(int expectedResult, int actualResult){


        if (expectedResult == actualResult) {

            return "Pass";

        } else {

            return "Fail";
        }

    }
    public static void printTCNumber(double n) {

        System.out.print("\nTC_" + n + "\t--\t");
    }
    public static String verifyEquals(String expectedResult, String actualResult) {
        if(expectedResult.equals(actualResult)) {

            return "Pass";
        } else {

            return "Fail";
        }
    }
    public static void printTestResult(String value) {
        System.out.print(value);
        System.out.println();
    }



    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";


    public static double roundAvoid(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }

    /**10.Написать метод, который принимает на вход параметры start,  end, step,
     * и печатает последовательность десятичных  чисел, начиная с числа start, с шагом step.
     * Точка выхода из цикла - число end.*/

    public static void desInt(int start, int end, int step){

        for (int i = start; i < end; i += step){

            System.out.println(i);
//            return i;



        }

//        return 0;





    }

    /**11.Написать метод, который принимает на вход параметры n и m типа char, и выводит на
     * печать последовательность букв английского алфавита в промежутке между значениями n и m включительно.*/

    public static void metSh(char n, int m){

        for (char i = n; i >= m; i-- ){

            System.out.println(i);
        }


    }

    /**12.Написать метод, который принимает параметр t и печатает  последовательность четных чисел от нуля.
     *  Длина последовательности = t.*/

    public static void met12(int t){


        for (int i = 0; i <= t;i = i +2){

            System.out.println(i);

        }

    }

    /**13.Напишите метод, который принимает целое число n, и выводит все степени числа 2 от 1 до n включительно*/

    public static void met13(int n){

        String result;
         for (int i = 1; i <= n; i++) {
//             result = Math.round(Math.pow(2, i)) + ", ";
            if (i < n) {
                result = Math.round(Math.pow(2, i)) + ", ";

                System.out.print(result);

//                return result;
            }
            else if(i == n){
                result = Math.round(Math.pow(2, i)) + ".";
                System.out.println(result);

//                return result;


            }

//            return result;

        }

//        return "";



    }

    /**15.Написать метод, который генерирует  последовательность чисел:
     0, 1, -1, 2, -2, 3, -3, 4, -4, 5, -5
     Метод формирует строку из сгенерированных значений, и выводит результат единожды на печать.
     ПРотестировать этот метод.*/

    public static String getRandomDoubleBetweenRange(){
        for (int i = (int)(Math.random()); i < 6; i++ ){

                System.out.print(i + ", ");
//                return i + ", ";
            if (i != 0){

                System.out.print(i -i - i + ", ");
                }
        }

        return "";
    }

    public static double getRandomIntegerBetweenRange(double min, double max){
        double x = (int)(Math.random()*((max-min)+1))+min;
        return x;
    }

//    public static




    public static void task(int n) {
        System.out.println("\n\n" + "Задание № " + n + "\n");
    }

//    public static

    public static void main(String[] args) {

        /**Распечатать последовательность чисел от 0 до 9 включительно.*/

        task(1);

        for (int i = 0; i <=9; i++){

            System.out.print(i + ", ");;
        }


        /**Распечатать последовательность чисел от 10 исключительно до 0 включительно.*/

        task(2);

        for (int i = 9; i >=0; --i){

            System.out.print(i + ", ");;
        }

        /**Распечатать последовательность чисел от 50 до 55 включительно с шагом 2.*/

        task(3);

        for (int i = 50; i <= 55; i = i + 2){

            System.out.print(i + ", ");
        }

        /**Распечатать последовательность чисел, кратных 7, в промежутке (327, 300)*/
        task(4);

        for (int i = 328; i > 300; i--){

            if (i % 7 == 0){

                System.out.println(i);
            }
        }

        /**Распечатать последовательность чисел в промежутке [12, 13] с шагом 0.1*/

        task(5);

        for (double i = 12; i <= 13; i += 0.1){

//            DecimalFormat df = new DecimalFormat("###.#");
//            System.out.println(df.format(i));
//            System.out.println(roundAvoid(i,1));
            int places = 1;
            double scale = Math.pow(10, places);
            System.out.println(Math.round(i * scale) / scale);
//            System.out.println((i * 100) / 100);




        }

        /**Распечатать последовательность четных чисел от 215 до 237 включительно*/
        task(6);
        for (int i = 215; i <= 237; i++){
            if (i % 2 == 0){

                System.out.println(i);
            }

        }

        /**Распечатать последовательность чисел, кратных 7, в промежутке от 7 исключительно до 14 исключительно.*/
        task(7);

//        for (int i = 8; i < 14; i++){
//
//            if (i % 7 == 0){
//
//                System.out.println(i);
//            }
//        }

        /**8.Распечатать последовательность которая начинается с минимального значения типа данных short
         * и заканчивается максимальным значением short. Числа в последовательности должны быть кратны 15001.*/

        task(8);

        for (short i = java.lang.Short.MIN_VALUE; i < java.lang.Short.MAX_VALUE; i++){
//
            if (i % 15001 == 0){
//
                System.out.println(i);
            }
        }



        /**9.Распечатать последовательность чисел в промежутке от -10 до 34 включительно. Числа, кратные 11,
         *  должны быть распечатаны синим цветом. Числа, кратные 12, должны быть распечатаны красным цветом.
         *  А ноль необходимо распечатать словом ZERO.*/
        task(9);

        for (int i = -10; i < 35; i++){

//            if ()

            if (i  == 0){

                System.out.print("ZERO ,");
            }
            else if (i % 11 == 0){

                System.out.print(ANSI_CYAN + i + ANSI_RESET + ", ");
            }
            else if (i % 12 == 0){

                System.out.print(ANSI_RED + i + ANSI_RESET + ", ");
            }
            else  System.out.print(i + ", ");
        }



        /**10.Написать метод, который принимает на вход параметры start,  end, step,
         * и печатает последовательность десятичных  чисел, начиная с числа start, с шагом step.
         * Точка выхода из цикла - число end.*/

        task(10);

        desInt(10,20,1);



        /**11.Написать метод, который принимает на вход параметры n и m типа char, и выводит на
         * печать последовательность букв английского алфавита в промежутке между значениями n и m включительно.*/

        task(11);

        metSh('n','m');



        /**12.Написать метод, который принимает параметр  и печатает  последовательность четных чисел от нуля.
         *  Длина последовательности = .*/

        task(12);

        met12(18);

        /**13.Напишите метод, который принимает целое число n, и выводит все степени числа 2 от 1 до n включительно*/

        task(13);

        met13(5);

        task(14);

        /**14.Вывести последовательность 012345678900112233445566778899000…  до числа 9999 включительно.*/

        for (int i = 0; i < 10; i++){
            for (i = 0; i < 10; i++){

                if (i == 1 || i < 10){

                    System.out.print(i);


                }
            }
            for (i = 0; i < 10; i++){

                if (i == 1 || i < 10){

                System.out.print(i);
                System.out.print(i);

                }
            }
            for (i = 0; i < 10; i++){

                if (i == 1 || i < 10){

                    System.out.print(i);
                    System.out.print(i);
                    System.out.print(i);

                }
            }
            for (i = 0; i < 10; i++){

                if (i == 1 || i < 10){

                    System.out.print("" + i + i + i);
//                    System.out.print(i);
//                    System.out.print(i);
//                    System.out.print(i);

                }
            }

        }

        /**public static void print9999() {
         for (int i = 1; i <= 4; i++) {
         for (int j = 0; j <= 9; j++) {
         for (int h = 1; h <= i; h++) {
         System.out.print(j);
         }
         }
         }

         */

        /**15.Написать метод, который генерирует  последовательность чисел:
         0, 1, -1, 2, -2, 3, -3, 4, -4, 5, -5
         Метод формирует строку из сгенерированных значений, и выводит результат единожды на печать.
         ПРотестировать этот метод.*/
        task(15);



        String expectResult = "0, 1, -1, 2, -2, 3, -3, 4, -4, 5, -5, ";
        String actualResult = getRandomDoubleBetweenRange();

        verifyEquals(expectResult,actualResult);
//        System.out.println(getRandomDoubleBetweenRange());

        printTCNumber(1);

        printTestResult( verifyEquals(expectResult,actualResult));
        System.out.println(getRandomDoubleBetweenRange());

        /**16.Распечатать последовательность чисел:
         0, 3, 5, 6, 9, 10, 12, 15, 18, 20, 21, 24, 25*/

//        for ()
















































    }




}
