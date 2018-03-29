package task1;
import java.util.Scanner;

public class Task1 {

public static void main(String[] args) {
    //координаты отрезков
    Scanner scanner = new Scanner(System. in );
    int X11, Y11, X12, Y12;
    int X21, Y21, X22, Y22;
    System.out.print("Введите координаты первого отрезка: ");
    X11 = scanner.nextInt();
    Y11 = scanner.nextInt();
    X12 = scanner.nextInt();
    Y12 = scanner.nextInt();
    System.out.print("Введите координаты второго отрезка: ");
    X21 = scanner.nextInt();
    Y21 = scanner.nextInt();
    X22 = scanner.nextInt();
    Y22 = scanner.nextInt();
    //параметры отрезков
    int a1 = Y11 - Y12;	
    int b1 = X12 - X11;
    int a2 = Y21 - Y22;	
    int b2 = X22 - X21;
    //координаты точки пересечения
    int d = a1 * b2 - a2 * b1;
    if ( d != 0 ) {	
    int c1 = Y12 * X11 - X12 * Y11; 
    int c2 = Y22 * X21 - X22 * Y21;
    int xi = (b1 * c2 - b2 * c1) / d;
    int yi = (a2 * c1 - a1 * c2) / d; 
    System.out.println("Точка пересечения по оси X: "+xi+" по оси Y: "+yi);
    }
    else{
        System.out.println("Отрезки не пересекаются!");
    }
}
}
