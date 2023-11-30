package d8.file;

import java.io.CharArrayReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileMain {
//    public static void main(String[] args) {
//        //FileNotFoundException 의 상위 버전인 IOException
//        // 뭔짓을 해도 개발자가 해결해야 하는 예외가 ~~~ 예외라고 헀었다 (기억...)
//        try {
//            // 절대 경로, 상대경로 다 지원한다.
//            // 프로젝트 기준 최상위 폴더에 만들면 Intellij에서 바로 사용 가능
//            FileReader reader = new FileReader("hello");
//            int character;
//
//            // 알고리즘에서 무지막지하게 많이 쓸 것
//            // 여러 데이터를 모아서 문자열을 만들어주는 클래스
//            StringBuilder line = new StringBuilder();
//
//            // FileReader.read()는 한글자씩 읽는다.
//            // -1 은 파일을 다 읽었다는 뜻
//            while ((character = reader.read()) != -1) {
//                System.out.println((char) character);
//                line.append((char) character);
//            }
//            System.out.println(line.toString());
//
//            // 위와 똑같다.
//            String newLine = line.toString();
//            String[] lines = newLine.split("\n");
//            for (String oneLine : lines) {
//                System.out.println(oneLine);
//            }
//
//            reader.close(); // 예외가 발생하더라도 닫아줘야하는데
//            // reader.close 는 catch, fianlly 에도 넣지 못함
//            // 왜냐하면 try 에서 FileReader 가 선언되어 있기 때문에
//
//        } catch (IOException ignored) {
//            System.out.println("error");
//        } finally {
//
//        }
//    }
    public static void main(String[] args) {
        // try-wtih-resources 라고 하는 문법이다..!
        // AutoClosable 이라는 인터페이스를 구현하면 사용 가능 -> 그렇구나~
        // 이전 예시와는 다르게 try 안에 FileReader 를 선언하게 하고 오류가 없게 함
        List<Character> readChars = new ArrayList<>();
        try (FileReader reader = new FileReader("hello")) {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
                readChars.add((char) character);
            }
        } catch (IOException ignored) {
            System.out.println("파일 읽기 에러");
        }

        try (FileWriter writer = new FileWriter("output", true)) {
            for (Character character : readChars) {
                writer.write(character);
            }
        } catch (IOException ignored) {}
    }
}
