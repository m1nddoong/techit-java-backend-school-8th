package d6.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class Main {
    // 두개의 정수를 받아 나누어서 정수 결과를 반한하는 정적 메서드 'divide'
    public static int divide(int a, int b) {
        return a / b;
    }

    public static double divideToDouble(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by Zero");
        }
        return (double) a / b;
    }


    public static void readFileContents(String filename) {
        File file = new File(filename);
        // checkedException 은
        // 어떻게든 코드 단위에서 예외처리를 선으로 해줘야 한다.
        try {
            Scanner scanner = new Scanner(file); //무조건 예외를 처리해 줘야 함
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        }
    }

    // 컴퓨터에게 나 정상적으로 종료 못했어 하고 알려주는 것
    public static void readFileThrows(String filename) throws FileNotFoundException {
        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer a = 10;
        // Integer b = null;
        Integer b = 0;
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
        // 예외 발생 가능성 농후
        // System.out.println(divide(a, b));
        // System.out.println("Bye!");

        try {
            // 예외가 발생할 수 있을 것 같은 곳
//            a *= 2;
//            b *= 3;
            System.out.println(divideToDouble(a, b));
            // System.out.println(divide(a, b));

        }
        catch (ArithmeticException | NullPointerException e) {
            // 예외가 발생하면 실행되는 곳
            System.out.println(e.getMessage());
            System.out.println("Sorry, can't do that!");
            System.out.println(String.format(
                    "Sorry, this happend: %s", e.getMessage()  // 어떤 예외인지 출력
            ));
        }
//        catch (NullPointerException e) {
//            // 또다른 예외가 발생하면 실행되는 곳
//            System.out.println("NPE!!!");
//        }
        finally {
            // 예외가 발생해서 catch가 실행되든 안되는 상관없이 실행되는 곳
            System.out.println("Bye!");
            // 원상 복구 시켜주기!
//            a /= 2;
//            b /= 3;
        }

        System.out.println(a);
        System.out.println(b);

        readFileContents(".gitignore");
        readFileContents("file-not-exist");

        try {
            readFileThrows("file-not-exist"); // 던지기ㅏ만 하고 처리는 직접한다는 느낌인건가?
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        }
    }

}
