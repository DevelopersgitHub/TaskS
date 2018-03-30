package task1;
import java.util.Scanner;

public class Task1 {
static int NOD(int x, int y)
{
    if (x != 0)
        return NOD(y%x,x);
    else
        return y;
}
 
static int NOK(int x, int y)
{
    return (x/NOD(x,y))*y;
}
public static void main(String[] args) {
    Scanner scanner = new Scanner(System. in );
    int x,y;
    System.out.print("Введите числа: ");
    x = scanner.nextInt();
    y = scanner.nextInt();
    System.out.println("НОД этих чисел = " + NOD(x,y));
    System.out.println("НОК этих чисел = " + NOK(x,y));
}
}
