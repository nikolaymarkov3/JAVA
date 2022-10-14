package homework;

public class HW5 {

    static int tcNumber = 1;

    //Вспомогательные методы для печати отчета тестирования
    public static void printTCNumber(double n) {

        System.out.print("TC_" + n + "\t--\t");
    }

    public static String line(){
        String line = "________________________________________";

        return line;

    }

    public static void taskZ(int n) {
        System.out.println("\n" + "Задание № " + n + "\n");
    }

//    static int expectedResult;
//    static String result = "Pass";

    /**1. Cоздать метод
     verifyEquals(expectedResult, actualResult) {}
     так, как мы делали на уроке. Попробуйте написать его самостоятельно, и потом свериться с кодом с урока.
     */
     public static String verifyEquals(double expectedResult, double actualResult){


         if (expectedResult == actualResult) {

             return "Pass";

         } else {

             return "Fail";
         }

     }

    public static String verifyEquals(String expectedResult, String actualResult) {
        if(expectedResult.equals(actualResult)) {

            return "Pass";
        } else {

            return "Fail";
        }
    }
    public static String verifyEquals(int expectedResult, int actualResult){


        if (expectedResult == actualResult) {

            return "Pass";

        } else {

            return "Fail";
        }

    }
    public static void printTestResult(String value) {
        System.out.print(value);
        System.out.println();
    }


/**2.Написать метод, который принимает на вход число от 1 до 7  и возвращает день недели.
 * В случае невалидных значений метод возвращает “Error”.
 Протестировать метод*/
    public static String day(int d){
        if (d > 0 && d < 8){
            if (d == 1){

                return "Понедельник";
            }
            if (d == 2){

                return "Вторник";
            }
            if (d == 3){

                return "Среда";
            }
            if (d == 4){

                return "Четверг";
            }
            if (d == 5){

                return "Пятница";
            }
            if (d == 6){

                return "Суббота";
            }
            if (d == 7) {

                return "Воскресенье";
            }

        }
        return "Error";

    }

    /**3. Написать алгоритм вычисления среднего возраста (int) в семье из 3х человек.
     Например,
     int age1 = 20,
     int age2 = 40,
     int age3 = 60
     Average = 40.

     или
     age1 = -5;
     age2 = -30;
     age3 = -3;
     должно вернуть  Integer.MIN_VALUE;

     Протестируйте алгоритм на позитивные и негативные сценарии.*/

    public static int reAge(int age1, int age2, int age3, int count){




            int result = (int)(age1 + age2 + age3) / count;

            return result;


//        int result = (age1 + age2 + age3) / count;


    }
    public static int reAge1(int age1, int age2, int age3, int count){

        if (age1 >= 0 && age1 <= 150 && age2 >= 0 && age2 <= 150 && age3 >= 0 && age3 <= 150){

            int result = (int)(age1 + age2 + age3) / count;

            return result;
        }

        return Integer.MIN_VALUE;


//        int result = (age1 + age2 + age3) / count;


    }

    /**4.Найти минимальное  значение, используя переменные (по одному методу на каждый вариант)
     a)k и l
     b)k, l, m
     c)k, l, m, n
     Переменные должны быть типа int
     Happy path test data:
     if k = 3, l = 30, m = 300, n = 3000
     expected results:
     a) 3
     b) 3
     c) 3
     Написать тесты на каждый метод.*/
    public static int findMaxOutOfFour(int k, int l ){

        if (k <= l){

            return k;
        } else {

            return l;
        }


    }

    /**5.Написать алгоритм вычисления среднего значения из 5 показателей температуры тела кота.
     *  Метод принимает и возвращает значения типа double.
     Например,
     t1 = 39
     t2 = 39
     t3 = 39
     t4 = 39
     t5 = 39
     TempAverage = 39
     Не забудьте, что температура тела ЖИВОГО кота имеет определенные границы.
     Значения, которые не входят в эти границы считаем невалидными и выдаем ошибку.
     В случае невалидного значения хотя бы одной из входящих температур, метод возвращает -1.
     Согласно документации клиента https://vetna.info/bolezni/koshki/ponizhennaya-temperatura-u-kota/
     https://junglevet.ru/stati/povyshenie-temperatury-tela-u-koshki/

     кот все еще жив при температурах от 28С до 41С.
     По статистике клиента, некоторые коты могут быть все еще живы при температурах от 25С до 45 С

     Протестируйте метод на позитивные и негативные сценарии.*/

    public static double tempCat(double t1, double t2, double t3, double t4, double t5, int count){



        if (t1 <= 45 && t1 >= 25 && t2 <= 45 && t2 >= 25 && t3 <= 45 && t3 >= 25 && t4 <= 45 && t4 >= 25
            && t5 <= 45 && t5 >= 25){

            double result = (t1 + t2+ t3 + t4 + t5) / count;

                return result;
            }

        return -1;
    }

    /**6.Написать метод, который принимает на вход количество часов (int) работы в день, стоимость
     * одного часа работы в десятичном числе, и возвращает заработную плату в месяц в целых единицах.
     При невалидных значениях метод возвращает -1.
     Уточнения:
     Стоимость одного часа для разных сотрудников может быть разная. Данные о зарплате сотрудников мы
     не разглашаем. НО наши сотрудники не работают бесплатно и не выплачивают компании долги за право работать.
     Зарплата сотрудников рассчитывается согласно законодательства штата.
     Страна = RedRover.school     Штат = Java for beginers
     По законодательству нашего штата минимальная оплата рабочего часа - 12.
     В организации нет сотрудников у которых  сокращенная рабочая неделя ( несовершеннолетние, инвалиды,
     вредные условия труда  ) , но сотрудники могут выбирать, сколько часов в день они могут работать.
     Овертайм оплачивается по обычной ставке.
     ПО уточненным требованиям:
     Будем считать, что в нашей организации вот этот документ определяет      Среднемесячную норму рабочего времени
     https://clubtk.ru/srednee-kolichestvo-rabochikh-dney-v-mesyatse
     Но среднемесячная норма не означает, что нельзя работать больше 8 часов в день.
     Протестируйте метод на позитивные и негативные сценарии*/

    public  static int redRow(int hour, double prise, int day){
        if (hour > 0 && hour <= 24 && prise >= 12){
           int salari = (int) (hour * prise) * day;

           return salari;
        }

        return -1;



    }

    /**Написать метод, который принимает на вход 2 параметра -  цену и количество товара (количество в штуках).
     *  Алгоритм возвращает сумму покупки в виде десятичного числа.
     Например,
     price for 1 = 25 руб 50 коп (25.5)
     amount = 5
     expected total = 127 руб 50 коп (127.5)

     При невалидных значениях метод возвращает -1

     ПРоверьте метод на позитивный и негативный сценарий.*/
    public static String priceSum(double price, double amount){
        double expectedTotal = (amount * price);
//        int rub = (int)(expectedTotal);
        int kop = (int)(expectedTotal * 100 % 100);
        if (amount >0 && price > 0){

            return (int)expectedTotal + " руб " + kop + " коп";
        }

        return "-1";

    }

    /**8.Написать метод, который принимает на вход необходимые параметры и возвращает строку ведомости выдачи
     * зарплаты сотрудникам.
     Например:

     “Смирнова Мария Ивановна 		70000 руб 00 коп”

     если имя сотрудника придет в виде пустой строки или в виде null (String -  это референсный тип данных и
     может принимать значение null), то в ведомости должна быть распечатана пустая строка "".
     Если же на вход придет невалидное данное по зарплате, или зарплата будет рассчитана, как 0,
     то в ведомости тоже должна быть распечатана пустая строка ""

     Протестировать метод.*/
    public static String payRol(String fullName, double salary){
        if (fullName == null || fullName == "" || salary <= 0){

            return "";
        }
        int rub = (int)salary;
        int kop = (int)((salary - rub) * 100);
        String kop1;
        if (kop >= 0 && kop <= 9){
            kop1 = "0" + kop;
        } else {
            kop1 = "" + kop;
        }

        return "" + fullName + "\t\t\t\t" + rub + " руб " + kop1 + " коп";
    }

    /**9. Создать метод, который печатает ведомость для нескольких сотрудников, используя метод из задачи 8,
     * например:

     Смирнова Мария Ивановна 		70000 руб 00 коп
     Серебров Иван Петрович 		128059 руб 00 коп

     Метод в задании 9 может принимать разные параметры, в зависимости от того, что вам нужно для печати ведомости.
     Смысл этого метода - распечатать несколько строк ведомости одновременно.
     Каждая из строк должна формироваться с помощью метода, написанного в задании 8.

     На этот метод писать тесты не нужно, просто распечатать ведомость.*/

    public static void payRol(String fullName, String fullName1, double salary, double salary1){

        System.out.println(payRol(fullName,salary));
        System.out.println(payRol(fullName1,salary1));

    }

    public static String payRol1(String fullName, String fullName1, double salary, double salary1){
        String result = payRol(fullName, salary);
        String result1 = payRol(fullName1, salary1);

        return result + "\n" + result1;
    }


    /**10.Записать в виде метода и протестировать:
     дано int x*/



    public static String x(int x){
        if (x < 0){

            return "x is negative";
        }
        else if(x > 0){

                return "x is positive";
        }

                return "x is zero";






    }

      /**11.Написать метод, который принимает на вход десятичное число (например, 10.75),
     *  и возвращает строку “10 руб 75 коп”.*/

      public static String payRolD1(double number){
//          double expectedTotal = (amount * price);
          int kop = (int) Math.round(number * 100 % 100);
          String kop1;

          if (number > 0) {
//              int rub = (int)(number);
              if (kop >= 0 && kop <= 9) {
                  kop1 = "0" + kop;
              } else {
                  kop1 = "" + kop;
              }

              return (int) number + " руб " + kop1 + " коп";

          }

          return "-1";

      }

    /**12.Написать метод, который принимает на вход десятичное число (например, 10,075) и
     *  возвращает строку “10 кг 75 гр”.*/

    public static String payRolD022(double number){


        if (number > 0){
//            int kg = (int)(number);
            int gr = (int)((number * 1000) % 1000);

            return (int)number + " кг " + gr + " гр.";
        }

        return "-1";

    }

    /**13.Написать метод, который принимает на вход необходимые параметры, и печатает чек.
     *  Этот метод тестировать не нужно, но необходимо использовать все раннее написанные методы
     *  (в задачах из Part 1 тоже могут пригодиться некоторые методы)

     Пример чека:

     Яблоки
     Цена за 1 кг			50 руб 13 коп
     Количество товара	         3 кг 400 гр
     _______________________________________
     Сумма к оплате		170 руб 44 коп

     или

     Хлеб
     Цена за 1 шт		30 руб 50 коп
     Количество товара	5 шт
     _______________________________________
     Сумма к оплате		152 руб 50 коп*/

    public static String cheK(String text, String text1, double price, double amount) {

        if (text != "" || text != "" || price > 0 || amount > 0) {

            if (text1 != "шт") {

                return " " + text + "\n" + " цена за 1 " + text1 + "\t\t\t" + payRolD1(price)
                        + "\n" + " Колличество товара \t" + payRolD022(amount) + "\n"
                        + line() + "\n" + " Сумма к оплате\t\t\t" + priceSum(price, amount);

                }
                return " " + text + "\n" + " цена за 1 " + text1 + "\t\t\t" + payRolD1(price)
                        + "\n" + " Колличество товара \t" + (int)amount + " " + text1 + "\n"
                        + line() + "\n" + "Сумма к оплате\t\t\t" + priceSum(price, amount);





        }

        return "Error";
    }

    /**14.Написать метод, который принимает на вход год рождения и возвращает ваше счастливое число.
     * Счастливое число рассчитывается по формуле: сумма всех чисел, если результат больше 9, снова
     * считается сумма всех чисел.
     Например:
     год рождения 1999
     1 + 9 + 9 + 9 = 28
     2 + 8 = 10
     1 + 0 = 1
     Счастливое число - 1*/

    public static int luckyNumber(int a) {

        int result = (a % 10) + (a / 10 % 10) + (a / 100 % 10) + (a / 1000 % 10);
        if (result < 10) {
            System.out.println("Счастливое число = " + result);
        } else {
            result = (result % 10) + (result / 10 % 10);
            if (result < 10) {
                System.out.println("Счастливое число = " + result);
            } else {
                result = (result % 10) + (result / 10 % 10);
                if (result < 10) {
                    System.out.println("Счастливое число = " + result);
                }
            }
        }
        return result;
    }

    public static String luckyNum(int year){
        int lukNum = year % 9;
        if (lukNum == 0){
            lukNum = 9;
        }

        return " Твоё счастливое число = " + lukNum;

    }

    /**15.
     а) Дано 3 числа. Необходимо рассчитать разницу между средним значением и медианой (median) значением.
     Если разница больше 2, необходимо показать сообщение: “Среднее значение … отличается от медианы … на … “.
     Иначе показать сообщение: “Среднее значение =  …, медиана =  … ”.

     b) Посчитать все то же самое с помощью методов класса Math, где возможно их использовать

     *Медиана - это серединное число в отсортированном наборе чисел.
     1, 3, 9 → медиана 3
     12, 13, 101 → медиана 13
     14, 2, 12 → медиана 12

     ВСе параметры приходят в int, расчеты производим в int

     Протестировать оба метода - a) и b)*/







    public static void main(String[] args) {

         taskZ(2);

         /**Написать метод, который принимает на вход число от 1 до 7  и возвращает день недели.
          *  В случае невалидных значений метод возвращает “Error”.
          Протестировать метод*/

         printTCNumber(1);


        int d = 7;

        String expectedResultString = "Воскресенье";
        String actualResultString = day(d);
        verifyEquals(expectedResultString,actualResultString);
        printTestResult(verifyEquals(expectedResultString,actualResultString));
        printTCNumber(1.1);
        d = 1;

        expectedResultString = "Понедельник";
        actualResultString = day(d);
        verifyEquals(expectedResultString,actualResultString);
        printTestResult(verifyEquals(expectedResultString,actualResultString));
        printTCNumber(1.2);
        d = 8;

        expectedResultString = "Error";
        actualResultString = day(d);
        verifyEquals(expectedResultString,actualResultString);
        printTestResult(verifyEquals(expectedResultString,actualResultString));
        printTCNumber(1.3);
        d = 7;

        expectedResultString = "Error";
        actualResultString = day(d);
        verifyEquals(expectedResultString,actualResultString);
        printTestResult(verifyEquals(expectedResultString,actualResultString));

    /**3. Написать алгоритм вычисления среднего возраста (int) в семье из 3х человек.
     Например,
     int age1 = 20,
     int age2 = 40,
     int age3 = 60
     Average = 40.

     или
     age1 = -5;
     age2 = -30;
     age3 = -3;
     должно вернуть  Integer.MIN_VALUE;*/

        taskZ(3);

        int age1 = 20;
        int age2 = 40;
        int age3 = 60;
        int count = 3;
        int average = (int)(age1 + age2 + age3) / count;

        printTCNumber(2);

        /**авто-тест*/
//        System.out.println(reAge(20,40,60,3));
        int expectedResultInt = average;

        int actualResultInt = reAge1(age1,age2,age3,count);

        verifyEquals(expectedResultInt,actualResultInt);

//        verifyEquals(expectedResulInt,actualResultInt);
//        printTestResult(verifyEquals(expectedResulInt,actualResultInt));
        /**отчет о тесте (report)*/
        printTestResult(verifyEquals(expectedResultInt,actualResultInt));

        age1 = -5;
        age2 = -30;
        age3 = -3;
        average = Integer.MIN_VALUE;

        printTCNumber(2.1);
        /**avto-test*/
        expectedResultInt = average;

        actualResultInt = reAge1(age1,age2,age3,count);

        verifyEquals(expectedResultInt,actualResultInt);
        /**report*/
        printTestResult(verifyEquals(expectedResultInt,actualResultInt));
        System.out.println(reAge1(age1,age2,age3,count));






         age1 = -5;
         age2 = -30;
         age3 = -3;
//         if ()
//       actualResultInt =

        /**4.Найти минимальное  значение, используя переменные (по одному методу на каждый вариант)
         a)k и l
         b)k, l, m
         c)k, l, m, n
         Переменные должны быть типа int
         Happy path test data:
         if k = 3, l = 30, m = 300, n = 3000
         expected results:
         a) 3
         b) 3
         c) 3
         Написать тесты на каждый метод.*/
        taskZ(4);
        printTCNumber(3);
        int k = 3, l = 30, m = 300, n = 3000;
        expectedResultInt = 3;
        actualResultInt = findMaxOutOfFour(k,l);
        verifyEquals(expectedResultInt,actualResultInt);
        printTestResult(verifyEquals(expectedResultInt,actualResultInt));

        printTCNumber(3.1);
        actualResultInt = findMaxOutOfFour(k, findMaxOutOfFour(l,m));
        verifyEquals(expectedResultInt,actualResultInt);
        printTestResult(verifyEquals(expectedResultInt,actualResultInt));

        printTCNumber(3.2);
        actualResultInt = findMaxOutOfFour(k, findMaxOutOfFour(l, findMaxOutOfFour(m, n)));
        verifyEquals(expectedResultInt,actualResultInt);
        printTestResult(verifyEquals(expectedResultInt,actualResultInt));
        System.out.println(expectedResultInt);



        taskZ(5);

        /**5.Написать алгоритм вычисления среднего значения из 5 показателей температуры тела кота.
         *  Метод принимает и возвращает значения типа double.
         Например,
         t1 = 39
         t2 = 39
         t3 = 39
         t4 = 39
         t5 = 39
         TempAverage = 39

         Не забудьте, что температура тела ЖИВОГО кота имеет определенные границы.
         Значения, которые не входят в эти границы считаем невалидными и выдаем ошибку.
         В случае невалидного значения хотя бы одной из входящих температур, метод возвращает -1.

         Согласно документации клиента https://vetna.info/bolezni/koshki/ponizhennaya-temperatura-u-kota/
         https://junglevet.ru/stati/povyshenie-temperatury-tela-u-koshki/

         кот все еще жив при температурах от 28С до 41С.
         По статистике клиента, некоторые коты могут быть все еще живы при температурах от 25С до 45 С

         Протестируйте метод на позитивные и негативные сценарии.*/
        printTCNumber(4);

        double t1 = 39;
        double t2 = 39;
        double t3 = 39;
        double t4 = 39;
        double t5 = 39;
        count = 5;

        double tempAverage = (t1 + t2+ t3 + t4 + t5) / count;

        double expectedResultD = tempAverage;

        double actualResultD =tempCat(t1, t2, t3, t4, t5, count);

        verifyEquals(expectedResultD,actualResultD);

        printTestResult(verifyEquals(expectedResultD,actualResultD));

        printTCNumber(4.1);

        t5 = 24;

        tempAverage = -1;

        expectedResultD = tempAverage;

        actualResultD =tempCat(t1, t2, t3, t4, t5, count);


        verifyEquals(expectedResultD,actualResultD);

        printTestResult(verifyEquals(expectedResultD,actualResultD));
        System.out.println(tempCat(t1, t2, t3, t4, t5, count));

        /**6.Написать метод, который принимает на вход количество часов (int) работы в день,
         *  стоимость одного часа работы в десятичном числе, и возвращает заработную плату в месяц в целых единицах.
         При невалидных значениях метод возвращает -1.
         Уточнения:
         Стоимость одного часа для разных сотрудников может быть разная.
         Данные о зарплате сотрудников мы не разглашаем. НО наши сотрудники не работают бесплатно и не выплачивают
         компании долги за право работать. Зарплата сотрудников рассчитывается согласно законодательства штата.

         Страна = RedRover.school
         Штат = Java for beginers

         По законодательству нашего штата минимальная оплата рабочего часа - 12.

         В организации нет сотрудников у которых  сокращенная рабочая неделя ( несовершеннолетние, инвалиды,
         вредные условия труда  ) , но сотрудники могут выбирать, сколько часов в день они могут работать.
         Овертайм оплачивается по обычной ставке.

         ПО уточненным требованиям:
         Будем считать, что в нашей организации вот этот документ определяет
         Среднемесячную норму рабочего времени
         https://clubtk.ru/srednee-kolichestvo-rabochikh-dney-v-mesyatse

         Но среднемесячная норма не означает, что нельзя работать больше 8 часов в день.*/
        taskZ(6);
        printTCNumber(5);
        int hour = 8;
        double prise = 12;
        int day = 21;
        redRow(hour,prise,day);
        int salari = (int) (hour * prise) * day;
        expectedResultInt = 2016;
        actualResultInt = salari;

        verifyEquals(expectedResultInt,actualResultInt);

        printTestResult(verifyEquals(expectedResultInt,actualResultInt));

        System.out.println(redRow(hour,prise,day));

        printTCNumber(5.1);
        hour = 0;
        prise = 12;
        redRow(8,12,21);
        salari = (int) (hour * prise);
        expectedResultInt = 0;
        actualResultInt = salari;

        verifyEquals(expectedResultInt,actualResultInt);

        printTestResult(verifyEquals(expectedResultInt,actualResultInt));

        System.out.println(redRow(hour,salari,day));


        /***/

        taskZ(7);
        printTCNumber(6);

        int amount = 5;
        double price = 25.5;

        expectedResultString = "price for 1 = 127 руб 50коп";

        actualResultString = priceSum(price,amount);


        priceSum(price,amount);

        verifyEquals(expectedResultString,actualResultString);
        printTestResult(verifyEquals(expectedResultString,actualResultString));
        System.out.println(priceSum(price,amount));

        printTCNumber(6);

        amount = 0;
        price = 25.5;

        expectedResultString = "-1";

        actualResultString = priceSum(price,amount);


        priceSum(price,amount);

        verifyEquals(expectedResultString,actualResultString);
        printTestResult(verifyEquals(expectedResultString,actualResultString));
        System.out.println(priceSum(price,amount));


        taskZ(8);
        printTCNumber(7);

        String fullName = "Смирнова Мария Ивановна";

        double salary = 70000.00;

        expectedResultString = "Смирнова Мария Ивановна\t\t\t\t70000 руб 00 коп";

        actualResultString = payRol(fullName,salary);

        verifyEquals(expectedResultString,actualResultString);

        printTestResult(verifyEquals(expectedResultString,actualResultString));

        payRol(fullName,salary);
        System.out.println(payRol(fullName,salary));

        printTCNumber(7.1);

        fullName = "Смирнова Мария Ивановна";

        salary = -1;

        expectedResultString = "";

        actualResultString = payRol(fullName,salary);

        verifyEquals(expectedResultString,actualResultString);

        printTestResult(verifyEquals(expectedResultString,actualResultString));

        payRol(fullName,salary);

        System.out.println(payRol(fullName,salary));


        /**9.Создать метод, который печатает ведомость для нескольких сотрудников, используя метод из задачи 8,
         * например:

         Смирнова Мария Ивановна 		70000 руб 00 коп
         Серебров Иван Петрович 		128059 руб 00 коп

         Метод в задании 9 может принимать разные параметры, в зависимости от того, что вам нужно для печати ведомости.
         Смысл этого метода - распечатать несколько строк ведомости одновременно.
         Каждая из строк должна формироваться с помощью метода, написанного в задании 8.

         На этот метод писать тесты не нужно, просто распечатать ведомость.*/

        taskZ(9);

        salary = 70000;

        String fullName1 = "Серебров Иван Петрович";

        double salary1 = 128059;

        payRol(fullName,fullName1,salary,salary1);

        System.out.println("\n");


        payRol1(fullName,fullName1,salary,salary1);
        printTestResult(payRol1(fullName,fullName1,salary,salary1));


        /**10.Записать в виде метода и протестировать:
         дано int x*/

        taskZ(10);
        printTCNumber(8);

        int x = 0;

        x(x);

        expectedResultString = "x is zero";

        actualResultString = x(x);

        verifyEquals(expectedResultString,actualResultString);

        printTestResult(verifyEquals(expectedResultString,actualResultString));
        printTestResult(x(x));

        printTCNumber(8.1);

        x = 1;

        x(x);

        expectedResultString = "x is positive";

        actualResultString = x(x);

        verifyEquals(expectedResultString,actualResultString);

        printTestResult(verifyEquals(expectedResultString,actualResultString));
        printTestResult(x(x));

        printTCNumber(8.2);

        x = -2;

        x(x);

        expectedResultString = "x is negative";

        actualResultString = x(x);

        verifyEquals(expectedResultString,actualResultString);

        printTestResult(verifyEquals(expectedResultString,actualResultString));
        printTestResult(x(x));


        /**11.Написать метод, который принимает на вход десятичное число (например, 10.75),
         *  и возвращает строку “10 руб 75 коп”.*/

        taskZ(11);
        printTCNumber(8);


        expectedResultString = "10 руб 75 коп";

        actualResultString = payRolD1(10.75);

        payRolD1(10.75);

        verifyEquals(expectedResultString,actualResultString);

        printTestResult(verifyEquals(expectedResultString,actualResultString));
        printTestResult(payRolD1(10.75));

        double number = 10.75;


        /**12.Написать метод, который принимает на вход десятичное число (например, 10,075) и
         *  возвращает строку “10 кг 75 гр”.*/

        taskZ(12);
        printTCNumber(9);

        payRolD022(10.075);

        expectedResultString = "10 кг 75 гр.";

        actualResultString = payRolD022(10.075);

        verifyEquals(expectedResultString,actualResultString);

        printTestResult(verifyEquals(expectedResultString,actualResultString));

        printTestResult(payRolD022(10.075));


        /**13.Написать метод, который принимает на вход необходимые параметры, и печатает чек.
         *  Этот метод тестировать не нужно, но необходимо использовать все раннее написанные методы
         *  (в задачах из Part 1 тоже могут пригодиться некоторые методы)

         Пример чека:

         Яблоки
         Цена за 1 кг			50 руб 13 коп
         Количество товара	         3 кг 400 гр
         _______________________________________
         Сумма к оплате		170 руб 44 коп

         или

         Хлеб
         Цена за 1 шт		30 руб 50 коп
         Количество товара	5 шт
         _______________________________________
         Сумма к оплате		152 руб 50 коп*/

        taskZ(13);
        printTCNumber(10);
        System.out.println("\n");

        cheK("Яблоки","кг",50.13,3.400 );

        printTestResult(cheK("Яблоки","шт",50.13,3 ));


        taskZ(14);

        /**14.Написать метод, который принимает на вход год рождения и возвращает ваше счастливое число. Счастливое число рассчитывается по формуле: сумма всех чисел, если результат больше 9, снова считается сумма всех чисел.
         Например:
         год рождения 1999
         1 + 9 + 9 + 9 = 28
         2 + 8 = 10
         1 + 0 = 1
         Счастливое число - 1*/

        luckyNumber(6666);
        luckyNum(-12);
        printTestResult(luckyNum(66));






















































    }




}
