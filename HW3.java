package homework;






public class HW3 {

    static String Task = "Task # ";
    static int number = 2;
    public static void task(){
        System.out.println(Task + (number ++));
    }
    public static void task(String text, int num){
        System.out.println(text + num);
        num++;
    }

    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {

        String numOfTask = "Task ";
        int number = 2;
        String line = ANSI_GREEN + "__________________________________________________________" + ANSI_RESET;
        char subTask = 'a';

        task();
        System.out.println('\n'

                + line + '\n'
                + ANSI_CYAN + numOfTask + number + ANSI_RESET
                + "\n"
        );
        /**2. Создать переменные a и b типа byte, присвоить им значения из допустимого диапазона.*/

        byte a = 115;
        byte b = 95;

        System.out.println(ANSI_BLUE + "byte a = 115;"
                + "\nbyte b = 95;" + ANSI_RESET);


        System.out.println('\n'

                + line + '\n'
                + ANSI_CYAN + numOfTask + ++number + ANSI_RESET
                + "\n"
        );
        task();

        /**3.	Создать переменные s и t типа short, присвоить им значения с разницей 60000.*/

        short s = -31000;
        short t = +30500;

        System.out.println(ANSI_BLUE + "short s = -31000;"
                + "\nshort t = +30500;" + ANSI_RESET);


        System.out.println('\n'

                + line + '\n'
                + ANSI_CYAN + numOfTask + ++number + ANSI_RESET
                + "\n"
        );
        task("Задание № ", 4);

        /**4.	Создать переменную i типа int и присвоить ей минимально возможное значение этого типа.
         * Затем присвоить максимально возможное значение этого типа. Распечатать оба значения в виде таблицы:*/

        int i = -2147483648;
        String intMin = "int min";
        String intMax = "int max";

        String endLine = "\t|";
        String tabN = "\t|\t";
        String lineN = "\t_____________________________\n";


        System.out.println(lineN
                + tabN + intMin
                + tabN + ANSI_BLUE + i + ANSI_RESET
                + endLine

        );

        i = +2147483647;


        System.out.println(lineN
                + tabN + intMax
                + tabN + ANSI_BLUE + i + ANSI_RESET
                + endLine

        );

        System.out.println(lineN);


        System.out.println('\n'

                + line + '\n'
                + ANSI_CYAN + numOfTask + ++number + ANSI_RESET
                + "\n"
        );


        /**5.	Создать переменную phoneNumber
         * и присвоить ей значение номера телефона с кодом страны и города
         * (можно ненастоящий номер телефона, например, 18009998877)*/


        String phoneNumber = "+79231846051";
        long u = 79231846051L;

        String phNumber = "phoneNumber = " + phoneNumber;

        System.out.println(ANSI_BLUE + phNumber + ANSI_RESET);


        System.out.println('\n'

                + line + '\n'
                + ANSI_CYAN + numOfTask + ++number + ANSI_RESET
                + "\n"
        );


        /**6.	Создать переменную f типа float и присвоить ей значение 100.101101. Создать переменную d типа double и присвоить ей значение 100.101101.
         Распечатать результат в виде таблицы:
         */

        float f = 100.101101F;
        double d = 100.101101;
        String flo = "float f = 100.101101";
        String dou = "double d = 100.101101";
        lineN = "\t_____________________________________________\n";


        System.out.println(lineN
                + tabN + flo
                + tabN + ANSI_BLUE + f + ANSI_RESET
                + endLine

        );


        System.out.println(lineN
                + tabN + dou
                + tabN + ANSI_BLUE + d + ANSI_RESET
                + endLine

        );
        System.out.println(lineN);


        System.out.println('\n'

                + line + '\n'
                + ANSI_CYAN + numOfTask + ++number + subTask + ANSI_RESET
                + "\n"
        );


        /**a) Создать переменную типа Double с именем dd  и инициализировать
         *  её результатом суммы чисел 10.09999 и 20.099999. */

        {
            Double dd = 10.09999 + 20.099999;
            String douDD = "Double dd = 10.09999 + 20.099999;";

            System.out.println(ANSI_BLUE + douDD + ANSI_RESET);


            System.out.println('\n'

                    + line + '\n'
                    + ANSI_CYAN + numOfTask + number + ++subTask + ANSI_RESET
                    + "\n"
            );

            /**b) Создать переменную типа Float с именем ff
             * и инициализировать её результатом суммы чисел 10.09999 и 20.099999. */

            Float ff = 10.09999F + 20.099999F;
            String flFF = "Float ff = 10.09999F + 20.099999F;";

            System.out.println(ANSI_BLUE + flFF + ANSI_RESET);

        }


        /**8.	Создать переменную float ff и присвоить ей значение выражения 10 / 3.
         * Создать переменную double dd и присвоить ей значение выражения 10 / 3.
         * Добиться максимальной точности значений вычислений и распечатать результаты.*/

        float ff = 10 / 3f;
        double dd = 10 / 3d;

        System.out.println('\n'

                + line + '\n'
                + ANSI_CYAN + numOfTask + ++number + ANSI_RESET
                + "\n"
        );

        System.out.println(ANSI_BLUE + ff + "\n"
                + dd + ANSI_RESET);

        /**9.	Создать переменные типа Float:
         floatSum
         floatSub (substraction)
         floatProduct
         floatQuotient
         floatRemainder
         и  присвоить им значения, вычисленные с помощью переменных f и ff.
         */


        System.out.println('\n'

                + line + '\n'
                + ANSI_CYAN + numOfTask + ++number + ANSI_RESET
                + "\n"
        );

        Float floatSum = f + ff;
        Float floatSub = f / ff;
        Float floatProduct = f * ff;
        Float floatQuotient = f / ff;
        Float floatRemainder = f % ff;

        System.out.println(ANSI_BLUE + floatSum + "\n"
                + floatSub + "\n"
                + floatProduct + "\n"
                + floatQuotient + "\n"
                + floatRemainder + ANSI_RESET);


        System.out.println('\n'

                + line + '\n'
                + ANSI_CYAN + numOfTask + ++number + ANSI_RESET
                + "\n"
        );

        /**10.	Создать переменные типа double:
         doubleSum
         doubleSub
         doubleProduct
         doubleQuotient
         doubleRemainder
         */

        double doubleSum = d + dd;
        double doubleSub = d - dd;
        double doubleProduct = d * dd;
        double doubleQuotient = d / dd;
        double doubleRemainder = d % dd;


        System.out.println(ANSI_BLUE + doubleSum + "\n"
                + doubleSub + "\n"
                + doubleProduct + "\n"
                + doubleQuotient + "\n"
                + doubleRemainder + ANSI_RESET);


        System.out.println('\n'

                + line + '\n'
                + ANSI_CYAN + numOfTask + ++number + ANSI_RESET
                + "\n"
        );






        /**11.	Распечатать результаты вычислений заданий 8 - 10 в виде таблицы:*/


        /**String endLine = "\t|";
         String tabN = "\t|\t";
         String lineN = "\t_____________________________\n";*/
        lineN = "\t_____________________________________________________________________________________\n";
        String tab = "\t";
        String tab1 = tab + tab;

        String valF = "f = ";
        String valB = "b = ";
        String valFF = "ff = ";
        String valBB = "bb = ";
        String flSum = "floatSum = ";
        String flSub = "floatSub = ";
        String flProd = "floatProduct =  ";
        String flQuo = "floatQuotient = ";
        String flRemainder = "floatRemainder = ";

        String douSum = "doubleSum = ";
        String douSub = "doubleSub = ";
        String douProd = "doubleProduct = ";
        String douQuo = "doubleQuotient = ";
        String douRem = "doubleRemainder = ";



        System.out.println(lineN
                + endLine + valF + f
                + tabN + valFF + ff
                + tabN + valB + d
                + tabN + valBB + dd
                + endLine


        );
        System.out.print(lineN
        + tabN
                        + ANSI_BLUE
                        + flSum
                        + floatSum
                        + ANSI_RESET
                        + tab1
                        + tabN
        );
        System.out.println(ANSI_BLUE
                + douSum
                + doubleSum
                + ANSI_RESET
                + tab1
                + tab
                + endLine);


        System.out.print(lineN
                + tabN
                + ANSI_BLUE
                + flSub
                + floatSub
                + ANSI_RESET
                + tab1 + tabN  );

        System.out.println(ANSI_BLUE
                + douSub
                + doubleSub
                + ANSI_RESET
                + tab1  + tab
                + endLine);


        System.out.print(lineN
                + tabN
                + ANSI_BLUE
                + flProd
                + floatProduct
                + ANSI_RESET
                + tab + tabN   );

        System.out.println(ANSI_BLUE
                + douProd
                + doubleProduct
                + ANSI_RESET
                + tab1 + endLine);


        System.out.print(lineN
                + tabN
                + ANSI_BLUE
                + flQuo
                + floatQuotient
                + ANSI_RESET
                + tab + tabN       );

        System.out.println(ANSI_BLUE
                + douQuo
                + doubleQuotient
                + ANSI_RESET
                + tab1 + tab1
                + endLine);


        System.out.print(lineN
                + tabN
                + ANSI_BLUE
                + flRemainder
                + floatRemainder
                + ANSI_RESET
                + tab + tabN        );

        System.out.println(ANSI_BLUE
                + douRem
                + doubleRemainder
                + ANSI_RESET
                + tab + endLine);

        System.out.println(lineN);



        /**12.	Распечатать слова HELLO JAVA точками (чтобы получился рисунок точками)*/


        String point = "%";
        String point1 = point + point + point + point + point;

        String spy = " ";
        String spy1 = spy + spy;
        String spy2 = spy1 + spy;


//        String point = "*";String point = "*";
        System.out.println('\n'

                + line + '\n'
                + ANSI_CYAN + numOfTask + ++number + ANSI_RESET
                + "\n"
        );

        System.out.println(ANSI_BLUE + point + tab + point
                + tab + point1 + tab
                + point + tab1
                + point + tab1
                + point1+ ANSI_RESET
                +ANSI_RED + tab1 + tab1 + point
                + tab1 + point
                + tab + spy + point + tab1 + spy + point
                + tab + spy + point + ANSI_RESET
        + "\n"
                +ANSI_BLUE + point + tab + point + tab
                + point + tab1
                + point + tab1
                + point + tab1 + point + tab + point + ANSI_RESET
                +ANSI_RED + tab1 + tab1 + point + tab + spy2
                + point + spy + point + tab + spy1
                + point + tab1 + point
                + tab + point + spy + point + ANSI_RESET
        +"\n"
                + ANSI_BLUE + point1 + tab
                + point1 + tab
                + point + tab1
                + point + tab1
                + point + tab + point + ANSI_RESET
                +ANSI_RED + tab1 + tab1 + point + tab + spy1
                + point + spy + point + spy + point + tab + spy2
                + point + spy2 + point + spy2
                + point + spy + point + spy + point + ANSI_RESET
        +"\n"
                + ANSI_BLUE + point + tab + point + tab
                + point + tab1
                + point + tab1
                + point + tab1
                + point + tab + point + ANSI_RESET
                +ANSI_RED + tab1+ spy2+ point + tab + point + tab + spy
                + point + tab + spy2 + point + tab
                + point + spy + point + tab + spy1
                + point + tab1 + point + ANSI_RESET
        +"\n"
                + ANSI_BLUE + point + tab + point + tab
                + point1 + tab
                + point1 + tab
                + point1 + tab
                + point1 + ANSI_RESET
                +ANSI_RED + tab1 + tab + point1 + tab
                + point + tab1 + point + tab + spy
                + point + spy2
                + point + tab1 + spy + point + ANSI_RESET);


        /**13.	Создать переменные подходящего ссылочного типа данных(выбирать минимально достаточный диапазон значений):
         * t1 = 0;
         * t2 = 150;
         * t3 = -120;
         * t4 = - 505.505;
         * t5 = 100100;
         * t6 = 100010001000;
         * t7 = 2.66666666666666;
         * t8 = - 1000000.001;
         * t9 = 1010;*/

        System.out.println('\n'

                + line + '\n'
                + ANSI_CYAN + numOfTask + ++number + ANSI_RESET
                + "\n"
        );

        Byte t1 = 0;
        Short t2 = 150;
        Byte t3 = -120;
        Double t4 = - 505.505;
        Integer t5 = 100100;
        Long t6 = 100010001000L;
        Double t7 = 2.66666666666666;
        Double t8 = - 1000000.001;
        Short t9 = 1010;



/**14.	С помощью полей классов ссылочного типа распечатать таблицу:*/
        System.out.println('\n'

                + line + '\n'
                + ANSI_CYAN + numOfTask + ++number + ANSI_RESET
                + "\n"
        );
/**String endLine = "\t|";
 String tabN = "\t|\t";
 String lineN = "\t_____________________________\n";
 lineN = "\t_____________________________________________________________________________________\n";
 String tab = "\t";
 String tab1 = tab + tab;*/

String tab2 = tab + tab + tab;

        lineN = "\t____________________________________________________________\n";



        System.out.println(lineN
        + tabN + "Type" + tabN + "Size in bits" + tabN + "min" + tab1 + tabN + "max" + tab + endLine);
        System.out.println(lineN + tabN + "byte" + tabN + 8 + tab2 + tabN + (t1.MIN_VALUE) + tab + tabN
                + (t1.MAX_VALUE) + tab + endLine);

        System.out.println(lineN + tabN + "short" + tabN + 16 + tab2 + tabN + (t2.MIN_VALUE) + tab + tabN
                + (t2.MAX_VALUE) + endLine);



/**15.	Создать 2 переменные референсного типа Integer - num1 и num2, присвоить им одинаковые значения,
 *  сравнить 2 переменные друг с другом с помощью метода .equals().
 *  Вывести результат сравнения на печать в виде выражения:
 “Если num1 равно  num2, то результат сравнения методом .equals() = …”

 Присвоить переменным разные значения, сравнить,  и вывести результат на печать:
 “Если num1 не равно num2, то результат сравнения методом .equals() = …”
 */
        System.out.println('\n'

                + line + '\n'
                + ANSI_CYAN + numOfTask + ++number + ANSI_RESET
                + "\n"
        );

        Integer num1 = 100500;
        Integer num2 = 100500;
        System.out.println(num1.equals(num2));/**сравнить 2 переменные друг с другом с помощью метода .equals().*/

        System.out.println("Если num1 равно  num2, то результат сравнения методом .equals() = " + (num1.equals(num2)));

        num1 = 100000;

        System.out.println("Если num1 не равно num2, то результат сравнения методом .equals() = "
                + (num1.equals(num2)));






        /**16.	Создать 2 переменные примитивного типа int - number1 and number2. Инициализаровать их
         а) одинаковыми значениями
         b) number1 < number2
         c) number1 > number2
         сравнить их подходящим методом класса Integer (посмотрите, какой метод подойдет - не equals() !), и вывести результаты сравнения на печать в виде выражений:
         “Если number1 = number2, то результат сравнения методом … = …”
         “Если number1 < number2, то результат сравнения методом … = …”
         “Если number1 > number2, то результат сравнения методом … = …”

         */
        System.out.println('\n'

                + line + '\n'
                + ANSI_CYAN + numOfTask + ++number + --subTask + ANSI_RESET
                + "\n"
        );

        int number1 = 15;
        int number2 = 15;

        System.out.println("Если number1 = number2, то результат сравнения методом compare(int x, int y) = "
    +(Integer.compare(number1, number2)));

        System.out.println('\n'

                + line + '\n'
                + ANSI_CYAN + numOfTask + number + ++subTask + ANSI_RESET
                + "\n"
        );

        number1 = 10;

        System.out.println("Если number1 < number2, то результат сравнения методом compare(int x, int y) = "
                + (Integer.compare(number1, number2)));

        System.out.println('\n'

                + line + '\n'
                + ANSI_CYAN + numOfTask + number + ++subTask + ANSI_RESET
                + "\n"
        );

        number2 = 5;

        System.out.println("Если number1 > number2, то результат сравнения методом compare(int x, int y) = "
                + (Integer.compare(number1, number2)));


        System.out.println('\n'

                + line + '\n'
                + ANSI_CYAN + numOfTask + ++number + ANSI_RESET
                + "\n"
        );


        /**17.	Создать переменную типа Float, присвоить ей значение 234.9999, распечатать значение переменной в int*/

        Float v = 234.9999F;

        System.out.println(v.intValue());


        /**18.	С помощью метода sum() класса Double посчитать сумму двух переменных типа double.*/

        System.out.println('\n'

                + line + '\n'
                + ANSI_CYAN + numOfTask + ++number + ANSI_RESET
                + "\n"
        );

        double ddd = 10.09999;
        double ddd1 = 20.09999;


        System.out.println(Double.sum(ddd, ddd1));

        System.out.println('\n'

                + line + '\n'
                + ANSI_CYAN + numOfTask + ++number + ANSI_RESET
                + "\n"
        );

        /**19.	С помощью метода sum() класса Integer посчитать сумму двух переменных типа Float.*/


        /**System.out.println(Integer.sum(f, ff));*/


        /**20.	Создать 2 переменные типа Short:
         short1 = 12000
         short2 = 12300
         a)	Распечатать фразу:
         “12000 - 12300 = -300”
         где значение -300 выведено с помощью метода класса Short, а не операцией вычисления
         b)	Присвоить переменной short1 значение 12500, вывести фразу:
         “12500 - 12300 = 200”
         где значение 200 выведено с помощью метода класса Short, а не операцией вычисления
         */

        subTask = --subTask;

        System.out.println('\n'

                + line + '\n'
                + ANSI_CYAN + numOfTask + ++number + --subTask + ANSI_RESET
                + "\n"
        );

        Short short1 = 12000;
        Short short2 = 12300;

        System.out.println("12000 - 12300 = " + Short.compareUnsigned(short1, short2));

        System.out.println('\n'

                + line + '\n'
                + ANSI_CYAN + numOfTask + number + ++subTask + ANSI_RESET
                + "\n"
        );

        short1 = 12500;

        System.out.println("12500 - 12300 = " + Short.compareUnsigned(short1, short2));

        System.out.println('\n'

                + line + '\n'
                + ANSI_CYAN + numOfTask + ++number + ANSI_RESET
                + "\n"
        );

        /**21.	Создать переменные:
         String str1 = "123.56";
         String str2 = "123.55";
         Double doub1 = 123.56;
         Double doub2 = 123.55;

         Распечатать результат doub1 - doub2

         Используя методы ссылочного типа данных, посчитать и распечатать результат str1 - str2

         Сравнить полученные результаты doub1 - doub2 и str1 - str2
         */

        String str1 = "123.56";
        String str2 = "123.55";

        Double res = Double.parseDouble(str1) - Double.parseDouble(str2);


        Double doub1 = 123.56;
        Double doub2 = 123.55;
        Double res1 = doub1 - doub2;

        System.out.println(res);
        System.out.println(res1);


        System.out.println((res).compareTo((res1)));
        System.out.println(res.doubleValue() == res1.doubleValue());
        System.out.println(Double.compare(res, res1));
        System.out.println(res.equals(res1));
        System.out.println(Double.valueOf(str1) - Double.valueOf(str2));


        /**22.	Создать переменную подходящего типа данных для хранения результатов измерения
         *  температуры тела кота (значения температуры в Цельсиях).
         *  Присвоить этой переменной сначала максимальное значение, затем минимальное значение.
         *  Посчитать и распечатать среднее значение. Распечатать результат среднего значения температуры тела кота.*/


//        double temCat = 32.0;
//        double temCat1 = 30.0;



        System.out.println('\n' + line  );
        System.out.println( ANSI_CYAN + numOfTask + ++number + ANSI_RESET
                + "\n");


//
//        System.out.println((temCat + temCat1) / 2 + " C");
        float tempCat = 32.2F;
        float average = tempCat / 2;
        tempCat = 35.6F;
        average = average + tempCat / 2;

        System.out.println(average + " \u00b0C");




        /**23.	Создать переменную n типа Number, присвоить ей максимально возможное значение.
         Присвоить n значение 10,
         затем присвоить n значение 10.999999999

         Распечатать результаты в виде выражения:
         “Переменная n может принимать значения:
         n =  …
         n =  …
         n =  …
         Это возможно, потому что …”
         */

        System.out.println('\n' + line  );
        System.out.println( ANSI_CYAN + numOfTask + ++number + ANSI_RESET
                + "\n");

        Number n = Double.MAX_VALUE;
            System.out.println("Переменная n может принимать значения:\n" + "n = "
                    + n);
         n = 10;
            System.out.println("n = " + n);


         n = 10.999999999;
            System.out.println("n = " + n
            + "\nЭто возможно, потому что перепресвоили значение переменной");















        /**24.	Создать переменную Integer numberInteger = 100.
         Доказать, что numberInteger имеет тип Integer,
         а numberInteger.toString() имеет тип String.
         */

        System.out.println('\n' + line  );
        System.out.println( ANSI_CYAN + numOfTask + ++number + ANSI_RESET
                + "\n");
//
        Integer numberInteger = 100;
//        intValue(numberInteger);
        System.out.println(numberInteger.TYPE);/**int*/
        System.out.println(numberInteger.getClass().getSimpleName());/**Integer*/
        System.out.println(numberInteger.getClass());/**class java.lang.Integer*/
        System.out.println(numberInteger.toString().getClass());/**class java.lang.String*/

//        System.out.println(getInteger(numberInteger));

//


        /**25.	Вывести на экран следующие выражения, используя для печати только переменные:
         “50 kilogram = … lbs,  50 lb = … kg”, где значения должны быть вычислены по формулам

         “100 meters = … miles,  100 miles = … meters”, где значения должны быть вычислены по формулам
         */
        System.out.println('\n' + line  );
        System.out.println( ANSI_CYAN + numOfTask + ++number + ANSI_RESET
                + "\n");

        String kgt50 = "50 kilogram = ";
        String ld50 = "50 lbs = ";
        String met100 = "100 meters = ";
        String mil100 = "100 miles = ";
        String kg = "kg";
        Double sumKg50 = 50 * 2.2046226218487757;
        Double sumLd50 =  50 * 0.45359237;
        Double sumMet100 = 100 * 0.00062;
        Double sumMil100 = 100 * 1609.34;
        Double sum;

        System.out.println(kgt50 + sumKg50 + " lds");
        System.out.println(ld50 + sumLd50 + " kg");
        System.out.println(met100 + sumMet100 + " miles");
        System.out.println(mil100 + sumMil100 + " meters");

        /**26.	На сайте погоды https://openweathermap.org/ найти в документации и распечатать,
         *  какие коды соответствуют следующим состояниям погоды:
         … - thunderstorm with heavy rain
         … - overcast clouds: 85-100%
         … - Shower sleet
         */

        System.out.println('\n' + line  );
        System.out.println( ANSI_CYAN + numOfTask + ++number + ANSI_RESET
                + "\n");


        System.out.println("202 - thunderstorm with heavy rain 'гроза с проливным дождем'");
        System.out.println("804 - overcast clouds: 85-100% '- облачность: 85-100%'");
        System.out.println("611 - Shower sleet 'Мокрый снег'");

























        /**int i = 14;
        int b = 256;
        double s = 35.5F;
        double d = 100d;
        String s1 = "Привет";
        int sum = i + b;
        double sub = b - d;
        b = 0;
        double product = b * d;
        Byte r;
        s1 = String.valueOf(s);
        sum = (int)(s + d);
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(product);
        System.out.println(sum);*/




































    }








}
