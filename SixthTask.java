package task1;
import java.util.Scanner;

public class Task1 {
    
public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str=scan.next();
        System.out.println(str.replaceAll("[^a-zA-Z!?.-]", ""));
    }
}
