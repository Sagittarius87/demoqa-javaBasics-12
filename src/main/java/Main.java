public class Main {
    public static void main(String[] args) {
        // примитивные типы
        char variableChar = '@';
        boolean variableBoolean = false;
        byte variableByte1 = -128;
        byte variableByte2 = 127;
        short variableShort1 = -32768;
        short variableShort2 = 32767;
        int variableInt1 = -2147483648;
        int variableInt2 = 2147483647;
        long variableLong1 = -922337203; // –9 223 372 036 854 775 808
        long variableLong2 = 922337203; // 9 223 372 036 854 775 807
        float variableFloat = 8.5F; // от -3.4*10 в 38 до 3.4*10 в 38
        double variableDouble = 8.5; // от ±4.9*10 в -324 до ±1.8*10 в 308

        long a = 123L; // литерал
        byte b = (byte) 12345; // нисходящее преобразование
        float c = 1.2F;
        double d = 1.2D;

        // ссылочные типы данных
        String str = "Hello World!";

        // массив
        char[] array1 = new char[3];
        char[] array2 = new char[] {'w'};
        char[][] array3 = new char[][] {{'a'},{'s'}};

        // методы
        int result1 = getMaxIntNumber();
        getMaxIntNumber1();

        // функции
        int result2 = summ(2, 2);

        // арифметические операторы
        int number1 = 1,
            number2 = 1,
            numberResult = 0;
        // =
        number1 = 5;
        System.out.println(number1);
        // +
        numberResult = number1 + number2;
        System.out.println(numberResult);
        // +=
        numberResult += 1;
        System.out.println(numberResult);
        // -
        numberResult = number1 - number2;
        System.out.println(numberResult);
        // -=
        numberResult -= 1;
        System.out.println(numberResult);
        // *
        numberResult = number1 * number2;
        System.out.println(numberResult);
        // /
        numberResult = number1 / number2;
        System.out.println(numberResult);
        // %
        numberResult = number1 % number2;
        System.out.println(numberResult);

        // логические операторы
        boolean variableBoolean1 = true;
        boolean variableBoolean2 = false;
        // &
        System.out.println(variableBoolean1 & variableBoolean2);
        // &&
        System.out.println(variableBoolean1 && variableBoolean2);
        // |
        System.out.println(variableBoolean1 | variableBoolean2);
        // ||
        System.out.println(variableBoolean1 || variableBoolean2);
        // !
        System.out.println(!variableBoolean1);
        // !=
        System.out.println(variableBoolean1 != variableBoolean2);
        // ==
        System.out.println(variableBoolean1 == variableBoolean2);
        // equals
        System.out.println(str.equals("aaaa"));
        // instanceof
        System.out.println(str instanceof String);
        // >
        System.out.println(variableByte1 > variableByte2);
        // >=
        System.out.println(variableByte1 >= variableByte2);
        // <
        System.out.println(variableByte1 < variableByte2);
        // <=
        System.out.println(variableByte1 <= variableByte2);

        // управляющие конструкции
        if (variableBoolean1) {
            System.out.println("Hello World!");
        } else if (variableBoolean) {
            System.out.println("Hello Hello World!");
        } else {
            System.out.println("Hello World");
        }

        switch (variableInt1) {
            case 1:
                System.out.println("variable = 1");
                break;
            case 2:
                System.out.println("variable = 2");
                break;
            default:
                System.out.println("variable = 0");
                break;
        }
        // тернанрный оператор
        String strResult = variableInt1 > variableInt2 ? "Yes" : "No";
        System.out.println(strResult);


        System.out.println(variableChar);
        System.out.println(variableBoolean);
        System.out.println(variableByte1);
        System.out.println(variableByte2);
        System.out.println(variableShort1);
        System.out.println(variableShort2);
        System.out.println(variableInt1);
        System.out.println(variableInt2);
        System.out.println(variableLong1);
        System.out.println(variableLong2);
        System.out.println(variableFloat);
        System.out.println(variableDouble);
        System.out.println(str);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(numberResult);
    }

    // методы
    static int getMaxIntNumber() {
        return Integer.MAX_VALUE;
    }
    static void getMaxIntNumber1() {
        System.out.println(Integer.MAX_VALUE);
    }

    // функции
    static int summ(int a, int b) {
        return a + b;
    }
}
