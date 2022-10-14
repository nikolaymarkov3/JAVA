package homework;

public class HW4 {

    static String task = "Задание № ";
    static int num = 1;
//    static int k = 10;
//    static int l = 10;
//    static int m = 10;

    public static void appStud(int apple, int student) {
        int studApple = apple / student;
        int forTeacher = apple % student;
        String chS = "";
        String chT = "";
        String chStud = "";
        String chA = "";

        if (apple == 1) {
            chA = "o";
        } else if (apple >= 2 && apple < 5) {
            chA = "a";
        } else if (apple >= 5 && apple < 21) {
            chA = "";
        } else if (apple >= 21) {
            if (apple % 10 == 1) {
                chA = "o";
            } else if (apple % 10 >= 2 && apple % 10 <= 4) {
                chA = "a";
            } else if (apple % 10 >= 5 && apple % 10 <= 9 || apple % 10 == 0) {
                chA = "";
            }
        }
        if (studApple == 1) {
            chS = "у";
        } else if (studApple >= 2 && studApple < 5) {
            chS = "a";
        } else if (studApple >= 5) {
            chS = "";
        }
        if (student >= 1 && student < 5) {
            chStud = "a";
        } else if (student >= 5 && student < 21) {
            chStud = "ов";
        } else if (student >= 21) {
            if (student % 10 == 1 || student % 10 >= 2 && student % 10 <= 4) {
                chStud = "a";
            } else if (student % 10 >= 5 && student % 10 <= 9 || student % 10 == 0) {
                chStud = "ов";
            }
        }
        if (forTeacher == 1) {
            chT = "о";
        } else if (forTeacher >= 2 && forTeacher < 5) {
            chT = "a";
        } else if (forTeacher >= 5) {
            chT = "";
        } else if (forTeacher >= 21) {
            if (forTeacher % 10 == 1) {
                chT = "o";
            } else if (forTeacher % 10 >= 2 && forTeacher % 10 <= 4) {
                chT = "a";
            } else if (forTeacher % 10 >= 5 && forTeacher % 10 <= 9 || forTeacher % 10 == 0) {
                chT = "";
            }
        }
        System.out.println("Если " + apple + " яблок" + chA + " поделить на " + student + " ученик" + chStud + "," +
                " то каждый ученик получит по " + studApple + " яблок" + chS + ",\n"
                + "и " + forTeacher + " яблок" + chT + " останется учителю.");
    }

    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void diff(int k, int l, int m) {
        if (k != 0 && l != 0 && m != 0) {
            System.out.println("Результат деления k на l = " + k / l + ", а остаток от деления = " + k % l);
            System.out.println("Результат деления k на m = " + k / m + ", а остаток от деления = " + k % m);
            System.out.println("Результат деления l на m = " + l / m + ", а остаток от деления = " + l % m);
            System.out.println("Результат деления m на k = " + m / k + ", а остаток от деления = " + m % k);
        } else {
            System.out.println("Одно из чисел = 0");
        }

    }


    public static void line() {
        System.out.println("____________________________________________________________________________________");
    }

    public static int pow(int value) {
        return value * value;
    }

    public static void task() {

        System.out.println(task + ++num);

    }

    public static void taskZ(String t, int n) {
        System.out.println(t + n);
    }

    public static void taskZ(char a, String c) {
        System.out.println(a + c);
    }

    public static void task(String text, int Number, char buk) {

        System.out.println(text + Number + buk);

    }

    public static void subTask(int Number, String text) {

        System.out.println(Number + ")");

    }

    public static void sleN() {
        System.out.println("\n");
    }


    public static void task(String text, double Number) {

        System.out.println(text + Number);

    }

    public static void tempC(int c) {

        System.out.println(c + "\u00b0C");
        System.out.println(c * 9 / 5 + 32 + "F");

    }

    public static void speAve(double distance, double time) {
        double speedAverage = distance / time;
        System.out.println(speedAverage);

    }

    public static void printRow(String row, int Num) {
        String lineN;
        System.out.print(
                lineN = "\t_____________________________________________________________________________________\n"


//                + vLine + (Num + 10)
//                + vLine + (Num - 5)
//                +
//


        );
    }


    public static void tab() {


        float ff = 10 / 3f;
        double dd = 10 / 3d;
        float f = 100.101101F;
        double d = 100.101101;
        String endLine = "\t|";
        String tabN = "\t|\t";
//    string lineN = "\t_____________________________\n";
        Float floatSum = f + ff;
        Float floatSub = f / ff;
        Float floatProduct = f * ff;
        Float floatQuotient = f / ff;
        Float floatRemainder = f % ff;
        String lineN = "\t_____________________________________________________________________________________\n";
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
        String flRemainder = "floatRemainde";
        String douSum = "doubleSum = ";
        String douSub = "doubleSub = ";
        String douProd = "doubleProduct = ";
        String douQuo = "doubleQuotient = ";
        String douRem = "doubleRemainde";
        double doubleSum = d + dd;
        double doubleSub = d - dd;
        double doubleProduct = d * dd;
        double doubleQuotient = d / dd;
        double doubleRemainder = d % dd;
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
                + tab1 + tabN);

        System.out.println(ANSI_BLUE
                + douSub
                + doubleSub
                + ANSI_RESET
                + tab1 + tab
                + endLine);


        System.out.print(lineN
                + tabN
                + ANSI_BLUE
                + flProd
                + floatProduct
                + ANSI_RESET
                + tab + tabN);

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
                + tab + tabN);

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
                + tab1 + tabN);

        System.out.println(ANSI_BLUE
                + douRem
                + doubleRemainder
                + ANSI_RESET
                + tab1 + endLine);

        System.out.println(lineN);
    }

    public static void desR(int num) {
        if (num >= -32768 && num <= 32767) {
            if (num / 10 == 0) {
                System.out.println(num + "It’s a one-digit number");
            } else if (num / 100 == 0) {
                System.out.println(num + " It’s a two-digit number");
            } else if (num / 1000 == 0) {
                System.out.println(num + " It’s a three-digit number");
            } else if (num / 10000 == 0) {
                System.out.println(num + " It’s a four-digit number");
            } else if (num / 100000 == 0) {
                System.out.println(num + " It’s a five-digit number");
            }
        } else {
            System.out.println("Число не типа шорт");
        }

    }


    public static void main(String[] args) {

        /**1.	В пакете homework создать класс HW4, всю работу выполнять в этом классе.
         Не забываем, что все методы у нас пока public static void.
         Если вы хотите вынести общие для класса переменные за метод main, то делайте их static

         2.	Написать метод, который будет печатать номер задания перед каждым ответом. Придумайте свой дизайн.
         */
        line();
        task();
/**3.	Записать в виде кода следующие логические выражения:
 1) (2 = 2) И (7 = 7);
 2) Не(15 < 3);
 3) ("Сосна" = "Дуб") ИЛИ ("Вишня" = "Клён");
 4) Не("Сосна" = "Дуб");
 5) (Не(15 < 3)) И (10 > 20);
 6) ("Глаза даны, чтобы видеть") И ("Под третьим этажом находится второй этаж");
 7) (6/2 = 3) ИЛИ (7*5 = 20
 */
        line();
        task();
        subTask(1, ")");

        System.out.println("(2==2) && (7 ==7) = " + ((2 == 2) && (7 == 7)));


        sleN();
        subTask(2, ")");
        System.out.println("!(15 < 3) = " + !(15 < 3));


        sleN();
        subTask(3, ")");
        System.out.println("((Сосна = Дуб) || (Вишня = Клён)) = " + ("Сосна".equals("Дуб") || "Вишня".equals("Клён")));

        sleN();
        subTask(4, ")");
        System.out.println("(\"Сосна\" = \"Дуб\") = " + !("Сосна".equals("Дуб")));

        sleN();
        subTask(5, ")");

        System.out.println("(Не(15 < 3)) И (10 > 20) = " + (!(15 < 3) && (10 > 20)));

        sleN();
        subTask(6, ")");
        String u = "(\"Глаза даны, чтобы видеть\") && (\"Под третьим этажом находится второй этаж\")";


        System.out.println();
        ;


        System.out.println("(Глаза даны, чтобы видеть) И (Под третьим этажом находится второй этаж) = " +
                Boolean.parseBoolean(u));

        sleN();
        subTask(7, ")");

        System.out.println("(6/2 = 3) ИЛИ (7*5 = 20) = " + ((6 / 2 == 3) || (7 * 5 == 20)));


        /**4.	а) Света младше Андрея и Наташи
         б) На полке стоят учебники, а на столе лежат справочники.
         в) БОльшая часть детей — девочки. Остальные - мальчики.
         */
        line();
        task("Задание # ", 4, 'а');
        int ageS;
        int ageA;
        int ageN;

        System.out.println("(ageS < ageA) && (ageS < ageN)");

        task("\nЗадание # ", 4, 'б');

        System.out.println("(На полке стоят учебники) && (а на столе лежат справочники)");

        task("\nЗадание # ", 4, 'в');

        System.out.println("(БОльшая часть детей — девочки) && (Остальные - мальчики)");

        line();
        taskZ("Задание № ", 5);

        /**5.	“Водительские права можно получить, только когда исполнится 16 лет*/

        int age;

        age = 11;

        if (age >= 16) {
            System.out.println("Водительские права можно получить");
        } else {
            System.out.println("Еще надо подрости");
        }

        line();
        taskZ("Задание № ", 6);

        /**Петя не едет в автобусе, но при этом читает книгу или не смотрит в окно*/

        System.out.println("(Петя не едет в автобусе) && (но при этом читает книгу) || (не смотрит в окно)");

        line();
        taskZ("Задание № ", 7);

        /**7.	“Если с другом ты, это хорошо, а когда наоборот - плохо”*/

        System.out.println("if (Если с другом ты)\n {System.out.println(это хорошо)} \nelse {System.out.println(плохо)}");

        line();
        taskZ("Задание № ", 8);

        /**8.	Проверить число x, которое может принимать значения 10, 12, -3, 5 и 0.
         Если x больше 10, то вывести на печать “x больше 10”.
         Если x меньше нуля, то вывести на печать “x - отрицательное число”
         Если x = 5, то вывести на печать “Разность x и 5 равна 0”
         Иначе вывести на печать “Число x меньше 11, больше или равно 0, но не равно 5”.
         Проверить, соответствует ли последнее утверждение всем предыдущим утверждениям.
         */

        int x = 6;

        if (x > 10) {
            System.out.println("x больше 10");
        } else if (x < 0) {

            System.out.println("x - отрицательное число");
        } else if (x == 5) {
            x = 0;
            System.out.println("Разность x и 5 = 0");
        } else {
            System.out.println("Число x меньше 11, больше или равно 0, но не равно 5");
        }

        /**Test*/

        int expectedResult = 12;
        int actualResult = x;

        if (actualResult == expectedResult) { /** Если переменная ссылочная то ((actualResult.equals(expectedResult))*/
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        line();
        taskZ("Задание № ", 9);
        /**9.	Проверьте число на четность. Если число четное, удвойте это число, иначе возведите число в квадрат.
         *  Выведите результат работы алгоритма на печать.Найдите в презентации,
         *  какой блок схеме соответствует ваш алгоритм.*/

        int n = 9;

        if (n % 2 == 0) {
            n = n * 2;
            System.out.println(n);
        } else {
            n = n * n;
            System.out.println(n);


        }

        System.out.println("if () {\n" +
                "\n" +
                "        } else {\n" +
                "\n" +
                "        }");

        line();
        taskZ("Задание № ", 10);
        taskZ('a', ")");

        /**10.	Напишите алгоритм проверки возраста на соответствие условиям (if-else):
         a)	Голосовать можно с 18 лет
         b)	Машину можно водить с 16 лет
         c)	В школу можно идти с 5 лет
         Выведите результат работы алгоритма на печать.
         */

        age = 60;
        if (age <= 150 && age >= 0) {
            if (age >= 18) {
                System.out.println("Голосовать можно");
            } else {
                System.out.println("Голосовать нельзя");
            }
            taskZ('b', ")");
            if (age >= 16) {
                System.out.println("Машину можно водить");
            } else {
                System.out.println("Нельзя водить машину");
            }
            taskZ('c', ")");
            if (age >= 5) {
                System.out.println("В школу можно идти");
            } else {
                System.out.println("Детский садик");
            }
        } else {
            System.out.println("Введите корректную цифру");
        }
        /**11.	Напишите алгоритм программы, которая проверяет оценку ученика и выполняет следующие действия:
         a)	5 - выдать похвальную грамоту и перевести в следующий класс
         b)	4 - перевести в следующий класс
         c)	3 - дать задание на лето и перевести в следующий класс
         d)	2 - вызвать родителей и оставить в текущем классе на второй год
         Выведите результат работы алгоритма на печать.
         */
        int est = 6;

        line();
        taskZ("Задание № ", 11);
        if (est >= 2 && est <= 5) {
            if (est == 5) {
                System.out.println("выдать похвальную грамоту и перевести в следующий класс");
            } else if (est == 4) {
                System.out.println("перевести в следующий класс");
            } else if (est == 3) {
                System.out.println("дать задание на лето и перевести в следующий класс");
            } else {
                System.out.println("вызвать родителей и оставить в текущем классе на второй год");
            }
        } else {
            System.out.println("Введите корректную цыфру");
        }

        line();
        taskZ("Задание № ", 12);
        /**12.	Напишите метод, который примет на вход температуру в Цельсиях,
         * и распечатает результат температуры в Цельсиях и в Фаренгейтах.*/

        tempC(32);

        line();
        taskZ("Задание № ", 13);

        /**13.	Напишите алгоритм программы, которая проверяет 2 числа. Программа складывает числа,
         * которые делятся на 3 без остатка, и вычитает числа, которые делятся на 5 без остатка.
         * ПРограмма выводит на печать результат вычислений.
         Программа умножает числа, которые делятся на 2 без остатка, но если хотя бы одно число отрицательное,
         программа умножает результат действия на (-1). ПРограмма выводит на печать результат вычислений.
         Если числа не прошли ни одну проверку, программа выводит на печать ошибку о невозможности произвести действия.
         */
        int q = 30;
        int w = 30;
        if ((q % 3 == 0 && w % 3 == 0) || (q % 5 == 0 && w % 5 == 0) || (q % 2 == 0 && w % 2 == 0)) {
            if (q % 3 == 0 && w % 3 == 0) {
                int sum = q + w;
                System.out.println(sum);
            }
            if (q % 5 == 0 && w % 5 == 0) {
                int sum = q - w;
                System.out.println(sum);
            }
            if (q % 2 == 0 && w % 2 == 0) {
                if (q >= 0 && w >= 0) {
                    System.out.println(q * w);/**если хотя бы одно число отрицательное,
                     программа умножает результат действия на (-1)*/
                } else if (q < 0 || w < 0) {
                    int sum = q * w * -1;/**Программа умножает числа, которые делятся на 2 без остатка*/
                    System.out.println(sum);
                }
            }
        } else {
            System.out.println("Error: действие невозможно выполнить");
        }

        line();
        taskZ("Задание № ", 14);

        /**14.	Распечатать следующие выражения, используя метод и параметры k, l, m:
         Результат деления k на l = …, а остаток от деления  = …
         Результат деления k на m = …, а остаток от деления  = …
         Результат деления l на m = …, а остаток от деления  = …
         Результат деления m на k = …, а остаток от деления  = …
         */
        diff(15, 20, 0);

        line();
        taskZ("Задание № ", 15);

        /**Решить задачу
         В клетке находятся фазаны и кролики. Известно, что у них 35 голов и 94 ноги.
         Узнайте число фазанов и число кроликов.

         Проверить работу вашего алгоритма тестом.*/

        int rabbit = (94 - (35 * 2)) / (4 - 2);
        int pheasant = 35 - rabbit;

        System.out.println(rabbit + " Кроликов");
        System.out.println(pheasant + " Фазана");

        /**Test*/

        int x1 = rabbit;

        int expectedResult1 = 12;
        int actualResult1 = x1;

        if (actualResult1 == expectedResult1) { /**Если переменная ссылочная то ((actualResult.equals(expectedResult))*/
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        line();
        taskZ("Задание № ", 16);

        /**Написать метод, который рассчитывает среднюю скорость движения (speedAverage) транспортного средства
         * или живого существа с разными параметрами distance и  time.
         Протестировать метод.


         Тестовые данные:
         distance		time
         12			20 min
         150		2,5 hours
         300		1¾ hours*/

        speAve(12, 0.3333);
        speAve(150, 2.5);
        speAve(300, 1.45);


        line();
        taskZ("Задание № ", 17);
        /**17.Выполнить задание 7 и 8 из HW2 с помощью метода и параметров:

         Написать метод так, чтобы правильные склонения слов (н-р, яблок, яблоко или яблока; ученики - учеников…)
         печатались автоматически в зависимости от значений параметров.
         Распечатать выражение с параметрами:
         apple = 42, 55, 1
         student = 42, 5, 2*/

        appStud(42, 42);
        appStud(55, 5);
        appStud(1, 2);

        line();
        taskZ("Задание № ", 18);

        /**18.Распечатать таблицу из HW3,  задание 11 с помощью методов и параметров
         * (значения f, ff, d, dd могут быть любыми). Обратите внимание на то, что левая часть таблицы
         * у вас почти такая же, как правая часть таблицы.*/

        tab();

        line();
        taskZ("Задание № ", 19);

        /**19.Напишите алгоритм программы, которая проверяет число типа short на количество разрядов, и
         * выводит результат проверки.
         ( Например, “It’s a two-digit number.”, “It’s a five-digit number.”, etc)
         Выведите результат проверки на печать.*/
        desR(-31000);




        line();
        taskZ("Задание № ", 20);

        /**На сайте https://openweathermap.org/ зарегистрироваться и получить ключ (key).
         * Найти в документации пример запроса с параметрами “Название города” (а не с географическими координатами).
         * Сформировать и отправить запрос на сервер (manually). В полученном ответе найти географические
         * координаты для следующих городов
         London
         Paris
         Rome*/

        System.out.println("London: {\"coord\":{\"lon\":-0.1257,\"lat\":51.5085}");
        System.out.println("Paris: {\"coord\":{\"lon\":2.3488,\"lat\":48.8534}");
        System.out.println("Rome: {\"coord\":{\"lon\":-85.1647,\"lat\":34.257}");












    }
}


