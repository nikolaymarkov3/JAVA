package homework;


public class HW2 {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";




    public static void main(String[] args) {


        /** 3. Создать переменную number, присвоить ей значение 3, и перед каждым ответом на последующие
         задачи выводить на печать:Task …где вместо … должен стоять номер задания, распечатанный
         с помощью переменной number и унарного оператора. * Так же можно вывести букву подзадания
          с помощью переменной char subTask и унарного оператора*/

        int number = 3;

        char subTask = 'a';

        char subTaskTemp = subTask;

        String numOfTask = "Task ";


        /**4. Создать целочисленные переменные x, y, z и присвоить им любые значения (на ваше усмотрение) */

 int x = 3;
 int y = 21;
 int z = 9;
 String line = ANSI_GREEN + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
         + "~~~~~~~~~~~~~~~~~" + ANSI_RESET;
        /*a.	Вывести значения переменных в столбик */
        System.out.println(ANSI_RED + numOfTask + ANSI_RESET + ++number + " " + subTask + "." + "\n" + x + "\n" + y + "\n" + z);


        /**b.	Вывести значения переменных в строку*/

        System.out.println(line + "\n" + numOfTask + number + " " + ++subTask + "." + "\n"
                + x + ", " + y + ", " + z + ".");



        /**c.	Вывести значения этих переменных так, чтобы было понятно, какое значение к какой переменной относится.
         *Например, должно быть распечатано:int x = 5; или y = 10;*/

        System.out.println(line + "\n" + numOfTask + number + " " + ++subTask + "." + "\n" + "int x = " + x + "\n"
                + "int y = " + y + "\n" + "int z = " + z);

        System.out.println("\n" + numOfTask + number + " " + subTask + ". :" + " int x = " + x + ", int y = " + y
                + ", int z = " + z + ".");

        int numberTemp = number;

/**5. Используя конкатенацию, вывести в строку через запятую значения переменных из задания 4
Пример вывода:5, 10, 15*/

        System.out.println(line + "\n" + numOfTask + ++number + "\n" + numberTemp + ", " + subTaskTemp + ", "
                + ++subTaskTemp + ", " + ++subTaskTemp + ", " + x + ", " + y + ", " + z + ".");



        /**6. Распечатать следующие выражения, где вместо … будет выведен результат арифметической операции:
Sum of x and y = … x * z = … Разность переменных y и z = … */


        int sumXY = x + y;
        int multiXZ = x * z;
        int divYZ = y - z;

        System.out.println(line + "\n" + numOfTask + ++number + "\n" + "Sum of x and y = " + sumXY + "\n"
                + "x * z = " + multiXZ + "\n" + "Разность переменных y и z = " + divYZ + ".");


        /**7. Создать переменные apple и student и присвоить им значения 40 и 6 соотетственно.
         *Распечатать выражение, где вместо … - результаты математических вычислений:
         *Если … яблок поделить на … учеников, то каждый ученик получит по … яблок(a),
         * и … яблок(а) останется учителю.*/

        int apple = 40;
        int student = 6;
        int appEachStudent = apple / student;
        int appRemainTeacher = apple % student;

        System.out.println(line + "\n" + numOfTask + ++number + "\n" + "Если " + apple + " яблок поделить на " + "\n"
                + student + " учеников, то каждый ученик получит по " + appEachStudent + " яблок(a),\n"
                + "и " + appRemainTeacher + " яблок(а) останется учителю.");


        /**8. Распечатать выражение из задания 7 со значениями 100 и 21 соответственно.*/

        System.out.println(line + "\n" + numOfTask + ++number + "\n" + (apple * 2 + 20) + "\n"
                + (student * appRemainTeacher - 3));

        apple = 100;
        student = 21;
        appEachStudent = apple / student;
        appRemainTeacher = apple % student;

        System.out.println("Если " + apple + " яблок поделить на \n"
                + student + " учеников, то каждый ученик получит по " + appEachStudent + " яблок(a),\n" + "и "
                + appRemainTeacher + " яблок(а) останется учителю.");

        System.out.println(apple + ", " + student + ".");


        /**9.  Решить с помощью переменных и математических вычислений*/

        int broughtLemon = 6;
        int broughtApple = broughtLemon + 24;
        int broughtPears = broughtApple - 12;

        int allFruits = broughtLemon + broughtApple + broughtPears;


        System.out.println(line + "\n" + numOfTask + ++number);
/**        System.out.println( broughtLemon + broughtApple + broughtPears
//                + " килограмма фруктов привезли в школьную столовую.");*/


        System.out.println(allFruits + " килограмма фруктов привезли в школьную столовую.");

/** 10. Распечатать выражение с помощью переменных и вычислений:
У сороконожки заболели ножки: 8 ноют, 5 гудят, 7 хромают, 2 болят.
Помоги сороконожке Посчитать здоровые ножки. Ответ: … */

        int centipedeLegs = 40;
        int legsWhining = 8;
        int legsBuzzing = 5;
        int legsLimping = 7;
        int legsHurt = 2;

        int legsHealth = centipedeLegs - legsHurt - legsBuzzing - legsLimping - legsWhining;


        System.out.println(line + "\n" + numOfTask + ++number);
        System.out.println("Ответ: " + legsHealth + " здоровых ножек у сороконожки.");



        /**11. Рассчитать с помощью математических операторов и вывести на печать задачи и ответы:*/


        int multi = 35 / 7;
        int multi1 = 48 / 8;
        int multi2 = 54 - 6;


        String issue = "Восколько раз 35 больше, чем 7? \t| Ответ: в ";
        String issue1 = "Восколько раз 8 меньше, чем 48?\t\t| Ответ: в ";
        String issue2 = "На сколько 54 больше, чем 6? \t\t| Ответ: на ";


        System.out.println(line + "\n" + numOfTask + ++number);

        System.out.println(issue + multi + " раз,\n" + issue1 + multi1 + " раз,\n" + issue2 + multi2 + ".");





/**12. Объяснить:	a. почему число 48 кратно 8
                    b. что оба числа - четные.
                    c. что числа 47 и 49 - нечетные.
                    d. только одно из всех чисел кратно 7 */


        String onMulti = "Число 48 кратно 8 ";
        String onEven = "Оба числа - четные";
        String noEven = "Числа 47 и 49 - нечетные";
        String oneMulti = "Только одно из всех чисел кратно 7";


        System.out.println(line + "\n" + numOfTask + ++number + " a.");
        System.out.println(onMulti + ", так как при делении 48 на 8 остаток = " + 48 % 8);

        System.out.println(numOfTask + number + " b.");
        System.out.println(onEven + ", у четных чисел при деление на 2 остаток = 0, 48 / 2 остаток = " + 48 % 2
                + " и 8 / 2  остаток = " + 8 % 2);

        System.out.println(numOfTask + number + " c." + "\n"

                + noEven + ", оба числа делятся на два с остатком 47 / 2 остаток = " + 47 % 2
                + ", 49 / 2 остаток = " + 49 % 2);

        System.out.println(numOfTask + number + " d." + "\n"

                + oneMulti + " так как только одно число делится на 7 без остатка, 49 / 7 остаток = " + 49 % 7);



        /**13. Распечатать следующую таблицу,  где результат рассчитывается с помощью применения арифметических
         *и унарных операторов:*/

        int k = 5;
        int l = 10;
        int m = 12;
        String winLine = "|";
        int oldK = k;
        int oldL = l;
        int oldM = m;


        System.out.println(line + "\n" + numOfTask + ++number);


        String tabLine = "===================================================================";
        String vLine = "\t|\t";
        String endLine = "\t|";
        String tab = "\t";
        String tLine = "\t=================================================================================\n";

           System.out.println(
                   tLine
                   + vLine + tab
                   + vLine + "+10"
                   + vLine + "-5"
                   + vLine +"*100"
                   + vLine + "/2"
                   + vLine + "%2"
                   + vLine + "^2"
                   + vLine + "++"
                   + vLine + "--"
                   +endLine


           );

           System.out.print(

                   tLine
                           + vLine + "k = " + k
                           + vLine + (k + 10)
                           + vLine + (k - 5)
                           + vLine + (k * 100) + "\t"
                           + vLine + (k / 2)
                           + vLine + (k % 2)
                           + vLine + (k * k++)
                           + vLine + (k--)


           );

           k--; /** или k--; */


           System.out.println(vLine + k + endLine);

           k = l;


           System.out.print(

                   tLine
                           + vLine + "l = " + l
                           + vLine + (k + 10)
                           + vLine + (k - 5)
                           + vLine + (k * 100)
                           + vLine + (k / 2)
                           + vLine + (k % 2)
                           + vLine + (k * k++)
                           + vLine + (k--)


           );

           k--; /** или k--; */


           System.out.println(vLine + k + endLine);

           k = m;

           System.out.print(

                   tLine
                           + vLine + "m = " + m
                           + vLine + (k + 10)
                           + vLine + (k - 5)
                           + vLine + (k * 100)
                           + vLine + (k / 2)
                           + vLine + (k % 2)
                           + vLine + (k * k++)
                           + vLine + (k--)


           );

           k--; /** или k--; */


           System.out.println(vLine + k + endLine);

           System.out.println(tLine);



       /** System.out.println("\n\n\n" + tabLine);
        System.out.println("|      |\t+10 | -5 |\t   *100 |  /2 |  %2  | ^2 |  ++   |   --  | ");
        System.out.println(tabLine);
        System.out.println("|k = 5 |\t" + (k + 10) + "\t|\t" + (k - 5) + "|\t\t" + k * 100 + "\t|\t" + k / 2
                + " |\t\t" + k % 2 + "|\t" + k * k + "|\t\t " + ++k + "|\t\t" + (--k - 1) + " |");

        System.out.println(tabLine);
        System.out.println("|l = 10|\t" + (l + 10) + "\t|\t" + (l - 5) + "|\t\t" + l * 100 + "|\t" + l / 2
                + " |\t\t" + l % 2 + "|\t" + l * 5 + "|\t\t" + (++l) + "|\t\t" + (--l - 1) + "|");

        System.out.println(tabLine);
        System.out.println("|m = 12|\t" + (m + 10) + "\t|\t" + (m - 5) + "|\t\t" + m * 100 + "|\t" + m / 2
                + " |\t\t" + m % 2 + "|\t" + m * 5 + "|\t\t" + ++m + "|\t\t" + (--m - 1) + "|");

        System.out.println(tabLine);*/

/**        System.out.println("ВАРИАНТ 2, через System.out.printf()");
//
//        System.out.printf("-----------------------------------------------------------------------------------%n");
//        System.out.printf("| %7s | %6s | %6s | %6s | %6s | %6s | %6s | %6s | %6s |%n", "", " + 10", "-5", "*100",
//                "/2", "%2", "^2", "++", "--");
//        System.out.printf("-----------------------------------------------------------------------------------%n");
//
//
//        System.out.printf("| %7s | %6s | %6s | %6s | %6s | %6s | %6s | %6s | %6s |%n", " k = 5", k + 10, k - 5,
//                k * 100, k / 2, k % 2, k ^ 2, ++k, --k -1);
//        System.out.printf("-----------------------------------------------------------------------------------%n");
//
//
//        System.out.printf("| %7s | %6s | %6s | %6s | %6s | %6s | %6s | %6s | %6s |%n", " l = 10", l + 10, l - 5,
//                l * 100, l / 2, l % 2, l ^ 2, ++l, --l -1);
//        System.out.printf("-----------------------------------------------------------------------------------%n");
//
//
//        System.out.printf("| %7s | %6s | %6s | %6s | %6s | %6s | %6s | %6s | %6s |%n"," m = 12",+ m + 10, m - 5,
//                m * 100, m / 2, m % 2, m ^ 2, ++m, --m - 1);
//        System.out.printf("-----------------------------------------------------------------------------------%n");*/



/**14.  Вычислить результат:
xⁿ((5x + 7y) / (8x + 10y)) / ((3x - y)/(x + y)) если x = 7 y = 18
n = 3 Распечатать результат в следующем виде:
If
x = 7
y = 18
n = 3
then
xⁿ((5x + 7y) / (8x + 10y)) / ((3x - y)/(x + y)) = …

*if-else здесь не нужны!
*/
        double x1 = 7;
        double y1 = 18;
        double n = 3;
        double z1 = x1 * x1 * x1;
/**        int result = z * ((5 * x1 + 7 * y1) * (x1 + y1)) / ((3 * x1 - y1) * (8 * x1 + 10 * y1) );*/


        System.out.println(line + "\n" + numOfTask + ++number);
/**        System.out.println( z * ((5 * x1 + 7 * y1) * (x1 + y1)) / ((3 * x1 - y1) * (8 * x1 + 10 * y1) ));*/
/**        System.out.println("If \n" + "x = 7\n" + "y = 18\n" + "n = 3\n" + "then\n"
*                + "xⁿ((5x + 7y) / (8x + 10y)) / ((3x - y)/(x + y)) = " + result );*/

           double res4 = z1*((5*x1 + 7*y1) / (8*x1 + 10*y1)) / ((3*x1 - y1)/(x1 + y1));

           System.out.println(res4);





        int daySewed = 5;
        int sewedSuit = 15;
        int howSewedSuitDay = 69;

        int i = daySewed;
        int u = sewedSuit;
        int o = howSewedSuitDay;



        /**15. Записать условие задачи в виде формулы и вычислить ответ:*/

        System.out.println(line + "\n" + numOfTask + ++number);
        System.out.println("69 / (15 / 3) = " + o / (u / i));


        /**16. Декларировать и инициализировать переменные a, b, c. Распечатать выражение и результаты вычислений:
Сумма чисел a, b, c++ и sumABC-- = …, а разность b++ и  sumCBA = …*/

        int a = 5;
        int b = 10;
        int c = 15;
        int sumABC = a + b + c;
        int sumCBA = c + b + a;


        System.out.println(line + "\n" + numOfTask + ++number);
//        System.out.println(c++ + sumABC--);
        System.out.println("Сумма чисел a, b, c++ и sumABC-- = " + (a + b + c++ + sumABC--));
        System.out.println("Разность b++ и  sumCBA = " + (b++ - sumCBA));

        /**17.(x + c)^2         */


        System.out.println(line + "\n" + numOfTask + ++number);
        System.out.println((x + c) * (x + c));


        /**18*/
        System.out.println(line + "\n" + numOfTask + ++number);
        System.out.println((double) ((3 + 4 * x) / 5) - ((double) (10 * (y - 5) * (a + b + c)) / x)
                / (9 * ((double) (4 / x) / ((double)(9 / x) / y))));



        /**19*/
        int d = 4;

        System.out.println(line + "\n" + numOfTask + ++number);
        System.out.println(

                (((double) (5 * x + 7 * y) / (8 * x + 10 * y)) / ((double) (3 * x - y) / (x + y)))

                        / (double) (a + b + c / d + (a + b) / (c + d) + a * b)


        );
/***        System.out.println(5*5+5*3);*/


        /**20. Ввести в программу формулу конвертации температур C° -> F°. Найти на сайте https://openweathermap.org/
         *температуру в любом городе, и проверьте, соответствует ли температура в С и F вашим расчетным значениям
         * (использовать только int) Кто хочет - проверьте погоду в K (кельвинах) и ее соответствие с расчетным
         *  значением
         */


        System.out.println(line + "\n" + numOfTask + ++number);
/**        fahrenheit = (9 / 5) * celsius + 32
//        System.out.println(line + "\n" + numOfTask + ++number);
//        System.out.println(fahrenheit = (9 / 5) * celsius + 32);*/

        int celsius = 20;
        int fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println(fahrenheit + " \u00b0C");

        double kelvin = -273.15;
        double kelTemp = 287.67;
        double cel = kelTemp + kelvin;
        System.out.println(cel + " \u00b0C");



    }

}
