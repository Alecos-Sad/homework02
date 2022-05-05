package com.itstep.homework.task;

import java.util.Arrays;
import java.util.Locale;
import java.util.Random;

/**
 * homework 02
 *
 * @author kaa
 * @version 1.1
 * @see "https://metanit.com/java/tutorial/7.1.php"
 * @see "https://metanit.com/java/tutorial/7.2.php"
 * @see "http://proglang.su/java/strings"
 * @see "https://metanit.com/java/tutorial/2.6.php"
 * @see "https://metanit.com/java/tutorial/2.4.php"
 * @see "http://proglang.su/java/loops-and-loop-operators"
 * @see "http://proglang.su/java/arrays"
 */
public class Homework {

    /**
     * создай две строки, попробуй их объеденить
     */
    public void task1() {
        // твой код: start
        String str1 = "Sadovnikov";
        String str2 = "Sasha";
        System.out.println(str1 + " " + str2);
        // твой код: end
    }

    /**
     * тоже самое, только другим способом
     */
    public void task2() {
        // твой код: start
        String str1 = "Sadovnikov";
        String str2 = "Sasha ";
        str2 = str2.concat(str1);
        System.out.println(str2);
        // твой код: end
    }

    /**
     * тоже самое, только другим способом
     */
    public void task3() {
        // твой код: start
        String str1 = "Sadovnikov";
        String str2 = "Sasha";
        String str3 = String.join(" ", str1, str2);
        System.out.println(str3);
        // твой код: end
    }

    /**
     * есть две строки, нужно выяснить идентичны ли они по своему содержанию
     */
    public void task4() {
        String str1 = "12345678";
        String str2 = Integer.valueOf(str1).toString();
        // твой код: start
        System.out.println(str1.equals(str2));
        // твой код: end
    }

    /**
     * тоже самое, только другим способом
     */
    public void task5() {
        // твой код: start
        String str1 = "12345678";
        String str2 = Integer.valueOf(str1).toString();
        System.out.println(str1.equalsIgnoreCase(str2));
        // твой код: end
    }

    /**
     * тоже самое, только другим способом
     */
    public void task6() {
        // твой код: start
        String str1 = "12345678";
        String str2 = Integer.valueOf(str1).toString();
        System.out.println(str1.compareTo(str2));
        // твой код: end
    }

    /**
     * тоже самое, только другим способом
     */
    public void task7() {
        // твой код: start
        String str1 = "12345678";
        String str2 = Integer.valueOf(str1).toString();
        System.out.println(str1.compareToIgnoreCase(str2));
        // твой код: end
    }

    /**
     * попробуй перевести строку сначала в верхний регистр, затем в нижний
     */
    public void task8() {
        String str = "qwerty";
        // твой код: start
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        // твой код: end
    }

    /**
     * у тебя есть строка содержащая твою фамилию
     * но фамилия находится в нижнем регистре
     * попробуй сделать так, чтобы первая буква была переведена в верхний регистр
     */
    public void task9() {
        // твой код: start
        String str = "sadovnikov";
        System.out.println(str.substring(0, 1).toUpperCase() + str.substring(1));
        // твой код: end
    }

    /**
     * попробуй избавить строку от лишних пробелов в начале и в конце если это необходимо
     * и проверь потом, содержит ли эта строка пробелы
     */
    public void task10() {
        String str = "  str  ";
        // твой код: start
        str = str.trim();
        System.out.println(str.indexOf(" "));
        // твой код: end
    }

    /**
     * избавься от всех пробелов в строке если это необходимо
     * и проверь потом, содержит ли эта строка пробелы
     */
    public void task11() {
        String str = " тебе нужно получить часть строки ";
        // твой код: start
        str = str.replace(" ", "");
        System.out.println(str.contains(" ") ? "есть пробел" : "нет пробелов");
        // твой код: end
    }

    /**
     * попробуй преобразовать строку таким образом, чтобы получить следующий результат:<br>
     * "тебе нужно получить новую строку"
     */
    public void task12() {
        String str = "тебе нужно получить часть строки";
        String strRepl = str.replace("часть строки", "новую строку");
        System.out.println(strRepl);
        // твой код: start

        // твой код: end
    }

    /**
     * тебе нужно получить часть строки<br>
     * в первом случае, начиная от 6го символа<br>
     * во втором случае, начиная от 6го символа по 10й включительно
     */
    public void task13() {
        String str = "тебе нужно получить часть строки";
        // твой код: start
        str = str.substring(5);
        System.out.println(str);
        str = str.substring(0, 5);
        System.out.println(str);
        // твой код: end
    }

    /**
     * у тебя есть переменная содержащая символ<br>
     * используй ее так, чтобы обрезать строку начиная с первого вхождения этого символа и до последнего вхождения<br>
     * учти, этот символ должен присутствовать в начале и в хвосте результирующей строки<br>
     * идеальное решение должно уместится в одну строку кода
     */
    public void task14() {
        char ch = 'о';
        String str = "в первом случае, начиная от 6го символа";
        // твой код: start
        System.out.println(str.substring(str.indexOf("о"), str.lastIndexOf("о") + 1));
        // твой код: end
    }

    /**
     * у тебя есть строка в которой очень много букв 'о' но сколько их на самом деле?<br>
     * реши задачу в одну строку кода не прибегая к помощи циклов<br>
     * о затраченной при этом памяти не беспокойся
     */
    public void task15() {
        String str = "используй ее так, чтобы обрезать строку начиная с первого вхождения этого символа и до последнего вхождения";
        // твой код: start
        System.out.println(str.length() - str.replace("о", "").length());
        // твой код: end
    }

    /**
     * тоже самое, только другим способом<br>
     * ограничений нет
     */
    public void task16() {
        String str = "используй ее так, чтобы обрезать строку начиная с первого вхождения этого символа и до последнего вхождения";
        // твой код: start
        int count = 0;
        char[] array = str.toCharArray();
        for (char c : array) {
            if (c == 'о') {
                count++;
            }
        }
        System.out.println(count);
        // твой код: end
    }

    /**
     * тоже самое, только другим способом<br>
     * ограничений нет
     */
    public void task17() {
        String str = "используй ее так, чтобы обрезать строку начиная с первого вхождения этого символа и до последнего вхождения";
        // твой код: start
        str = str.substring(str.indexOf("о"), str.lastIndexOf("о") + 1);
        String[] array = str.split("о");
        System.out.println(array.length);
        // твой код: end
    }

    /**
     * у тебя есть строка, нужно привести ее в стиль camelCase<br>
     * есть несколько решений этой задачи, ты можешь применить любой
     */
    public void task18() {
        String str = "я самый лучший самый лучший я";
        // твой код: start
        StringBuffer sb = new StringBuffer();
        for (String s : str.split(" ")) {
            sb.append(Character.toUpperCase(s.charAt(0)));
            if (s.length() > 1) {
                sb.append(s.substring(1).toLowerCase());
            }
        }
        System.out.println(sb);
        // твой код: end
    }

    /**
     * почувствуй себя разработчиком<br>
     * это реальная задача с реального проекта<br>
     * у нас есть понятие штрихкода (ШК) товара<br>
     * 2100811456347<br>
     * где:<br>
     * 21 - префикс ШК<br>
     * 00811 - plu-код для весов с лидирующими нулями, минимальное число - 1, максимальное число - 99999<br>
     * 456347 - сведения о цене или весе товара (в зависимости от условий страны)<br>
     * задача:<br>
     * у тебя есть следующие данные:<br>
     * 21 - префикс ШК<br>
     * 56 - plu-код<br>
     * 123456 - число в котором зашифрованы данные о товаре (см. выше)<br>
     * тебе нужно одной строкой кода создать полный ШК типа EAN-13 следующего вида:<br>
     * 2100056123456<br>
     * в строке ШК всегда 13 символов, это следует учесть
     */
    public void task19() {
        int barcodePrefix = 21;
        int pluCode = 56;
        int data = 123456;
        String zeroLine = "00000";
        // твой код: start
        int[] array = {1, 12, 123, 1234, 12345};
        for (int i = 0; i < array.length; i++) {
            String code = barcodePrefix + (zeroLine + array[i]).substring((zeroLine + array[i]).length() - zeroLine.length()) + data;
            System.out.println(code);
        }
        // твой код: end
    }

    /**
     * тоже самое, но без операций со строками
     */
    public void task20() {
        int barcodePrefix = 21;
        int pluCode = 156;
        int data = 123456;
        // твой код: start
        int[] array = {1, 12, 123, 1234, 12345};
        for (int i = 0; i < array.length; i++) {
            long сode = barcodePrefix * 100000000000L + array[i] * 1000000L + data;
            System.out.println(сode);
        }
        // твой код: end
    }

    /**
     * у тебя есть строка<br>
     * переведи каждый нечетный символ в верхний регистр<br>
     * а каждый четный в нижний регистр
     */
    public void task21() {
        String str = "Гарри Гаррисон - Специалист по этике.";
        // твой код: start
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            stringBuffer.append(i % 2 == 0 ? str.substring(i, i + 1).toUpperCase() : str.substring(i, i + 1).toLowerCase());
        }
        System.out.println(stringBuffer);
        // твой код: end
    }

    /**
     * у тебя есть строка<br>
     * создай цикл который будет всегда удалять последний символ в строке
     */
    public void task22() {
        String str = "Гарри Гаррисон - Специалист по этике.";
        // твой код: start
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.substring(0, str.length() - i));
        }
        // твой код: end
    }

    /**
     * у тебя есть строка<br>
     * создай цикл который будет всегда удалять первый символ в строке
     */
    public void task23() {
        String str = "Гарри Гаррисон - Специалист по этике.";
        // твой код: start
        for (int i = 0; i < str.length(); i++) {//
            System.out.println(str.substring(i));
        }
        // твой код: end
    }

    /**
     * у тебя есть строка<br>
     * создай цикл который будет всегда удалять первый и последний символ в строке
     */
    public void task24() {
        String str = "Гарри Гаррисон - Специалист по этике.";
        // твой код: start
        for (int i = 0; i <= str.length() / 2; i++) {
            System.out.println(str.substring(i, (str.length() - i)));
        }
        // твой код: end
    }

    /**
     * у тебя есть строка<br>
     * создай цикл который будет всегда удалять из середины:<br>
     * 1. если количество сиволов в строке четное - 2 символа<br>
     * 2. если количество символов в строке нечетное - 1 символ
     */
    public void task25() {
        String str = "Гарри Гаррисон - Специалист по этике.Гарри Гаррисон - Специалист по этике.";
        // твой код: start

        int count = str.length();
        System.out.println(str);

        for (int i = 0; i < count / 2; i++) {
            if (str.length() % 2 == 0) {
                str = (str.substring(0, str.length() / 2 - 1) + str.substring(str.length() / 2 + 1));
            } else {
                str = (str.substring(0, str.length() / 2) + str.substring(str.length() / 2 + 1));
            }
            System.out.println(str);
        }
        System.out.println("стоп цикла");

        // твой код: end
    }

    /**
     * у тебя есть строка<br>
     * попробуй выяснить, есть ли в ней символы чисел
     */
    public void task26() {

        // твой код: start

        String str = "abc89de1f";
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                System.out.println("Есть число");
                break;
            }
        }

        // твой код: end
    }

    /**
     * у тебя есть строка<br>
     * попробуй выяснить, нет ли там других символов кроме чисел
     */
    public void task27() {
        // твой код: start
        String str = "54646.464";
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                System.out.println("Есть другие символы кроме чисел");
                break;
            }
        }
        // твой код: end
    }

    /**
     * у тебя есть строка<br>
     * попробуй выяснить, является ли содержимое строки числом (примеры: -1, 0, 1, 23.45)
     */
    public void task28() {
        String str = "1.7";
        str.replace(".", "");
        str = str.startsWith("-") ? str.substring(1) : str;
        System.out.println(Character.isDigit(str.charAt(0)) ? "Число" : "Не число");
    }

    // твой код: end


    /**
     * у тебя есть строка<br>
     * попробуй создать из нее массив символов и выведи все символы в числовом представлении
     */
    public void task29() {
        // твой код: start
        String str = "Sadovnikov";
        for (char ch : str.toCharArray()) {
            System.out.print((int) ch + " ");
        }

        // твой код: end
    }

    /**
     * у тебя есть строка<br>
     * попробуй создать из нее массив строк, разделенных по символу пробела
     */
    public void task30() {
        String str = "Гарри Гаррисон Специалист по этике";
        // твой код: start
        String[] array = str.split(" ");
        System.out.println(Arrays.toString(array));
        // твой код: end
    }

    /**
     * у тебя есть строка<br>
     * попробуй создать из нее массив строк, разделенных по символу точки)))
     */
    public void task31() {
        String str = "Гарри.Гаррисон.Специалист.по.этике";
        // твой код: start
        String[] array = str.split("\\.");
        System.out.println(Arrays.toString(array));
        // твой код: end
    }

    /**
     * у тебя есть строка<br>
     * замени все точки в строке на символ виндузятного слеша
     * попробуй создать из нее массив строк, разделенных по символу слеша
     */
    public void task32() {
        String str = "Гарри.Гаррисон.Специалист.по.этике";
        // твой код: start
        str = str.replace(".", "\\");
        System.out.println(str);
        String[] array = str.split("\\\\");
        System.out.println(Arrays.toString(array));
        // твой код: end
    }

    /**
     * у тебя есть строка<br>
     * создай из нее массив символов<br>
     * каждый символ массива переведи в нижний регистр<br>
     * избавься от пробелов и символов не принадлежащих алфавиту<br>
     * отсортируй результат
     */
    public void task33() {
        String str = "Гарри Гаррисон - Специалист по этике.";
        // твой код: start

        char[] startChar = str.toCharArray();
        char[] finishChar = new char[str.length()];

        for (int i = 0; i < startChar.length; i++) {
            startChar[i] = Character.toLowerCase(startChar[i]);
            if (Character.isLetter(startChar[i])) {
                finishChar[i] = startChar[i];
            }
        }
        Arrays.sort(finishChar);
        System.out.println(finishChar);

        // твой код: end
    }

    /**
     * тоже самое, только сортировка должна быть в обратном порядке
     */
    public void task34() {
        String str = "Гарри Гаррисон - Специалист по этике.";
        // твой код: start
        int count = 0;
        char[] startChar = str.toCharArray();

        for (int i = 0; i < startChar.length; i++) {
            startChar[i] = Character.toLowerCase(startChar[i]);
            if (Character.isLetter(startChar[i])) {
                count++;
            }
        }
        Arrays.sort(startChar);
        System.out.println(Arrays.toString(startChar));

        char[] finishchar = new char[count];

        for (int i = 0, j = 0; i < str.length() | j < count; i++) {
            if (Character.isLetter(startChar[str.length() - j - 1])) {
                finishchar[j] = startChar[str.length() - j - 1];
                j++;
            }
        }
        System.out.println(Arrays.toString(finishchar));
        // твой код: end
    }

    /**
     * у тебя есть строка<br>
     * создай из нее массив символов и отсортируй его в обратном порядке<br>
     * и поменяй местами первый и последний символы
     * и второй и предпоследний символы
     * можно использовать дополнительный массив
     */
    public void task35() {
        String str = "Гарри Гаррисон - Специалист по этике.";
        // твой код: start

        char[] startChar = str.toCharArray();
        char[] finishChar = new char[startChar.length];
        for (int i = startChar.length - 1, j = 0; i >= 0 | j < 0; i--, j++) {
            finishChar[j] = startChar[i];
        }
        System.out.println(finishChar);

        for (int i = 0; i < 2; i++) {
            char temp = finishChar[i];
            finishChar[i] = finishChar[finishChar.length - 1 - i];
            finishChar[finishChar.length - 1 - i] = temp;
        }
        System.out.println(finishChar);


        // твой код: end
    }

    /**
     * у тебя есть строка<br>
     * создай из нее массив символов и отсортируй его в обратном порядке не создавая новых массивов<br>
     * затем удали символ точки в конце строки и попробуй выполнить этот код еще раз
     */
    public void task36() {
        String str = "Гарри Гаррисон - Специалист по этике.";
        // твой код: start
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        System.out.println(ch);
        str = str.substring(0, str.length() - 1);
        char[] ch2 = str.toCharArray();
        Arrays.sort(ch2);
        System.out.println(ch2);
        // твой код: end
    }

    /**
     * ну и любимая задача всех институтов<br>
     * создай массив необходимой размерности<br>
     * заполни числами от 100 до 10000<br>
     * найди количество палиндромов в этом массиве
     */
    public void task37() {
        // твой код: start
        int[] array = new int[10000];
        Random rnd = new Random();
        int check = 0;
        StringBuilder[] stringBuilder = new StringBuilder[10000];
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(10000 - 100 + 1) + 100;
        }

        for (int digit : array) {
            String str = new StringBuilder(Integer.toString(digit)).reverse().toString();
            if (String.valueOf(digit).equals(str)) {
                check++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(check);

        // твой код: end
    }

    /**
     * создай двумерный массив размерностью 10 на 10<br>
     * заполни его таблицей умножения
     */
    public void task38() {
        // твой код: start

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%5d", (i + 1) * (j + 1));
            }
            System.out.println();
        }


        // твой код: end
    }

    /**
     * создай двумерный массив размерностью шахматной доски (64 клетки)<br>
     * заполни его согласно условию мудреца по имени Сисса<br>
     * которое он поставил перед правителем страны<br>
     * которому он продемонстрировал свое изобретение - шахматы:<br>
     * на первую клетку шахматной доски мы кладем одно зерно<br>
     * на вторую 2 зерна<br>
     * не третью 4<br>
     * на четвертую 8<br>
     * и так далее, каждый раз, переходя на новую клетку, мы удваиваем число зерен<br>
     * в крайнем случае, просто вычисли итоговое число
     */
    public void task39() {
        // твой код: start
        long[][] array = new long[9][9];
        for (int i = 1; i < 9; i++) {
            array[0][8] = 1;
            array[i][0] = array[i - 1][8];
            for (int j = 1; j < 9; j++) {
                array[i][j] = array[i][j - 1] * 2;
                System.out.printf("%20d", array[i][j]);
            }
            System.out.println();
        }

        // твой код: end
    }

    /**
     * в массиве шифровочка из центра, попробуй превратить ее в текст
     */
    public void task40() {
        int[] array = {1054, 1092, 1080, 1075, 1077, 1090, 1100, 33, 32, 1059, 32, 1090, 1077, 1073, 1103, 32, 1093, 1086, 1088, 1086, 1096, 1086, 32, 1074, 1099, 1093, 1086, 1076, 1080, 1090, 33, 32, 59, 41};
        // твой код: start
        for (int i = 0; i < array.length; i++) {
            System.out.print((char) array[i]);
        }


        // твой код: end
    }

    //--- эта задача не обязательна к выполнению, но все же попробуй подумать, как бы ты ее решил ----------------------

    /**
     * нужно соктратить строку<br>
     * ggghttggggtfffassaabbbhbhbrrrhh<br>
     * до вида:<br>
     * 3gh2t4gt3fa2s2a3bhbhb3r2h<br>
     * заменить ряд одинаковых символов на количество символов + символ<br>
     * если символ одиночный, то оставить как есть
     */
    public void task41() {
        String str = "gggghhttggggtfffaassaaffff";
        // твой код: start

        char[] chr = str.toCharArray();
        char[] chars = new char[chr.length + 2];
        for (int i = 0; i < chr.length; i++) {
            chars[i] = chr[i];
        }
        char r1;
        char r2;

        int k = 0;
        for (int i = 0; i < chars.length - 1; i++) {
            r1 = chars[i];
            r2 = chars[i + 1];

            if (r1 == r2) {
                k++;

            } else {
                if (k >= 2) {
                    System.out.print(r1 + "" + k);
                }
                k = 1;
            }
        }

        // твой код: end
    }

    //--- далее следуют задачи необязательные к выполнению т.к. не несут практической ценности -------------------------

    /**
     * создать двумерный массив и заполнить его следующим образом:
     * <p>
     * x   x
     * x   x
     * x   x
     * x   x
     * x   x
     */
    public void task42() {
        // твой код: start
        int count = 5;
        int[][] array = new int[count][count];
        for (int i = 0; i < array.length; i++) {
            System.out.print("x");
            for (int j = 0; j < array.length; j++) {
                if (j == array.length - 1) {
                    System.out.print("x");
                }
                System.out.print(" ");
            }
            System.out.println();
        }

        // твой код: end
    }

    /**
     * создать двумерный массив и заполнить его следующим образом:
     * <p>
     * xxxxx
     * <p>
     * <p>
     * <p>
     * xxxxx
     */
    public void task43() {
        // твой код: start
        int count = 5;
        int[][] array = new int[count][count];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == 0 | i == array.length - 1) {
                    System.out.print("x");
                }
            }
            System.out.println();
        }
        // твой код: end
    }

    /**
     * создать двумерный массив и заполнить его следующим образом:
     * <p>
     * xxxxx
     * x   x
     * x   x
     * x   x
     * xxxxx
     */
    public void task44() {
        // твой код: start
        int count = 5;
        int[][] array = new int[count][count];
        for (int i = 0; i < array.length; i++) {
            if (i == 0 | i == array.length - 1) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print("x");
                }
            } else {
                for (int j = 0; j < array[i].length; j++) {
                    if (j == 0 | j == array[i].length - 1) {
                        System.out.print("x");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }

        // твой код: end
    }

    /**
     * создать двумерный массив и заполнить его следующим образом:
     * <p>
     * xxxxxxxxxxx
     * x         x
     * x         x
     * x         x
     * x         x
     * xxxxxxxxxxx
     * x         x
     * x         x
     * x         x
     * x         x
     * xxxxxxxxxxx
     */
    public void task45() {
        // твой код: start
        int count = 11;
        int[][] array = new int[count][count];
        for (int i = 0; i < array.length; i++) {
            if (i == 0 | i == array.length - 1 | i == array.length / 2) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print("x");
                }
            } else {
                for (int j = 0; j < array[i].length; j++) {
                    if (j == 0 | j == array[i].length - 1) {
                        System.out.print("x");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
        // твой код: end
    }

    /**
     * создать двумерный массив и заполнить его следующим образом:
     * <p>
     * xxxxxxxxxxx
     * x    x    x
     * x    x    x
     * x    x    x
     * x    x    x
     * xxxxxxxxxxx
     * x    x    x
     * x    x    x
     * x    x    x
     * x    x    x
     * xxxxxxxxxxx
     */
    public void task46() {
        // твой код: start
        int count = 11;
        int[][] array = new int[count][count];
        for (int i = 0; i < array.length; i++) {
            if (i == 0 | i == array.length - 1 | i == array.length / 2) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print("x");
                }
            } else {
                for (int j = 0; j < array[i].length; j++) {
                    if (j == 0 | j == array[i].length - 1 | j == array.length / 2) {
                        System.out.print("x");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
        // твой код: end
    }

    /**
     * создать двумерный массив и заполнить его следующим образом:
     * <p>
     * xxxxxxxxxxx
     * xx       xx
     * x x     x x
     * x  x   x  x
     * x   x x   x
     * x    x    x
     * x   x x   x
     * x  x   x  x
     * x x     x x
     * xx       xx
     * xxxxxxxxxxx
     */
    public void task47() {
        // твой код: start
        int count = 11;
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (i == 0 || i == count - 1 || j == 0 || j == count - 1) {
                    System.out.print("x");
                } else if (i == j || j == count - 1 - i) {
                    System.out.print("x");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }

        // твой код: end
    }

    /**
     * создать двумерный массив и заполнить его следующим образом:
     * <p>
     * xxxxxxxxxxx
     * xx   x   xx
     * x x  x  x x
     * x  x x x  x
     * x   xxx   x
     * xxxxxxxxxxx
     * x   xxx   x
     * x  x x x  x
     * x x  x  x x
     * xx   x   xx
     * xxxxxxxxxxx
     */
    public void task48() {
        // твой код: start
        int count = 11;
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (i == 0 || i == count - 1 || j == 0 || j == count - 1 || j == count / 2 || i == count / 2) {
                    System.out.print("x");
                } else if (i == j || j == count - 1 - i) {
                    System.out.print("x");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        // твой код: end
    }
}
