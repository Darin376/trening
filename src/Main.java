import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//            System.out.println("Hello");
//            String user= "Pavel";
//            String bigUser = "Oleg";
//            System.out.println(bigUser + user + " Pavel BigBoss");
//        }

//        if (n > 0) {
//            for (int i = (number - 1); i > 1; i--) {
//                number = number * i;
//            }
//        } else if (n == 0) {
//            number = 1;
//        } else {
//            return;
//        }
//        System.out.println(number);
//        for (int i = 2; i < number+1;i+=2) {
//           if(i>=10) {
//               System.out.println(i);
//           }
//        }
//        sc.close();
//        while (number < 25) {
//            System.out.println("sss");
//        }
//        do {
//            System.out.println("bb")
//        }
//        while (number < 25) ;
//        {
//            System.out.println("ss");
//        }do {
//
//        }
//
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int number = n;
//        int v = 10;
//        switch (number) {
//            case 1:
//                System.out.println("1");
//                break;
//            case 2:
//                System.out.println("2");
//                break;
//            default:
//                System.out.println("vinos");
//        }
        int namber = 0;
        while (namber<n) {
            namber++;
            System.out.println(" "+namber+ "");
        }
    }
}