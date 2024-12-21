import com.sun.jdi.Value;

import java.util.Scanner;

public class Scratch {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        System.out.println("введите первое число");
//        int a=scanner.nextInt();
//        System.out.println("введите  знак");
//        String value = scanner.next();
//        System.out.println("введите второе число");
//        int a = scanner.nextInt();
//  int kall=0;
// for (int i = 1; i <=10; i++) {
//     int hell = g *i;
//     System.out.println(g +"*" +i + "=" + hell);
//
// }
//        int number = 0;
//        if(a>0) {
//            a =  scanner.nextInt();
//            number+=a;
//        } else if (a<0) {
//            System.out.println(" конец " + number);
//        }
        Scanner scanner = new Scanner(System.in);
int a;
int result = 0;
        for (int i = 1; i>-1; i++) {
         a= scanner.nextInt();
         if(a<0){
             break;
         }
         result += a;
        }
        System.out.println(result);

//do {
//    a = scanner.nextInt();
//    if(a>0){
//        result += a;
//    }
//} while (a>0);
//System.out.println(result);
//        if (value.equals("+")) {
//            System.out.println(  g + a);
//        } else if (value.equals("-")) {
//            System.out.println(g - a);
//        } else if (value.equals("*")) {
//            System.out.println( g * a);
//
//        } else if (value.equals("/")) {
//            if (a == 0) {
//                System.out.println(" на ноль делить нельзя");
//            }
//            System.out.println( g / a);
//        } else {
//            System.out.println("где то ошибка");
//        }
    }
}
