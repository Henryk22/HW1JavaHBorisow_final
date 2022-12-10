
// Студент Heinrich Borisow
// установил JDK 11, 17.

//Задача 3
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//
        int aa;
        aa = 272;
        char ch;
        ch = 'p';
        byte b;
        b = 7;
        short c;
        c = 32766;
        long d;
        d = 135789;
        float f;
        f = 3.4e+38f;
        double e;
        e = 1.7e+308;
        boolean yes;
        yes = false;
        //Целые числа - byte, short, int, long
        //Числа с плавающей точкой (иначе вещественные) - float, double
        //Логический - boolean 22
        //Символьный - char
        System.out.println("int a =" + aa);
        System.out.println("int b = " + b);
        System.out.println("char ch = " + ch);
        System.out.println("short c = " + c);
        System.out.println("long d = " + d);
        System.out.println("flot f = " + f);
        System.out.println("double e =" + e);
        System.out.println("booleam yes = " + yes);

        // Задача 4 * со звездочкой. Этот вариант делали с доцентом на практике. Сам бы долго думал.
        int a = 543;
        String sym = String.valueOf(a);
        System.out.println(sym);
        //4int a1 = a%100;
        System.out.println("Первая цифра " + a/100);
        System.out.println("Вторая цифра " + a/10%10); //делим на 10, берем целую часть, делим на 10, берем остаток
        System.out.println("Третья цифра " + a%10);//делим на 10 и берем остаток


        //Задача №1 из дополнительных
        Scanner superScan = new Scanner(System.in);
        System.out.println("Input one number");
        double A = superScan.nextDouble();
        System.out.println("Input one more number");
        double B = superScan.nextDouble();
        double C = A+B;
        double D = A-B;
        double E = A*B;
        double F = A/B;
        System.out.println("Your number is =" + A);
        System.out.println("Your second number is =" + B);
        System.out.println("Summe =" + C);
        System.out.println("Subtrakt =" + D);
        System.out.println("Multi =" + E);
        System.out.println("Dividiren =" + F);

            }
}